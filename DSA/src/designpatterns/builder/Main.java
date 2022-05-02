package designpatterns.builder;

public class Main {

	public static void main(String[] args) {
		Person me = Person.builder()
						 .firstName("Anshuman")
						 .lastName("Gupta")
						 .age(25)
						 .gender(Gender.MALE)
						 .email("anshumang@cdac.in")
						 .address("Pune")
						 .build();

		System.out.println(me);
	}
}
