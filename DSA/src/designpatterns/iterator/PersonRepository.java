package designpatterns.iterator;

public class PersonRepository implements IIterable {
	
	private String[] employees;
	
	public PersonRepository() {
		employees = new String[]{"Anshuman", "Gauri", "Akshata", "Aditya", "Upen"};
	}

	@Override
	public IIterator getIterator() {
		return new PersonIterator();
	}

	private class PersonIterator implements IIterator {
		
		private int index;
		
		public PersonIterator() {
			this.index = 0;
		}

		@Override
		public boolean hasNext() {
			return this.index < employees.length;
		}

		@Override
		public Object next() {
			return this.hasNext() ? employees[index++] : null;
		}
	}
}
