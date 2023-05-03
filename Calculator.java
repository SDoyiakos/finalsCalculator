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
	public static String calculateFinal(float currentGrade,float finalWeight,float desiredGrade) {
		double currentGradeWeighted;
		String answer;
		 currentGradeWeighted=currentGrade*(1-finalWeight);
		 answer = String.valueOf((desiredGrade-currentGradeWeighted)/(finalWeight));
		 answer = answer.substring(0,answer.indexOf(".")+3);
		 return answer;
	}

}
