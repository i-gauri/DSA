package designpatterns.iterator;

public class Main {

	public static void main(String[] args) {
		IIterable personRepo = new PersonRepository();
		IIterator personIterator = personRepo.getIterator();
		while(personIterator.hasNext()) {
			System.out.println(personIterator.next());
		}
	}

}
