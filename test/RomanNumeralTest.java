import org.junit.Before;
import org.junit.Test;
import org.junit.Assert.*;
/**/
import static org.junit.Assert.assertEquals;


public class RomanNumeralTest
{
    RomanNumeral romanNumeral;
    @Before
    public void setUp()
    {
        romanNumeral = new RomanNumeral();
    }
    @Test
    public void whenRomanNumeralIsPassedANumberItReturnsThatRomanNumeral()
    {
        assertEquals("I", romanNumeral.convertNumberToRomanNumeral(1));

    }
    @Test
    public void whenRomanNumeralIsPassedATwoItReturnsRomanNumeralForTwo()
    {
        assertEquals("II", romanNumeral.convertNumberToRomanNumeral(2));

    }
    @Test
    public void whenRomanNumeralIsPassedAThreeItReturnsRomanNumeralForThree()
    {
        assertEquals("III", romanNumeral.convertNumberToRomanNumeral(3));

    }
    @Test
    public void whenRomanNumeralIsPassedAFourItReturnsRomanNumeralForFour()
    {
        assertEquals("IV", romanNumeral.convertNumberToRomanNumeral(4));
    }
    @Test
    public void whenRomanNumeralIsPassedAFiveItReturnsRomanNumeralForFive()
    {
        assertEquals("V", romanNumeral.convertNumberToRomanNumeral(5));
    }
    @Test
    public void whenRomanNumeralIsPassedASixItReturnsRomanNumeralForSix()
    {
        assertEquals("VI", romanNumeral.convertNumberToRomanNumeral(6));
    }

}