package com.mapper.main;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import com.mapper.exceptions.MapperException;

public class Mapper {
	public <S, T> void map(S source, T target) throws MapperException, IllegalArgumentException, IllegalAccessException {
		if(source == null) {
			throw new MapperException("Source object is null.");
		}
		
		if(target == null) {
			throw new MapperException("Target object is null.");
		}
		
		Class<?> sourceClass = source.getClass();
		Class<?> targetClass = target.getClass();
		
		Field[] sourceFields = sourceClass.getDeclaredFields();
		Field[] targetFields = targetClass.getDeclaredFields();
		
		Map<String, Field> sourcetFieldMap = new HashMap<>();
		
		for(Field field: sourceFields) {
			sourcetFieldMap.put(field.getName(), field);
		}
		
		for(Field targetField: targetFields) {
			Field sourceField = sourcetFieldMap.get(targetField.getName());
			if(sourceField != null) {
				if(!sourceField.isAccessible()) {
					sourceField.setAccessible(true);
				}
				if(!targetField.isAccessible()) {
					targetField.setAccessible(true);
				}
				
				if(targetField.getType().equals(sourceField.getType())) {
					targetField.set(target, sourceField.get(source));
				}
			}
		}
	}
}
