import java.lang.UnsupportedOperationException;

class InvalidSymbol implements Symbol
{
    String input;
    public InvalidSymbol(String str)
    {  
        input = str;
    }

    public String convert()
    {
        return "Invalid input: " + input  + ".  Please try again.";
    }
   
    public boolean checkForException(int i, int j) throws UnsupportedOperationException
    {
        throw new UnsupportedOperationException("checkForException() call is not supported for InvalidSymbol instance.");
    }
}
