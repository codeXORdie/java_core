package designtechniques;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentOrders {
	public static void showAll(List<Student> ls) {
		for(Student s : ls)
			System.out.println(s);
		System.out.println("=========================");
	}
	
	
	public static void main(String[] args) {
		List<Student> ls = new ArrayList<>(Arrays.asList(
				new Student("Jim Green", 2.4F, 189, 400),
				new Student("Amily White", 3.5F, 170, 500),
				new Student("Amber Black", 3.2F, 175, 200),
				new Student("James McVoi", 3.5F, 192, 700),
				new Student("Jim Green", 3.2F, 178, 234),
				new Student("Amber Black", 3.6F, 170, 134),
				new Student("Alex Red", 4.2F, 188, 204),
				new Student("Lames White", 3.3F, 185, 300),
				new Student("Anie Loyd", 4.0F, 172, 150),
				new Student("Jennifer Swift", 3.9F, 168, 400)
				));
		ls.sort(Student.getGradeComparator());
		showAll(ls);
		ls.sort(Student.getNameComparator());
		showAll(ls);
	}

}
