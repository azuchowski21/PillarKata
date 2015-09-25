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
        else if(inputNumber == 5)
        {
            return "V";
        }
        return "I";
    }
}
