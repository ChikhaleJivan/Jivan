package codes;
import java.util.Scanner;
public class StringReverse 
{
 public static void main(String [] args)
  {
   String s;
   StringReverse obj= new StringReverse();
   System.out.println("Enter a String:");
   Scanner sc = new Scanner(System.in);
   s = sc.next();
   obj.ReverseString(s);
   System.out.println("\n operation completed");
   sc.close();
  }
 public void ReverseString(String s)
  {
   char[]ch=s.toCharArray();
   System.out.println("length is :-"+ch.length);
   System.out.println("Reverse is :-");
   for(int i=ch.length-1;i>=0;i--)
    {
     System.out.print(ch[i]); 
    }
  }	
}
