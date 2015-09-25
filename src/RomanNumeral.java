/**/
public class RomanNumeral
{
    public String convertNumberToRomanNumeral(Integer inputNumber)
    {
        if(inputNumber == 2)
        {
            return "II";
        }
        else if(inputNumber == 3)
        {
            return "III";
        }
        else if(inputNumber == 4)
        {
            return "IV";
        }
        return "I";
    }
}
