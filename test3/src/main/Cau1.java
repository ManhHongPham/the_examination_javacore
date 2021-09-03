package main;

import java.util.ArrayList;

import obj.Student;
import utilities.MyArray;

import io.IOFile;

public class Cau1 {
	public static void main(String[] args) {

		Student[] list = MyArray.generateStudent(30);

		ArrayList<Student> results = MyArray.sortedByName(list);

		MyArray.printStudent(results);

		IOFile.savefile(results);
	}
}
