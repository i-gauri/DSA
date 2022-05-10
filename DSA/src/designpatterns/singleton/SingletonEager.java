package designpatterns.singleton;

public class SingletonEager {

	private final static SingletonEager instance;
	
	static {
		instance = new SingletonEager();
	}
	
	private SingletonEager () {}
	
	public static SingletonEager getInstance() {
		return instance;
	}
}
