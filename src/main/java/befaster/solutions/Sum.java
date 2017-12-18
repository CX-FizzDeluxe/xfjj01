package befaster.solutions;

import befaster.runner.InvalidInputException;

public class Sum {

	public static int sum(int x, int y) {

		int result = 0;
		
		if (x < 0 || x > 100 || y < 0 || y > 100) {
			throw new InvalidInputException("number should be between 0 and 100");
		}
		
		result = x+y;
		
		return result;
	}
	

}
