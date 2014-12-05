import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.instanceOf;
 
public class NumberTest 
{
    @Test public final void CheckNumberConstructorReturnsNumber()
    {
        Number n = new Number(1);
        org.junit.Assert.assertTrue(n instanceof Number);
    }
    @Test public final void CheckNumberConverts1ToI()
    {
        Number n = new Number(1);
        org.junit.Assert.assertEquals(n.convert(), "I");
    }
    @Test public final void CheckNumberConverts5ToV()
    {
        Number n = new Number(5);
        org.junit.Assert.assertEquals(n.convert(), "V");
    }
    @Test public final void CheckNumberConverts10ToX()
    {
        Number n = new Number(10);
        org.junit.Assert.assertEquals(n.convert(), "X");
    }
    @Test public final void CheckNumberConverts50ToL()
    {
        Number n = new Number(50);
        org.junit.Assert.assertEquals(n.convert(), "L");
    }
    @Test public final void CheckNumberConverts100ToC()
    {
        Number n = new Number(100);
        org.junit.Assert.assertEquals(n.convert(), "C");
    }
    @Test public final void CheckNumberConverts500ToD()
    {
        Number n = new Number(500);
        org.junit.Assert.assertEquals(n.convert(), "D");
    }
    @Test public final void CheckNumberConverts1000ToM()
    {
        Number n = new Number(1000);
        org.junit.Assert.assertEquals(n.convert(), "M");
    }
    @Test public final void CheckSymbolFactoryReturnsNumberFor1()
    {
        Symbol s = SymbolFactory.getSymbol("1");
        org.junit.Assert.assertTrue(s instanceof Number);
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
    @Test public final void CheckConvert4toIV()
    {
        Symbol s = SymbolFactory.getSymbol("4");
        org.junit.Assert.assertEquals(s.convert(), "IV");
    }
    @Test public final void Check4ForExceptionCheck()
    {
        Symbol s = SymbolFactory.getSymbol("4");
        org.junit.Assert.assertTrue(s.checkForException(5, 1));
    }
    @Test public final void Check9ForExceptionCheck()
    {
        Symbol s = SymbolFactory.getSymbol("9");
        org.junit.Assert.assertTrue(s.checkForException(10, 1));
    }
    @Test public final void CheckConvert9toIX()
    {
        Symbol s = SymbolFactory.getSymbol("9");
        org.junit.Assert.assertEquals(s.convert(), "IX");
    }
    @Test public final void Check40ForExceptionCheck()
    {
        Symbol s = SymbolFactory.getSymbol("40");
        org.junit.Assert.assertTrue(s.checkForException(50, 10));
    }
    @Test public final void CheckConvert40ToXL()
    {
        Symbol s = SymbolFactory.getSymbol("40");
        org.junit.Assert.assertEquals(s.convert(), "XL");
    }
    @Test public final void Check90ForExceptionCheck()
    {
        Symbol s = SymbolFactory.getSymbol("90");
        org.junit.Assert.assertTrue(s.checkForException(100, 10));
    }
    @Test public final void CheckConvert90ToCD()
    {
        Symbol s = SymbolFactory.getSymbol("90");
        org.junit.Assert.assertEquals(s.convert(), "XC");
    }
    @Test public final void Check400ForExceptionCheck()
    {
        Symbol s = SymbolFactory.getSymbol("400");
        org.junit.Assert.assertTrue(s.checkForException(500, 100));
    }
    @Test public final void CheckConvert400ToCD()
    {
        Symbol s = SymbolFactory.getSymbol("400");
        org.junit.Assert.assertEquals(s.convert(), "CD");
    }
    @Test public final void Check900ForExceptionCheck()
    {
        Symbol s = SymbolFactory.getSymbol("900");
        org.junit.Assert.assertTrue(s.checkForException(1000, 100));
    }
    @Test public final void CheckConvert900ToCD()
    {
        Symbol s = SymbolFactory.getSymbol("900");
        org.junit.Assert.assertEquals(s.convert(), "CM");
    }
}
