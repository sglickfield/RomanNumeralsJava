import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.instanceOf;
 
public class RomanTest 
{
    @Test public final void GetRomanObj()
    {
        Roman r = new Roman("X");
        org.junit.Assert.assertTrue(r instanceof Roman);
    }
    @Test public final void CheckConvertIToInt()
    {
        Roman r = new Roman("I");
        org.junit.Assert.assertEquals(r.convert(), "1");
    }
    @Test public final void CheckConvertVToInt()
    {
        Roman r = new Roman("V");
        org.junit.Assert.assertEquals(r.convert(), "5");
    }
    @Test public final void CheckConvertXToInt()
    {
        Roman r = new Roman("X");
        org.junit.Assert.assertEquals(r.convert(), "10");
    }
    @Test public final void CheckConvertLToInt()
    {
        Roman r = new Roman("L");
        org.junit.Assert.assertEquals(r.convert(), "50");
    }
    @Test public final void CheckConvertCToInt()
    {
        Roman r = new Roman("C");
        org.junit.Assert.assertEquals(r.convert(), "100");
    }
    @Test public final void CheckConvertMToInt()
    {
        Roman r = new Roman("M");
        org.junit.Assert.assertEquals(r.convert(), "1000");
    }
    @Test public final void CheckConvertIIToInt()
    {
        Roman r = new Roman("II");
        org.junit.Assert.assertEquals(r.convert(), "2");
    }
    @Test public final void CheckConvertIXToInt()
    {
        Roman r = new Roman("IX");
        org.junit.Assert.assertEquals(r.convert(), "9");
    }
    @Test public final void CheckConvertIVToInt()
    {
        Roman r = new Roman("IV");
        org.junit.Assert.assertEquals(r.convert(), "4");
    }
    @Test public final void CheckIVForExceptionCheck()
    {
        Roman r = new Roman("IV");
        org.junit.Assert.assertTrue(r.checkForException(0, 1));
    }
    @Test public final void CheckIXForExceptionCheck()
    {
        Roman r = new Roman("IX");
        org.junit.Assert.assertTrue(r.checkForException(0, 1));
    }
    @Test public final void CheckXLForExceptionCheck()
    {
        Roman r = new Roman("XL");
        org.junit.Assert.assertTrue(r.checkForException(0, 1));
    }
    @Test public final void CheckXCForExceptionCheck()
    {
        Roman r = new Roman("XC");
        org.junit.Assert.assertTrue(r.checkForException(0, 1));
    }
    @Test public final void CheckCDForExceptionCheck()
    {
        Roman r = new Roman("CD");
        org.junit.Assert.assertTrue(r.checkForException(0, 1));
    }
    @Test public final void CheckMIXForExceptionCheck()
    {
        Roman r = new Roman("MIX");
        org.junit.Assert.assertTrue(r.checkForException(1, 2));
    }
    @Test public final void CheckCMForExceptionCheck()
    {
        Roman r = new Roman("CM");
        org.junit.Assert.assertTrue(r.checkForException(0, 1));
    }
    @Test public final void CheckIIForExceptionCheckFails()
    {
        Roman r = new Roman("II");
        org.junit.Assert.assertFalse(r.checkForException(0, 1));
    }
    @Test public final void CheckXXForExceptionCheckFails()
    {
        Roman r = new Roman("XX");
        org.junit.Assert.assertFalse(r.checkForException(0, 1));
    }
    @Test public final void CheckMMMForExceptionCheckFails()
    {
        Roman r = new Roman("MMM");
        org.junit.Assert.assertFalse(r.checkForException(1, 2));
    }
    @Test public final void CheckCMXCIXEquals999()
    {
        Symbol s = SymbolFactory.getSymbol("CMXCIX");
        org.junit.Assert.assertEquals(s.convert(), "999");
    }
    @Test public final void CheckCDIIIEquals403()
    {
        Symbol s = SymbolFactory.getSymbol("CDIII");
        org.junit.Assert.assertEquals(s.convert(), "403");
    }
}
