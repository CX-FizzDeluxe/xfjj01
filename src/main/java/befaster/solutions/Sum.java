package befaster.solutions;

import befaster.runner.InvalidInputException;

public class Sum {

    public static int sum(int x, int y) {

    	if(x <0 || x >100) {
            throw new InvalidInputException();
    	}
        
        
    }

}
