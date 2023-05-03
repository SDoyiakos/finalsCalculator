/**
 * 
 * @author Steven Doyiakos
 *
 */
public class Calculator {

	
	
	/**
	 *  Calculates the grade needed to get the desired grade after the final
	 * @param currentGrade The students current grade in %
	 * @param finalWeight The students final weight in %
	 * @param desiredGrade The students desired grade in %
	 * @return The score needed on the final for the student to get the desired grade
	 */
	public static String calculateFinal(double currentGrade,double finalWeight,double desiredGrade) {
		double currentGradeWeighted; // the current grade when weighted
		double answer;
		String output;
		finalWeight=finalWeight*0.01; // ensures percentages are their multiplicative value
		 currentGradeWeighted=currentGrade*(1-finalWeight);

		 answer = (desiredGrade-currentGradeWeighted)/(finalWeight);

		
		 answer=roundtoHundreths(answer); //Rounds our answer
		 
 
		 output=Double.toString(answer);
		 
		 
		 return output;
	}
	
	/**
	 * Rounds double to the nearest hundreths palce
	 * @param number double to be rounded
	 * @return number rounded to the hundreths place
	 */
	public static double roundtoHundreths(double number) {
		number=Math.round(number*100.00);
		number=number/100.00;
		return number;
				
	}
	

}
