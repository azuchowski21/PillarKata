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

    /*********************************************************************
     *  Tests for Number to Roman Numeral
     *********************************************************************/
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
    public void whenRomanNumeralIsPassedAFiveItReturnsRomanNumeralV()
    {
        assertEquals("V", romanNumeral.convertNumberToRomanNumeral(5));
    }
    @Test
    public void whenRomanNumeralIsPassedASixItReturnsRomanNumeralForSix()
    {
        assertEquals("VI", romanNumeral.convertNumberToRomanNumeral(6));
    }
    @Test
    public void whenRomanNumeralIsPassedASevenItReturnsRomanNumeralForSeven()
    {
        assertEquals("VII", romanNumeral.convertNumberToRomanNumeral(7));
    }
    @Test
    public void whenRomanNumeralIsPassedAEightItReturnsRomanNumeralForEight()
    {
        assertEquals("VIII", romanNumeral.convertNumberToRomanNumeral(8));
    }
    @Test
    public void whenRomanNumeralIsPassedANineItReturnsRomanNumeralForNine()
    {
        assertEquals("IX", romanNumeral.convertNumberToRomanNumeral(9));
    }
    @Test
    public void whenRomanNumeralIsPassedATenItReturnsRomanNumeralX()
    {
        assertEquals("X", romanNumeral.convertNumberToRomanNumeral(10));
    }
    @Test
    public void whenRomanNumeralIsPassedFortyXCanNotRepeatMoreThanThreeTimes()
    {
        assertEquals("XL", romanNumeral.convertNumberToRomanNumeral(40));
    }
    @Test
    public void whenRomanNumeralIsPassedFiftyItReturnsRomanNumeralL()
    {
        assertEquals("L", romanNumeral.convertNumberToRomanNumeral(50));
    }
    @Test
    public void whenRomanNumeralIsPassedEightyItReturnsRomanNumeralForEighty()
    {
        assertEquals("LXXX", romanNumeral.convertNumberToRomanNumeral(80));
    }
    @Test
    public void whenRomanNumeralIsPassedNinetyLCanNotBeRepeated()
    {
        assertEquals("XC", romanNumeral.convertNumberToRomanNumeral(90));
    }
    @Test
    public void whenRomanNumeralIsPassedOneHundredItReturnsC()
    {
        assertEquals("C", romanNumeral.convertNumberToRomanNumeral(100));
    }
    @Test
    public void whenRomanNumeralIsPassedFourHundredCCanNotRepeatMoreThanThreeTimes()
    {
        assertEquals("CD", romanNumeral.convertNumberToRomanNumeral(400));
        assertEquals("CM", romanNumeral.convertNumberToRomanNumeral(900));
    }
    @Test
    public void whenRomanNumeralIsPassedFiveHundredItReturnsD()
    {
        assertEquals("D", romanNumeral.convertNumberToRomanNumeral(500));
    }
    @Test
    public void whenRomanNumeralIsPassedOneThousandItReturnsM()
    {
        assertEquals("M", romanNumeral.convertNumberToRomanNumeral(1000));
    }
    @Test
    public void whenRomanNumeralIsPassedNumberGreaterThanThreeNineNineNine()
    {
        assertEquals("Invalid Number - Too Large", romanNumeral.convertNumberToRomanNumeral(4000));
    }
    @Test
    public void whenRomanNumeralIsPassedNumberLessThanOne()
    {
        assertEquals("Invalid Number - Too Small", romanNumeral.convertNumberToRomanNumeral(-3));
    }
    /*********************************************************************
     *  Tests for Roman Numeral to Number
     *********************************************************************/
    @Test
    public void whenRomanNumeralIsPassedIItReturns1()
    {
        assertEquals(Integer.valueOf(1), romanNumeral.convertRomanNumeralToNumber("I"));
    }
    @Test
    public void whenRomanNumeralIsPassedIIItReturns2()
    {
        assertEquals(Integer.valueOf(2), romanNumeral.convertRomanNumeralToNumber("II"));
    }
    @Test
    public void whenRomanNumeralIsPassedIIIItReturns3()
    {
        assertEquals(Integer.valueOf(3), romanNumeral.convertRomanNumeralToNumber("III"));
    }
    @Test
    public void whenRomanNumeralIsPassedIVItReturns4()
    {
        assertEquals(Integer.valueOf(4), romanNumeral.convertRomanNumeralToNumber("IV"));
    }

}