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
    public void testFizzBuzzInputMultiple_3() {
        assertThat(FizzBuzz.fizzBuzz(18), equalTo("fizz"));
    }
    
    @Test
    public void testFizzBuzzInputMultiple_5() {
        assertThat(FizzBuzz.fizzBuzz(20), equalTo("buzz"));
    }
    
    @Test
    public void testFizzBuzzInputMultiple_3_5() {
        assertThat(FizzBuzz.fizzBuzz(15), equalTo("fizz buzz"));
    }
    
    
    
    /**--------------**/
    
    @Test
    public void testFizz_BuzzInputTwo() {
        assertThat(FizzBuzz.fizz_Buzz(2), equalTo("2"));
    }
    
    
    @Test
    public void testFizz_BuzzInput9998() {
        assertThat(FizzBuzz.fizz_Buzz(9998), equalTo("9998"));
    }
    
    @Test
    public void testFizz_BuzzInputMultiple_3() {
        assertThat(FizzBuzz.fizz_Buzz(18), equalTo("fizz"));
    }
    
    @Test
    public void testFizz_BuzzInputHas_3() {
        assertThat(FizzBuzz.fizz_Buzz(136), equalTo("fizz"));
    }
    
    @Test
    public void testFizz_BuzzInputMultiple_5() {
        assertThat(FizzBuzz.fizz_Buzz(20), equalTo("buzz"));
    }
    
    @Test
    public void testFizz_BuzzInputHas_5() {
        assertThat(FizzBuzz.fizz_Buzz(511), equalTo("buzz"));
    }
    
    @Test
    public void testFizz_BuzzInputMultiple_3_5() {
        assertThat(FizzBuzz.fizz_Buzz(15), equalTo("fizz buzz"));
    }
    
    @Test
    public void testFizz_BuzzInputHasBoth_3_5() {
        assertThat(FizzBuzz.fizz_Buzz(5334), equalTo("fizz buzz"));
    }
    
}