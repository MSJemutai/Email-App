package emailApp;

import java.util.Random;
import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String department;
	//private String company;
	private int mailboxCapacity = 300;//default
	private String password;
	private String alternateEmail;
	private int defaultPasswordLength =8; 
	private String companydefault = ".S&S.com";
	

	//constructor
	//if I have to create an instance of object email I need following details
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = setDepartment();
		this.password = passWord(defaultPasswordLength);
		

	}

	//determine/ask department (sales, development, accounting), leave blank if none
	private String setDepartment() {
		System.out.println("New employee:" +firstName +" "+lastName);
		System.out.println("Enter department code\n1 for Accounting\n2 for Development\n3 for Sales\n4 for none");
		Scanner in = new Scanner(System.in);
		int depCode = in.nextInt();
		in.close();
		if(depCode==1) { return "Accounting";}
		else if(depCode==2) {return "Development";}
		else if(depCode==3) {return "Sales";}
		else {
			return "";} 
	}

	//generate random string for password 
	//using RANDOM () from util
	private  String passWord(int length) {
		String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCase = "abcdefghijklmnopqrstuvwxyz";
		String nums = "0123456789";
		String specialChars = "!@#$%&*^~_+";
		String selectionChoice = upperCase+lowerCase+nums+specialChars;
		Random random = new Random();
		char [] password1 = new char[length];
		for(int i=0;i<length;i++) {
			password1[i] = selectionChoice.charAt(random.nextInt(selectionChoice.length()));}


		return String.valueOf(password1);
	}

	//set method to change password
	public void setPassword(String password) {
		this.password = password;
	}

	//set mailbox capacity
	public void setMailBoxCapacity(int mailboxCapacity) {
		this.mailboxCapacity = mailboxCapacity;
	}

	//set alternate email address ?????
	public void setAlternateEmail(String alternate) {
		this.alternateEmail = alternate;
	}
	//getter for alternate email
	public String getAlternateEmail() {
		return alternateEmail;
	}

	//get method for name
	public String getName() {

		return firstName + lastName;	
	}

	//get method for email????
	public String getEmail() {
		return "Your Email is " + firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + 
				department.toLowerCase() + companydefault;

	}
	//get for password
	public String getPassword() {
		return password;
	}

	//get method to display mailboxCapacity
	public int getMailboxCapacity() {

		return mailboxCapacity;

	}
 public String showInfo() {
	 
	return "NAME: " +firstName + " " +lastName+
			"\nEMAIL: "+getEmail()+
			"\nPASSWORD: "+getPassword()+
			"\nALTERNATE EMAIL: "+ getAlternateEmail()
			
			 ;
	 
 }


}
