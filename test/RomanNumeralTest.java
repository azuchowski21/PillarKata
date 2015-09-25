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
    @Test
    public void whenRomanNumeralIsPassedATwoItReturnsRomanNumeralForTwo()
    {
        RomanNumeral romanNumeral = new RomanNumeral();
        assertEquals("II", romanNumeral.convertNumberToRomanNumeral(2));

    }
    @Test
    public void whenRomanNumeralIsPassedAThreeItReturnsRomanNumeralForThree()
    {
        RomanNumeral romanNumeral = new RomanNumeral();
        assertEquals("III", romanNumeral.convertNumberToRomanNumeral(3));

    }
    @Test
    public void whenRomanNumeralIsPassedAFourItReturnsRomanNumeralForFour()
    {
        RomanNumeral romanNumeral = new RomanNumeral();
        assertEquals("IV", romanNumeral.convertNumberToRomanNumeral(4));

    }
    @Test
    public void whenRomanNumeralIsPassedAFiveItReturnsRomanNumeralForFive()
    {
        RomanNumeral romanNumeral = new RomanNumeral();
        assertEquals("V", romanNumeral.convertNumberToRomanNumeral(5));

    }

}