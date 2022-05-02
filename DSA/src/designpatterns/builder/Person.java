package designpatterns.builder;

public class Person {
	private final String firstName;
	private final String lastName;
	private final Gender gender;
	private final String email;
	private final String address;
	private final Integer age;
		
	private Person (PersonBuilder person) {
		this.firstName = person.firstName;
		this.lastName  = person.lastName;
		this.address   = person.address;
		this.gender    = person.gender;
		this.email     = person.email;
		this.age       = person.age;
	}

	public String getFirstName () {
		return firstName;
	}

	public String getLastName () {
		return lastName;
	}

	public Gender getGender () {
		return gender;
	}

	public String getEmail () {
		return email;
	}

	public String getAddress () {
		return address;
	}

	public Integer getAge () {
		return age;
	}
	
	public static PersonBuilder builder () {
		return new PersonBuilder();
	}
		
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + ", email=" + email
				+ ", address=" + address + ", age=" + age + "]";
	}

	public static class PersonBuilder {
		private String firstName;
		private String lastName;
		private Gender gender;
		private String email;
		private String address;
		private Integer age;
		
		public PersonBuilder firstName (String firstName) {
			this.firstName = firstName;
			return this;
		}
		
		public PersonBuilder lastName (String lastName) {
			this.lastName = lastName;
			return this;
		}
		
		public PersonBuilder gender (Gender gender) {
			this.gender = gender;
			return this;
		}
		
		public PersonBuilder email (String email) {
			this.email = email;
			return this;
		}
		
		public PersonBuilder address (String address) {
			this.address = address;
			return this;
		}
		
		public PersonBuilder age (Integer age) {
			this.age = age;
			return this;
		}
		
		public Person build () {
			//Can also do some kind of validation here, before return;
			return new Person(this);
		}
	}
}
