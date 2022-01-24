package codes;
public class String_Functions 
{
 public static void main(String[] args) 
  {
   String str1="Welcome to very wonderful world";
   String arrayvar[]=str1.split("very");
   System.out.print(arrayvar[0]);
   System.out.println(arrayvar[1]);
   String company="HCL@IBM@INFOSYS@TCS@DELOITE@GOOGLE";
   String var[]=company.split("@");
   System.out.println(var[4]);
   System.out.println("=======================");
   for(String each: var)
    {
     System.out.println(each);
    }
  }
}