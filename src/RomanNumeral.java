import java.util.LinkedHashMap;
import java.util.Map;

/**/
public class RomanNumeral
{
    public String convertNumberToRomanNumeral(Integer inputNumber)
    {
        String returnValue = "";
        LinkedHashMap<Integer, String> romanNumeralsMap = new LinkedHashMap<>();
        romanNumeralsMap.put(100,"C");
        romanNumeralsMap.put(90,"XC");
        romanNumeralsMap.put(50,"L");
        romanNumeralsMap.put(40,"XL");
        romanNumeralsMap.put(10,"X");
        romanNumeralsMap.put(9,"IX");
        romanNumeralsMap.put(5,"V");
        romanNumeralsMap.put(4,"IV");
        romanNumeralsMap.put(1,"I");

        while(inputNumber > 0)
        {
            for(Map.Entry<Integer, String> entry : romanNumeralsMap.entrySet())
            {
                if(inputNumber >= entry.getKey())
                {
                    inputNumber = inputNumber - entry.getKey();
                    returnValue += entry.getValue();
                    break;
                }
            }
        }
        return returnValue;
    }
}
