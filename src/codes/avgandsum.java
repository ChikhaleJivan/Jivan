package codes;
import java.util.Scanner;
public class avgandsum
{
 public static void main(String[] args)
  {
   int a,b,sum,avg;
   Scanner s=new Scanner(System.in);
   System.out.println("enterv no ");
   a=s.nextInt();
   System.out.println("enterv no ");
   b=s.nextInt();
   sum=a+b;
   avg=sum/2;
   System.out.println("average is "+avg);
   System.out.println("sum is "+sum);
   s.close();
  }
}
