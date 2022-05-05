
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.assertj.core.api.Assertions.assertThat;

public class PalindromeGeneratorTest {

    private PalindromeGenerator palindromeGenerator;

    @BeforeEach
    public void setUp(){
        palindromeGenerator = new PalindromeGenerator();

    }

    @Test
    public void isNumberTest(){
        assertThat(palindromeGenerator.isInteger("1od")).isEqualTo(false);
        assertThat(palindromeGenerator.isInteger("12")).isEqualTo(true);

    }
    @Test
    public void isPalindromeTest(){
        assertThat(palindromeGenerator.isPalindrome("131")).isEqualTo(true);
        assertThat(palindromeGenerator.isPalindrome("1221")).isEqualTo(true);
        assertThat(palindromeGenerator.isPalindrome("1")).isEqualTo(true);
        assertThat(palindromeGenerator.isPalindrome("10")).isEqualTo(false);
        assertThat(palindromeGenerator.isPalindrome("001")).isEqualTo(false);

    }

    @Test
    public void shouldArriveAtPalindrome(){
        assertThat(palindromeGenerator.arriveAtPalindrome("191").getPalindrome()).isEqualTo(191);
        assertThat(palindromeGenerator.arriveAtPalindrome("191").getIterations()).isEqualTo(0);

        assertThat(palindromeGenerator.arriveAtPalindrome("195").getPalindrome()).isEqualTo(9339);
        assertThat(palindromeGenerator.arriveAtPalindrome("195").getIterations()).isEqualTo(4);

        assertThat(palindromeGenerator.arriveAtPalindrome("12").getPalindrome()).isEqualTo(33);
        assertThat(palindromeGenerator.arriveAtPalindrome("12").getIterations()).isEqualTo(1);

        assertThat(palindromeGenerator.arriveAtPalindrome("1").getPalindrome()).isEqualTo(1);
        assertThat(palindromeGenerator.arriveAtPalindrome("1").getIterations()).isEqualTo(0);

        assertThat(palindromeGenerator.arriveAtPalindrome("196").getPalindrome()).isNull();
        assertThat(palindromeGenerator.arriveAtPalindrome("196").getIterations()).isEqualTo(1000);

        assertThat(palindromeGenerator.arriveAtPalindrome("2018521411").getPalindrome()).isEqualTo(3159779513L);
        assertThat(palindromeGenerator.arriveAtPalindrome("2000511111").getIterations()).isEqualTo(1);



    }




}
