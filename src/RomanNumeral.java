import java.util.LinkedHashMap;
import java.util.Map;

/**/
public class RomanNumeral
{
    public String convertNumberToRomanNumeral(Integer inputNumber)
    {
        if(inputNumber > 3999)
        {
            return "Invalid Number - Too Large";
        }
        else if(inputNumber < 1)
        {
            return "Invalid Number - Too Small";
        }
        String returnValue = "";

        LinkedHashMap<Integer, String> romanNumeralsMap = new LinkedHashMap<>();
        romanNumeralsMap.put(1000,"M");
        romanNumeralsMap.put(900,"CM");
        romanNumeralsMap.put(500,"D");
        romanNumeralsMap.put(400,"CD");
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
    public Integer convertRomanNumeralToNumber(String inputRomanNumeral)
    {
        Integer returnVal = 0;

        LinkedHashMap<String, Integer> romanNumeralsMap = new LinkedHashMap<>();
        romanNumeralsMap.put("X", 10);
        romanNumeralsMap.put("V", 5);
        romanNumeralsMap.put("I", 1);

        for(int i = 0; i < (inputRomanNumeral.length() - 1); i++)
        {
            if(romanNumeralsMap.get(String.valueOf(inputRomanNumeral.charAt(i))) < romanNumeralsMap.get(String.valueOf(inputRomanNumeral.charAt(i + 1))))
            {
                returnVal -= romanNumeralsMap.get(String.valueOf(inputRomanNumeral.charAt(i)));
            }
            else
            {
                returnVal += romanNumeralsMap.get(String.valueOf(inputRomanNumeral.charAt(i)));
            }
        }

        returnVal += romanNumeralsMap.get(String.valueOf(inputRomanNumeral.charAt(inputRomanNumeral.length() - 1)));

        return returnVal;
    }
}
