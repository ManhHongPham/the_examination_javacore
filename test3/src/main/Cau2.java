package main;

import io.IOFile;
import obj.ManageStudent;

public class Cau2 {

	public static void main(String[] args) {
		IOFile.readFile("danhsach.txt");
		ManageStudent ms = new ManageStudent();
		int chon;
		do {
			System.out.println("------Chuong Trinh Quan Ly Sinh Vien------");
			System.out.println("\t1. hiển thị thông tin");
			System.out.println("\t2. thêm sinh viên");
			System.out.println("\t3. sửa sinh viên");
			System.out.println("\t4. xóa sinh viên");
			System.out.println("\t0. dong chuong trinh");
			System.out.print("---chon chuc nang: ");
			chon = Integer.parseInt(utilities.Utilities.sc.nextLine());
			switch (chon) {
			case 1:
				System.out.print(IOFile.readFile("danhsach.txt"));
				break;
			case 2:
				ms.addStudent("danhsach.txt");
				break;
			case 3:
				ms.editStudent("danhsach.txt");
				break;
			case 4:
				ms.delStudent("danhsach.txt");
				break;
			case 0:
				System.out.println("Da dong chuong trinh");
				System.exit(0);
			default:
				System.out.println("chuc nang khong phu hop");
			}
		} while (true);
	}
}
