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
        else if(inputNumber == 6)
        {
            return "VI";
        }
        else if(inputNumber == 7)
        {
            return "VII";
        }
        else if(inputNumber == 8)
        {
            return "VIII";
        }
        else if(inputNumber == 9)
        {
            return "IX";
        }
        return "I";
    }
}
