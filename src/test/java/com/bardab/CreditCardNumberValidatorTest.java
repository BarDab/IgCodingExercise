
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CreditCardNumberValidatorTest {


    @Test
    public void shouldReturnFalseWhenEmptyOrNull(){
        assertThat(new CreditCardNumberValidator().validateCreditCardNumberUsingLuhnChecksum("")).isEqualTo(false);
        assertThat(new CreditCardNumberValidator().validateCreditCardNumberUsingLuhnChecksum(null)).isEqualTo(false);
    }



    @Test
    public void shouldReturnFalseWhenNotDigitsOnly (){
        assertThat(new CreditCardNumberValidator().validateCreditCardNumberUsingLuhnChecksum("454d")).isEqualTo(false);
        assertThat(new CreditCardNumberValidator().validateCreditCardNumberUsingLuhnChecksum("454 ")).isEqualTo(false);
    }

    @Test
    public void shouldReturnTrueWhenValidCardNumberIsGiven(){

        assertThat(new CreditCardNumberValidator().validateCreditCardNumberUsingLuhnChecksum("4263982640269299")).isEqualTo(true);
        assertThat(new CreditCardNumberValidator().validateCreditCardNumberUsingLuhnChecksum("4001919257537193")).isEqualTo(true);

    }

    @Test
    public void shouldReturnFalseWhenInvalidCardNumberIsGiven(){

        assertThat(new CreditCardNumberValidator().validateCreditCardNumberUsingLuhnChecksum("4264982640269299")).isEqualTo(false);
        assertThat(new CreditCardNumberValidator().validateCreditCardNumberUsingLuhnChecksum("4001919257537192")).isEqualTo(false);

    }



}
