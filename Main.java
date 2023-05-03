import java.util.Scanner;
/**
 * 
 * @author Steven Doyiakos
 *
 */
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int userInput; // the input of the user represented as an int
		int state = 1; // default state
		while(state!=0) {
			System.out.println("Welcome to the Final Grade Calculator");
			System.out.println("[1] Calculate Final Grade");
			System.out.println("[2] Quit");
			try {
			userInput= Integer.valueOf(input.nextLine());
			
			switch(userInput) {
			case 1:
				calculatorPrompt(input);
				state=1; // reset state back to normal
				
			case 2:
				state=0; // cuts the loop
			}
				
			}
			
			// catch statements to be implemented later
			catch(NumberFormatException e) {
				System.out.println("Please input a number");
			}
			catch(IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
			catch(Exception e) {
				System.out.println("An error occured. Aborting.");
				state=0;
			}
			


			

			
			}
		}
	/**
	 * Provides a prompt for the user to interface with the finals calculator
	 */
	
	public static void calculatorPrompt(Scanner input) {

		float grade;
		float desiredGrade;
		float finalWeight;
		System.out.println("What is your current grade in %?");
		grade=Float.valueOf(input.nextLine());
		System.out.println("What is your desired grade in %?");
		desiredGrade=Float.valueOf(input.nextLine());
		System.out.println("How much is your final worth in %?");
		finalWeight=(Float.valueOf(input.nextLine()))*(float)(0.01);
		System.out.println("You need a " + Calculator.calculateFinal(grade, finalWeight, desiredGrade)+"% to get a "+ desiredGrade + "% in the class");
		
		

	}
	
}
