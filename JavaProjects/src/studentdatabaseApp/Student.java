package studentdatabaseApp;

import java.util.Scanner;

public class Student {

	//private String firstName;
	//private String lastName;
	private String name;
	private String course;
	private double balance;
	private int  year;
	private int uniqueID;
	private static int id=1000; //static means no repeats hence unique
	//private int numberOfStudents;
	private static int costOfCourse = 600; //belongs to class, not just an instance of the class


	//an instance of object Student
	public Student(String name, int year) {
		this.name = name;
		this.year = year;
		this.uniqueID = getUniqueID();



	}

	//student should have 5-digit unique ID, first digit being grade level
	private int getUniqueID() {
		id++;
		String ID = this.year +""+id;
		int IDNumber = Integer.parseInt(ID);


		return IDNumber;
	}
	//student can enroll in 5 courses: HIST MTH ENG CHEM CSC 101
	public void enroll() {

		System.out.println("Enter course to enroll('Done' to quit)");
		System.out.println("Offeres courses are: Hist 101, MTH 101, Eng 101, CHM 101, and CSC 101");
		Scanner in = new Scanner(System.in);

		while(!course.equals("Done")) {
			course = in.next();	
		}
		in.close();

	}

	// Each course costs $600 

	//student should be able to view their balance and pay tuition
	private double getBalance() {




		return balance;

	}

	//to see status of the student, we should see their name, ID, courses enrolled, and balance 
	//array that stores name, ID, grade level, courses enrolled and balance for each student
	private <T> T database (){

		return null;

	}









	@Override
	public String toString() {
		return "Student [name=" + name + ", year=" + year + "  ID:"+uniqueID;
	}


}
