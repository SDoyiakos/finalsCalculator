import java.util.Scanner;
/**
 * 
 * @author Steven Doyiakos
 *
 */
public class Driver {
	Scanner input; // Used to interface between the user and the program
	int userInput; // the input of the user represented as an int
	int state; // default state
	
	public Driver() {
		state=1;
		input=new Scanner(System.in);
		userInput=0;
		displayMenu();
	}

	public void displayMenu() {
	
		while(state!=0) {
			
			System.out.println("[1] Calculate Final Grade");
			System.out.println("[2] Quit");
			try {
			userInput= Integer.valueOf(input.nextLine());
			if(userInput!=1&&userInput!=2) {
				throw new NumberFormatException();
			}
			
			switch(userInput) {
			case 1:
				calculatorPrompt();
				state=1; // reset state back to normal
				break;
			case 2:
				state=0; // cuts the loop
				break;
			}
		}
			catch(NumberFormatException e) {
				System.out.println("Please enter a number 1 or 2");
			}
			catch(Exception e) {
				e.printStackTrace();
				System.out.println("An error occured please try again");
				
			}
		
		}
	}
			
		

	
	
	public void calculatorPrompt() {
		
		try {
		double grade;
		double desiredGrade;
		double finalWeight;
		
		//prompt user for inputs
		System.out.println("What is your current grade in %?");
		grade=Double.valueOf(input.nextLine());
		System.out.println("What is your desired grade in %?");
		desiredGrade=Double.valueOf(input.nextLine());
		System.out.println("How much is your final worth in %?");
		finalWeight=Double.valueOf(input.nextLine());
		System.out.println("You need a " + Calculator.calculateFinal(grade, finalWeight, desiredGrade)+"% to get a "+ desiredGrade + "% in the class\n");
		
		
		
		}
		// simple catch all exception
		
		catch(NumberFormatException e) {
			System.out.println("Please input a number");
		}
		catch(Exception e) {
			System.out.println("An error has occured. Please try again.");
			e.printStackTrace();
		}
		

	}
	
}
