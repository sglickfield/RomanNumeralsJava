import org.junit.Test;
import org.junit.Assert.*;

public class ConvertAllNumbersBetween1And3999Test 
{

  @Test
  public void ConvertNumbersToRomanAndBack() 
  {
     Symbol s = null;
     for (int i = 1; i < 4000; i++)
     {
        s             = SymbolFactory.getSymbol(i+"");
        String roman  = s.convert();
        s             = SymbolFactory.getSymbol(roman);
        int numberOut = Integer.parseInt(s.convert()); 
 
        org.junit.Assert.assertEquals(i, numberOut );
      }
   }
}
