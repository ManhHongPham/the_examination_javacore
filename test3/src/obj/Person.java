package obj;

public class Person {
	// constant
	public static final String FIRSTNAME = "no firstname";
	public static final String LASTNAME = "no lastname";
	public static final Address ADDRESS = new Address();
	public static final byte AGE = 0;

	// Opject's properties
	private String firstName;
	private String lastName;
	private Address address;
	private byte age;

	// constructors
	public Person(String firstName, String lastName, Address address, byte age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.age = age;
	}

	public Person() {
		this(Person.FIRSTNAME, Person.LASTNAME, Person.ADDRESS, Person.AGE);
	}

	// getters and setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public String getFileLine() {
		return firstName + "," + lastName + "," + address.getFileLine() + "," + age;
	}

	public void parse(String line) {
		String[] param = line.split(","); // cắt theo dấu ,
		// gán lại các vị trí

		firstName = param[1];
		lastName = param[2];
		Address addresss = new Address(param[3]);
		address = addresss;
		age = Byte.parseByte(param[4]);
	}

	public void input() {
		System.out.print("nhập tên: ");
		firstName = utilities.Utilities.sc.nextLine();

		System.out.print("nhập họ: ");
		lastName = utilities.Utilities.sc.nextLine();

		System.out.print("nhập địa chỉ: ");
		address = new Address(utilities.Utilities.sc.nextLine());

		System.out.print("nhập tuổi: ");
		age = Byte.parseByte(utilities.Utilities.sc.nextLine());
	}

	@Override
	public String toString() {
		return "firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", age=" + age;
	}
}
