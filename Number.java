public class Number implements Symbol
{
   private int num;
   
   private TreeMap<Integer, Character> romanLookup;

   public Number(int n)
   {
       num = n;

       romanLookup = new TreeMap<Integer, Character>(Collections.reverseOrder());
       romanLookup.put(1,'I');
       romanLookup.put(5,'V');
       romanLookup.put(10,'X');
       romanLookup.put(50,'L');
       romanLookup.put(100,'C');
       romanLookup.put(500,'D');
       romanLookup.put(1000,'M');
   }

   public void convert()
   {  
       Set set     = romanLookup.keySet();
       Iterator it = set.iterator();
       while (it.hasNext())
       {
           int currLookupNum = (Integer) it.next();
           if (num >= currLookupNum)
           {
              int divNum = (Integer) num / currLookupNum;
              for (int j = 0; j < divNum; j++)
              {
                  System.out.print(romanLookup.get(currLookupNum));
              }
              num -= (divNum * currLookupNum);
           }
           // Before incrementing, check for exception case of X-1
           int exceptionUnit = getExceptionUnit(currLookupNum);
           if (checkForException(currLookupNum, exceptionUnit))
           {
               System.out.print(romanLookup.get(exceptionUnit));
               System.out.print(romanLookup.get(currLookupNum));
               
               num -= (currLookupNum - exceptionUnit);
           }
       } 
       System.out.println();
    }

    public boolean checkForException(int in, int exceptionUnit)
    {
        // Don't need to check num < in, since we've taken care of that in convert(); If reorganize logic, may need to add "&& num < in"
        return (num >= in - exceptionUnit && in != 1);
    }

    private int getExceptionUnit(int in)
    {
        int div = in; 
        while (div / 10 > 1)
        {
            div /= 10;
        }
        return in / div;
    }
}
