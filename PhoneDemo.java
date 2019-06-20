import java.util.Scanner;

public class PhoneDemo {
	
	public static void main(String args){
		
		Scanner keyboard = new Scanner(System.in);
		
		Phone myPhone = new Phone();
		SmartPhone mySmartPhone =  new SmartPhone();
		int option = 0;
		
		do{
			System.out.println("Press 1: to put the information about the phone.\n" 
					+ "Press 2: to put the information about the smart phone.\n"
					+ "Press 3: to look at the information about the phone. \n"
					+ "Press 4: to look at the information about the smart phone. \n"
					+ "Press 5: To end the program");
			
			option = keyboard.nextInt();
			keyboard.nextLine();
			
			if (option == 1)  
			{
				System.out.println("What is the model of the phone?");
				myPhone.setModel(keyboard.nextLine());
				
			}
			else if (option ==2)  
			{
				System.out.println("What is the model of the smart phone?");
				mySmartPhone.setModel(keyboard.nextLine());
				System.out.println("What is the web address of the smart phone?");
				mySmartPhone.setWebAddress(keyboard.nextLine());
				
			}
			else if (option == 3)  
			{
				System.out.println("The model of the phone is: " + myPhone.getModel());
			}
			else if (option == 4)  
			{
				System.out.println("The model of the smart phone is: " + mySmartPhone.getModel());
				System.out.println("The web address of the smart phone is: " + mySmartPhone.getWebAddress());
			}
			else if (option == 5) 
			{
				System.out.println("GoodBye!");
			}
			else  //Error! 
			{
				System.out.println("Invalid input! Please try again");
			}
			
		}while (option !=5);
		keyboard.close();
	}

}
