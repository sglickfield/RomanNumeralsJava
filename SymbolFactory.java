class SymbolFactory
{
    public static Symbol getSymbol(String input)
    {
        if (isNumber(input))
        {
           return new Number(Integer.parseInt(input)); 
        }
        else if (isRoman(input))
        {
           return new Roman(input); 
        }
        return new InvalidSymbol(input);
    }
    
    private static boolean isNumber(String str)
    {
        return (str.matches("^[1-9]+\\d*") && Integer.parseInt(str) < 4000);
    }

    private static boolean isRoman(String str)
    {
        return str.matches("^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$");
    }
}
