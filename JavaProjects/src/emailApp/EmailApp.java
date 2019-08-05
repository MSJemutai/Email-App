package emailApp;

public class EmailApp {
	
	
//YOU ARE AN IT SPECIALIST TASKED WITH CREATING NEW EMAIL ACCOUNTS FOR NEW EMPLOYEES IN YOUR COMPANY
	//THE PROGRAM IS AS FOLLOWS: 
	
	public static void main(String[] args) {
		
		Email newone = new Email("Mercy Salome","Jemutai");
		//System.out.println(newone.getEmail());
		newone.setAlternateEmail("jsangunya@gmail.com");
		System.out.println(newone.showInfo());
		
		
		
		
		
			}

}
