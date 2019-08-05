package studentdatabaseApp;



import java.util.Scanner;

public class StudentDatabaseApp {
  //AN APP TO MANAGE STUDENT ENROLLMENT AND BALANCE
	 
	
	public static void main(String[] args) {

		//ask user how many new students will be added to the database
		
		//System.out.println("How many new students need to be added to the database?");
		Scanner in = new Scanner(System.in);
		//int newStudents = in.nextInt();
		
		
		
		
		//user should be prompted to enter the name and year for each student
		System.out.println("Enter the student name");
		String name = in.nextLine();
		System.out.println("Enter the student's year\n1 for freshman\n2 for sophomore\n3 for junior\n4 for senior");
		int year = in.nextInt();
		
		Student a = new Student(name,year);
		System.out.println(a.toString());
	
		in.close();
		
		}
	}

		
		
		/*public static int getUniqueID() {

			Random random = new Random();
			IDNumber = new int[5] ;
			for(int i=0;i<5;i++){

				IDNumber[i] = random.nextInt(10);} //any number between 0 and 10
			IDNumber[0]= 3;

			//make it an integer
			StringBuilder str = new StringBuilder();
			for(int x:IDNumber) {
				str.append(x);}	
			int ID = Integer.parseInt(str.toString());

			return ID;
		}*/
	


