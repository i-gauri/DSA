package designpatterns.factory;

public class Truck implements ITransport {

	@Override
	public void move() {
		System.out.println("Truck moves on road.");
	}

}
