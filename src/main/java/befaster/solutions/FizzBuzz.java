package befaster.solutions;

public class FizzBuzz {

	public static final String FIZZ = "fizz";

	public static final String BUZZ = "buzz";

	public static final Integer THREE_INT = 3;

	public static final Integer FIVE_INT = 5;

	private static final String SPACE = " ";

	/**
	 * If the number is a multiple of three then you should write "fizz"
	 * If the number is a multiple of five then you should write "buzz"
	 * If the number is a multiple of both three and five then you should write "fizz buzz"
	 * If the number is not a multiple of five or three then write the number, example 1
	 * @param number
	 * @return "fizz" or "buzz" or "fizz buzz" or number
	 */
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

	/**
	 * 	This method returns below:
	 * "fizz" if number is divisible by 3 or if it has a 3 in it
	 * "buzz" if number is divisible by 5 or if it has a 5 in it
	 * if number is both "fizz" and "buzz" at the same time. If this happens then returns "fizz buzz"
	 * @param number
	 * @return "fizz" or "buzz" or "fizz buzz" or number
	 */
	public static String fizz_Buzz(Integer number) {
		
		StringBuilder result = new StringBuilder();
		Boolean isRes = false; 
		
		if (number % THREE_INT == 0 || number.toString().indexOf(THREE_INT) >= 0) {
			result.append(FIZZ);
			isRes = true;
		}
		if (number % FIVE_INT == 0 || number.toString().indexOf(FIVE_INT) >= 0) {
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
