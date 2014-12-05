import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Convert
{
    public static void main(String[] args)
    { 
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br    = new BufferedReader(is);

        String input  = null;
        Symbol symbol = null;
	try
        {
            input = br.readLine();
            while (input != null)
            {
                symbol = SymbolFactory.getSymbol(input);
                System.out.println(symbol.convert());
                input = br.readLine();
            }
        }  
        catch(IOException ioe)  
        {  
            System.out.println("IOE exception: " + ioe);  
        }
    }  
}
