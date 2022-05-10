package designpatterns.singleton;

public class Main {
	public static void main(String[] args) {
		SingletonEager instance1 = SingletonEager.getInstance();
		SingletonEager instance2 = SingletonEager.getInstance();
		
		System.out.println(instance1 == instance2);
		
		SingletonLazy instance3 = SingletonLazy.getInstance();
		SingletonLazy instance4 = SingletonLazy.getInstance();
		
		System.out.println(instance3 == instance4);
	}
}
