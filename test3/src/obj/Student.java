package obj;

public class Student extends Person {
	// constant
	public static final int ID = 0;
	public static final float GPA = 0;

	// Opject's properties
	private int id;
	private float gpa;

	// constructor
	public Student(String firstName, String lastName, Address address, byte age, int id, float gpa) {
		super(firstName, lastName, address, age);
		this.id = id;
		this.gpa = gpa;
	}

	public Student() {
		this(Student.FIRSTNAME, Student.LASTNAME, Student.ADDRESS, Student.AGE, Student.ID, Student.GPA);
	}

	// getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getGpa() {
		return gpa;
	}

	public void setGpa(float gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student:" + super.toString() + ", id=" + id + ", gpa=" + gpa + "\n";
	}
	public void parse(String line) {
		String[] param = line.split(","); // cắt theo dấu ,

		// trong trường hợp lỗi thiếu thông tin mising
		try {
			id = Integer.parseInt(param[0]);
			super.parse(line);
			gpa = Float.parseFloat(param[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("file không chính xác");
		} finally {
		}
	}

	public void input() {
		try {	
			System.out.print("nhập id student: ");
			id = Integer.parseInt(utilities.Utilities.sc.nextLine());
			super.input();
			System.out.print("nhập điểm GPA : ");
			gpa = Float.parseFloat(utilities.Utilities.sc.nextLine());
		} catch (Exception e) {
			System.out.println("nhập k chính xác");
		}
	}

	public String getFileLine() {
		return id + "," + super.getFileLine() + "," + gpa + "\n";
	}

	
}
