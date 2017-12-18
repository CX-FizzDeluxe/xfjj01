package befaster.solutions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void testFizzBuzzInputTwo() {
        assertThat(FizzBuzz.fizzBuzz(2), equalTo("2"));
    }
}