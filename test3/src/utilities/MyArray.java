package utilities;

import java.util.ArrayList;
import java.util.Collections;


import obj.Address;
import obj.Student;

public class MyArray {

	/**
	 * phương thức lấy giá trị ngẫu nhiên và trả về giá trị MAX_VALUE
	 * 
	 * @param MAX_VALUE
	 * @return
	 */
	public static int randomValue(int MAX_VALUE) {
		return (int) (Math.random() * MAX_VALUE);
	}

	/**
	 * phương thức sinh ngẫu nhiên một mảng đối tượng
	 * 
	 * @param n
	 * @return
	 */
	public static Student[] generateStudent(int n) {

		// khai báo danh sách, sẽ tham chiếu đến kiểu dữ liệu là null
		Student[] list = new Student[n];

		// khai bao một dánh sách tên
		String[] firstName = { "bình", "chinh", "dương", "khánh", "hòa", "hoài", "thu", "hoa", "huy", "anh", "ngọc",
				"lan", "ngân", "mai", "thủy", "thúy", "thùy", "linh", "huy", "thư", "ngọc", "yến", "quang ", "anh", };

		String[] lastName = { "hoàng", "nguyễn", "phạm", "đỗ", "bùi", "mai", "giang" };

		// khai bao danh sach address
		Address[] addresses = { new Address("Bac Ninh"), new Address("Hai Phong"), new Address("HaiDuong"),
				new Address("HungYen"), new Address("Hanoi") };

		// sinh dữ liệu cho các phần tử
		int index;
		for (int i = 0; i < list.length; i++) {

			// cấp phát bộ nhớ cho phần tử mảng
			list[i] = new Student();

			// sinh ngẫu nhiên id
			index = 2018000000 + i;
			list[i].setId(index);

			// sinh ngẫu nhiên điểm
			float gpa = 1 + randomValue(4);
			list[i].setGpa((float) gpa);

			// sinh ngẫu nhiên tên
			index = randomValue(firstName.length);
			list[i].setFirstName(firstName[index]);

			// sinh ngẫu nhiên họ
			index = randomValue(lastName.length);
			list[i].setLastName(lastName[index]);

			// sinh ngẫu nhiên địa chỉ
			index = randomValue(addresses.length);
			list[i].setAddress(addresses[index]);

			// sinh ngẫu nhiên tuổi
			index = 18 + randomValue(5);
			list[i].setAge((byte) index);
		}
		return list;
	}

	public static void printStudent(ArrayList<Student> Student) {
		Student p;
		for (int i = 0; i < Student.size(); i++) {
			p = (Student) Student.get(i);
			System.out.println(p.toString());
		}
	}

	public static ArrayList<Student> sortedByName(Student[] list) {

		// chuyển mảng list sang tạp hợp collections
		ArrayList<Student> tmp = new ArrayList<>();
		
		// sap cheosp phần tử
		Collections.addAll(tmp, list);

		// sắp xêp
		Collections.sort(tmp, new StudentComparatorName());

		return tmp;
	}

}
