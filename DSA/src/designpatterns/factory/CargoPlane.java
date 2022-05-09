package designpatterns.factory;

public class CargoPlane implements ITransport {

	@Override
	public void move() {
		System.out.println("Cargo plane flies in sky.");
	}

}
