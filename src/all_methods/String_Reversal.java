package all_methods;
public class String_Reversal 
{
 public static void main(String[] args) 
  {
   String name="Jivan",str="";
   for(int i=name.length()-1;i>=0;i--)
    {
     str=str+name.charAt(i);
    }
   System.out.println(str);
  }
}
