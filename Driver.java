import java.util.Scanner;

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
			userInput= Integer.valueOf(input.nextLine());
			
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
	}
			

	
	
	public void calculatorPrompt() {

		float grade;
		float desiredGrade;
		float finalWeight;
		System.out.println("What is your current grade in %?");
		grade=Float.valueOf(input.nextLine());
		System.out.println("What is your desired grade in %?");
		desiredGrade=Float.valueOf(input.nextLine());
		System.out.println("How much is your final worth in %?");
		finalWeight=(Float.valueOf(input.nextLine()))*(float)(0.01);
		System.out.println("You need a " + Calculator.calculateFinal(grade, finalWeight, desiredGrade)+"% to get a "+ desiredGrade + "% in the class\n");
		
		

	}
	
}
