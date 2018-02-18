package designtechniques;

import java.util.Comparator;

public class Student {
	
	private String name;
	private float grade;
	private int height;
	private int debt;
	
	public Student(String name, float grade, int height, int debt) {
		this.name = name;
		this.grade = grade;
		this.height = height;
		this.debt = debt;
	}
	
	public String getName() {
		return name;
	}
	
	public float getGrade() {
		return grade;
	}
	
	public int geetHeight() {
		return height;
	}
	
	public int getDebt() {
		return debt;
	}
	
	@Override
	public String toString() {
		return "Student name: " + name + "; grade: " + grade +
				"; height: " + height + "; debt: " + debt;
	}
	
	//create 2 static field
	//each of them holds an instance of 1 of the 2 comparators
	//singleton pattern
	private static final Comparator<Student> gradeComparator = new GradeComparator();
	private static final Comparator<Student> nameComparator = new NameComparator();
	
	//static factory method for GradeComparator
	public static Comparator<Student> getGradeComparator(){
		return gradeComparator;
	}
	
	//nested inner class of comparator
	private static class GradeComparator implements Comparator<Student>{
		@Override
		public int compare(Student s1, Student s2) {
			return Float.compare(s2.getGrade(), s1.getGrade());
		}
	}
	
	//static factory method for NameComparator
		public static Comparator<Student> getNameComparator(){
			return nameComparator;
		}
	
	private static class NameComparator implements Comparator<Student>{
		@Override
		public int compare(Student s1, Student s2) {
			return s1.name.compareTo(s2.name);
		}
	}

}
