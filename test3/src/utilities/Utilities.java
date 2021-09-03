package utilities;

import java.util.ArrayList;
import java.util.Scanner;
import obj.Student;

public class Utilities {

	public static Scanner sc = new Scanner(System.in);

	public static int checkNewID(ArrayList<Student> lstSinhVien, int id) {
		int dem = 0;
		for (int i = 0; i < lstSinhVien.size(); i++) {
			if (lstSinhVien.get(i).getId() == id) {
				dem++;
			}
		}
		if (dem != 0) {
			System.out.println("\nLỖI: trùng mã sinh viên");
			return 1;
		} else
			return 0;
	}
}
