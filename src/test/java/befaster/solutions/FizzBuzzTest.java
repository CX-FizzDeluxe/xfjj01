package befaster.solutions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void testFizzBuzzInputTwo() {
        assertThat(FizzBuzz.fizzBuzz(2), equalTo("2"));
    }
    
    
    @Test
    public void testFizzBuzzInput9998() {
        assertThat(FizzBuzz.fizzBuzz(9998), equalTo("9998"));
    }
    
    @Test
    public void testFizzBuzzInputFIZZ() {
        assertThat(FizzBuzz.fizzBuzz(18), equalTo("fizz"));
    }
    
    @Test
    public void testFizzBuzzInputBUZZ() {
        assertThat(FizzBuzz.fizzBuzz(20), equalTo("buzz"));
    }
    
    @Test
    public void testFizzBuzzInputFIZZBUZZ() {
        assertThat(FizzBuzz.fizzBuzz(15), equalTo("fizz buzz"));
    }
    
}