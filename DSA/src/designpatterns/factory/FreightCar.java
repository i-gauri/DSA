package designpatterns.factory;

public class FreightCar implements ITransport {

	@Override
	public void move() {
		System.out.println("Freight car runs on rails.");
	}

}
