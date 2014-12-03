import java.util.Map; 
import java.util.HashMap; 

public class Roman implements Symbol
{
   private String roman;
   
   private Map<Character, Integer> romanLookup;

   public Roman(String str)
   {
       roman = str;

       romanLookup = new HashMap<Character, Integer>();
       romanLookup.put('I', 1);
       romanLookup.put('V', 5);
       romanLookup.put('X', 10);
       romanLookup.put('L', 50);
       romanLookup.put('C', 100);
       romanLookup.put('D', 500);
       romanLookup.put('M', 1000);
   }

   public void convert()
   {  
       int num = 0;
       for (int i = 0; i < roman.length(); i++)
       {
           // check for exception case
           if (i < roman.length() - 1 && checkForException(i, i+1)) 
           {
               num += romanLookup.get(roman.charAt(i+1)) - romanLookup.get(roman.charAt(i));
               i++; // skip a num 
           }
           else
           {
              num += romanLookup.get(roman.charAt(i));
           }
       }
       System.out.println(num);
    }

    public boolean checkForException(int off1, int off2)
    {
           return (romanLookup.get(roman.charAt(off1)) < romanLookup.get(roman.charAt(off2)));
    }
}
