package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

import obj.Student;

public class IOFile {

	public static void savefile(ArrayList<Student> students) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("danhsach.txt");
			// luu data
			for (Student student : students) {

				String line = student.getFileLine();

				// muốn lưu theo bãng mã utf-8
				byte[] b = line.getBytes("utf8");

				// save
				fos.write(b);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public static ArrayList<Student> readFile(String fileName) {
		FileInputStream fis = null; // khai báo để đọc mã nhị phân
		InputStreamReader reader = null; //
		BufferedReader bufferedReader = null;

		ArrayList<Student> list = new ArrayList<>();

		try {
			fis = new FileInputStream(fileName);// nhận các byte đầu vào từ file trong hệ thống

			reader = new InputStreamReader(fis, StandardCharsets.UTF_8);// đọc các byte và giải mã thành ký tự theo bộ mã utf-8

			// Tạo luồng đầu vào ký tự đệm sử dụng bộ đệm đầu vào có kích thước mặc định.
			bufferedReader = new BufferedReader(reader);

			String line = null;
			while ((line = bufferedReader.readLine()) != null) { // nếu = null là đọc về cuối file
				if (line.isEmpty()) { // trong trường hợp dòng rỗng
					continue;
				}
				Student student = new Student();
				student.parse(line);
				list.add(student);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (bufferedReader != null) {
				try {
					bufferedReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return list;
	}
}
