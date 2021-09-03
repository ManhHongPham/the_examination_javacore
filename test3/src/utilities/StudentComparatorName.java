package utilities;

import java.util.Comparator;

import obj.Student;

public class StudentComparatorName implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getFirstName().compareTo(o2.getFirstName());
	}
}
