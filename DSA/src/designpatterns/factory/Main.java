package designpatterns.factory;

public class Main {

	public static void main(String[] args) {
		try {
			ITransport truck = TransportFactory.getTransport(Transport.TRUCK);
			truck.move();
			
			ITransport plane = TransportFactory.getTransport(Transport.CARGOPLANE);
			plane.move();
		}
		catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
