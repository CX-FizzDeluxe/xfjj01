package befaster.solutions;

public class FizzBuzz {

	public static final Integer THREE_INT = 3;

	public static final Integer FIVE_INT = 5;

	public static final String FIZZ = "fizz";

	public static final String BUZZ = "buzz";

	public static final String DELUXE = "deluxe";
	
	public static final String FAKE = "fake";

	public static final String THREE_STR = "3";

	public static final String FIVE_STR = "5";

	private static final String SPACE = " ";

	/**
	 * If the number is a multiple of three then you should write "fizz" If the
	 * number is a multiple of five then you should write "buzz" If the number
	 * is a multiple of both three and five then you should write "fizz buzz" If
	 * the number is not a multiple of five or three then write the number,
	 * example 1
	 * 
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
			if (isRes) {
				result.append(SPACE);
			}
			result.append(BUZZ);
			isRes = true;
		}

		if (!isRes.booleanValue()) {
			result.append(number.intValue());
		}

		return result.toString();
	}

	/**
	 * This method returns below: "fizz" if number is divisible by 3 or if it
	 * has a 3 in it "buzz" if number is divisible by 5 or if it has a 5 in it
	 * if number is both "fizz" and "buzz" at the same time. If this happens
	 * then returns "fizz buzz"
	 * 
	 * @param number
	 * @return "fizz" or "buzz" or "fizz buzz" or number
	 */
	/*
	 * public static String fizz_Buzz(Integer number) {
	 * 
	 * StringBuilder result = new StringBuilder(); Boolean isRes = false;
	 * 
	 * if (number % THREE_INT == 0 || number.toString().indexOf(THREE_STR) >= 0)
	 * { result.append(FIZZ); isRes = true; } if (number % FIVE_INT == 0 ||
	 * number.toString().indexOf(FIVE_STR) >= 0) { if (isRes) {
	 * result.append(SPACE); } result.append(BUZZ); isRes = true; }
	 * 
	 * if (!isRes.booleanValue()) { result.append(number.intValue()); }
	 * 
	 * return result.toString(); }
	 */

	/**
	 * This method returns below: "fizz" if number is divisible by 3 or if it
	 * has a 3 in it "buzz" if number is divisible by 5 or if it has a 5 in it
	 * if number is both "fizz" and "buzz" at the same time. If this happens
	 * then returns "fizz buzz". A number is considered to be "deluxe" if it is
	 * greater than 10 and all the digits are identical. A number can be "fizz",
	 * "buzz" and "deluxe" at the same time. If this happens then write
	 * "fizz buzz deluxe"
	 * 
	 * @param number
	 * @return "fizz" or "buzz" or "deluxe" or "fizz buzz" or "fizz deluxe" or
	 *         "buzz deluxe" or "fizz buzz deluxe" or "fake" or "fizz buzz fake deluxe" or number
	 */
	public static String fizz_Buzz(Integer number) {

		StringBuilder result = new StringBuilder();
		Boolean isRes = false;

		// checks fizz
		if (number % THREE_INT == 0 || number.toString().indexOf(THREE_STR) >= 0) {
			result.append(FIZZ);
			isRes = true;
		}

		// checks buzz
		if (number % FIVE_INT == 0 || number.toString().indexOf(FIVE_STR) >= 0) {
			if (isRes) {
				result.append(SPACE);
			}
			result.append(BUZZ);
			isRes = true;
		}

		// checks deluxe
		Boolean isNumDeluxe = isNumberDeluxe(number);
		
		// business rule fake 
		if (isNumDeluxe && number % 2 != 0) {
			if (isRes) {
				result.append(SPACE);
			}
			result.append(FAKE);
			isRes = true;
		}

		// business rule deluxe
		if (isNumDeluxe) {
			if (isRes) {
				result.append(SPACE);
			}
			result.append(DELUXE);
			isRes = true;
		}

		if (!isRes.booleanValue()) {
			result.append(number.intValue());
		}

		return result.toString();
	}

	/**
	 * A number is considered to be "deluxe" if it is greater than 10 and all
	 * the digits are identical
	 * 
	 * @param number
	 * @return true if number is deluxe else false.
	 */
	private static boolean isNumberDeluxeOld(Integer number) {

		Boolean isDeluxe = false;
		Boolean isDigitIdentical = true;
		Integer numberTemp = number;
		
		int digit = numberTemp % 10;
		while (numberTemp>0) {
			if(numberTemp %10 != digit) {
				isDigitIdentical = false;
				break;
			} 
			numberTemp /= 10; 
		}
		
		if (isDigitIdentical && number > 10) {
			isDeluxe = true;
		}

		return isDeluxe;
	}

	
	/**
	 * A number is "deluxe" if it is divisible by 3 AND it has a 3 in it. 
	 * A number is "deluxe" if it is divisible by 5 AND it has a 5 in it
	 * 
	 * @param number
	 * @return true if number is deluxe else false.
	 */
	private static boolean isNumberDeluxe(Integer number) {

		Boolean isDeluxe = false;
		
		if ((number % THREE_INT == 0 && number.toString().indexOf(THREE_STR) >= 0) || 
				(number % FIVE_INT == 0 && number.toString().indexOf(FIVE_STR) >= 0)) {
			isDeluxe = true;
		}

		return isDeluxe;
	}


}
