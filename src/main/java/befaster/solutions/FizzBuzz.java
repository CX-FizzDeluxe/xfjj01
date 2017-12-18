package befaster.solutions;

public class FizzBuzz {

	public static final String FIZZ = "fizz";

	public static final String BUZZ = "buzz";

	public static final Integer THREE_INT = 3;

	public static final Integer FIVE_INT = 5;

	private static final String SPACE = " ";

	public static String fizzBuzz(Integer number) {
		
		StringBuilder result = new StringBuilder();
		Boolean isRes = false; 
		
		if (number % THREE_INT == 0) {
			result.append(FIZZ);
			isRes = true;
		}
		if (number % FIVE_INT == 0) {
			if(isRes) {
				result.append(SPACE);
			}
			result.append(BUZZ);
			isRes = true;
		}
		
		if(!isRes.booleanValue())
		{
			result.append(number.intValue());
		}

		return result.toString();
	}

}
