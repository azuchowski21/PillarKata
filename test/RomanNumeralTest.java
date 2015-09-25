import org.junit.Test;
import org.junit.Assert.*;
/**/
import static org.junit.Assert.assertEquals;


public class RomanNumeralTest
{
    @Test
    public void whenRomanNumeralIsPassedANumberItReturnsThatRomanNumeral()
    {
        RomanNumeral romanNumeral = new RomanNumeral();
        assertEquals("I", romanNumeral.convertNumberToRomanNumeral(1));

    }
}