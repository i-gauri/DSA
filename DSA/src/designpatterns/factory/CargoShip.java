package designpatterns.factory;

public class CargoShip implements ITransport {

	@Override
	public void move() {
		System.out.println("Cargo ship sails on water.");
	}

}
