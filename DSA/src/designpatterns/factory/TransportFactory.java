package designpatterns.factory;

public class TransportFactory {
	public static ITransport getTransport (Transport transport) throws Exception {
		switch (transport) {
			case TRUCK:
				return new Truck();
			case FREIGHTCAR:
				return new FreightCar();
			case CARGOSHIP:
				return new CargoShip();
			case CARGOPLANE:
				return new CargoPlane();
			default:
				throw new Exception("Unable to ship your package.");
		}
	}
}
