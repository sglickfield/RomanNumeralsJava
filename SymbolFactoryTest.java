import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.instanceOf;
 
public class SymbolFactoryTest 
{
    @Test public final void GetRomanObjFromSymbolFactory()
    {
        Symbol s = SymbolFactory.getSymbol("X");
        org.junit.Assert.assertTrue(s instanceof Roman);
    }
    @Test public final void CheckSymbolFactoryReturnsNumberFor1()
    {
        Symbol s = SymbolFactory.getSymbol("1");
        org.junit.Assert.assertTrue(s instanceof Number);
    }
    @Test public final void CheckSymbolFactoryReturnsRomanForI()
    {
        Symbol s = SymbolFactory.getSymbol("I");
        org.junit.Assert.assertTrue(s instanceof Roman);
    }
    @Test public final void Check0IsInvalidSymbol()
    {
        Symbol s = SymbolFactory.getSymbol("0");
        org.junit.Assert.assertTrue(s instanceof InvalidSymbol);
    }
    @Test public final void Check4000IsInvalidSymbol()
    {
        Symbol s = SymbolFactory.getSymbol("4000");
        org.junit.Assert.assertTrue(s instanceof InvalidSymbol);
    }
    @Test public final void CheckILIsInvalidSymbol()
    {
        Symbol s = SymbolFactory.getSymbol("IL");
        org.junit.Assert.assertTrue(s instanceof InvalidSymbol);
    }
    @Test public final void whenInvalidSymbolCheckForExceptionUsedThenUnsupportedOperationExceptionIsThrown()
    {
        UnsupportedOperationException exception = null;
        Symbol s =  SymbolFactory.getSymbol("IIII");
        try {
            s.checkForException(1,2);
        } catch (UnsupportedOperationException e) {
            exception = e;
        }
        org.junit.Assert.assertNotNull(exception);
        org.junit.Assert.assertEquals("checkForException() call is not supported for InvalidSymbol instance.", exception.getMessage());
    }
    @Test public final void CheckXMForInvalidSymbol()
    {
        Symbol s =  SymbolFactory.getSymbol("XM");
        org.junit.Assert.assertTrue(s instanceof InvalidSymbol);
    }
    @Test public final void CheckILForInvalidSymbol()
    {
        Symbol s =  SymbolFactory.getSymbol("IL");
        org.junit.Assert.assertTrue(s instanceof InvalidSymbol);
    }
    @Test public final void CheckMMMMForInvalidSymbol()
    {
        Symbol s =  SymbolFactory.getSymbol("MMMM");
        org.junit.Assert.assertTrue(s instanceof InvalidSymbol);
    }
    @Test public final void CheckIIIIForInvalidSymbol()
    {
        Symbol s =  SymbolFactory.getSymbol("IIII");
        org.junit.Assert.assertTrue(s instanceof InvalidSymbol);
    }
}
