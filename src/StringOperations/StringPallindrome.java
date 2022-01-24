package StringOperations;

import java.util.Scanner;

public class StringPallindrome {

	public static void main(String[] args) 
	{
	
      String original;
      System.out.println("Eneter a String :- ");
      Scanner sc=new Scanner(System.in);
      original=sc.next();
      sc.close();
      StringPallindrome objsStringPallindrome=new StringPallindrome();
      objsStringPallindrome.reverse(original);
     String s1="rrrr";
      String s2="rrrr";
      if(s1==s2)
      {
    	  System.out.println("Equlas");
    	  
      }
      else
    	  System.out.println("Not Equals");
      
	}
	
	public void reverse(String original)
	{
		String store=original;
		System.out.println("store is :-" +store);
		String rev="rrrr";
		
//		char[]ch=original.toCharArray();
//		
//		for(int i=ch.length-1;i>=0;i--)
//		{
//         rev=rev+original.charAt(i);
//	    }
//		System.out.println("Reverse String is "+rev);
//		
//		System.out.println("Leng of string "+original.length()+"     "+rev.length());
		
		if(original.equals(rev))
		{
			System.out.println("String is pallindrome");
		}
		else
		{
			System.out.println("String is not pallindrome");
		}
	}

}
