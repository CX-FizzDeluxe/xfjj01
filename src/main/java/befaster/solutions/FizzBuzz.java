package befaster.solutions;

public class FizzBuzz {

	public static final String FIZZ = "fizz";

	public static final String BUZZ = "buzz";

	public static final Integer THREE_INT = 3;

	public static final Integer FIVE_INT = 5;

	public static String fizzBuzz(Integer number) {
		
		StringBuilder result = new StringBuilder();
		
		if (number % THREE_INT == 0) {
			result.append(FIZZ);
		} else if (number % FIVE_INT == 0) {
			result.append(BUZZ);
		} else {
			result.append(number.intValue());
		}

		return result.toString();
	}

}
