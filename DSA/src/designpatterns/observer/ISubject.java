package designpatterns.observer;

public interface ISubject {
	public void register(IObserver observer);
	public void unregister(IObserver observer);
	public void updateAll();
}
