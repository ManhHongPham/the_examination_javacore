package obj;

import java.util.ArrayList;

import io.IOFile;

public class ManageStudent implements Manager {
	
	static ArrayList<Student> list = new ArrayList<>();

	@Override
	public boolean addStudent(Person p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean editStudent(Person p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delStudent(Person p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Student> searchStudent(Person[] list, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Student> searchStudent(Person[] list, Address addr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Student> addStudent(String fileName) {
		list = IOFile.readFile(fileName);
		System.out.print("\nnhập số lượng sinh viên cần thêm: ");
		int n = Integer.parseInt(utilities.Utilities.sc.nextLine());
		for (int i = 0; i < n; i++) {
			System.out.println("nhập thông tin sinh viên thứ " + i);
			Student st = new Student();
			st.input();
			if (utilities.Utilities.checkNewID(list, st.getId()) == 1) {
				break;
			} else {
				list.add(st);
			}
		}

		io.IOFile.savefile(list);
		return list;
	}

	@Override
	public ArrayList<Student> editStudent(String fileName) {
		list = IOFile.readFile(fileName);
		System.out.print("\nnhập mã sv cần sửa: ");
		int id = Integer.parseInt(utilities.Utilities.sc.nextLine());
		
		for (Student student : list) {
			if (student.getId() == id) {
				student.input();
				break;
			}
		}
		io.IOFile.savefile(list);
		return list;
	}

	@Override
	public ArrayList<Student> delStudent(String fileName) {
		list = IOFile.readFile(fileName);
		System.out.print("\nnhập mã sv cần xóa: ");
		int id = Integer.parseInt(utilities.Utilities.sc.nextLine());

		for (Student student : list) {
			if (student.getId() == id) {
				list.remove(student);
				break;
			}
		}
		io.IOFile.savefile(list);
		return list;
	}
}
