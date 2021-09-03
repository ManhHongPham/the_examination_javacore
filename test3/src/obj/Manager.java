package obj;

import java.util.ArrayList;

public interface Manager {

	public boolean addStudent(Person p);

	public boolean editStudent(Person p);

	public boolean delStudent(Person p);

	public ArrayList<Student> searchStudent(Person[] list, String name);

	public ArrayList<Student> searchStudent(Person[] list, Address addr);

	public ArrayList<Student> addStudent(String fileName);

	public ArrayList<Student> editStudent(String fileName);

	public ArrayList<Student> delStudent(String fileName);
}
