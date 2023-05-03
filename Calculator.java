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

		 // used to see if we need to round up to the hundreths place
		 if(answer%.001!=0) {
			 answer=answer+.01;
		 }
		 output=Double.toString(answer);
		 output=output.substring(0,output.indexOf(".")+3);
		 return output;
	}
	

}
