package codes;
import java.util.Scanner;
public class areaofcircle
{
 public static void main(String[] args) 
  {
   int radious;
   double area;
   Scanner s=new Scanner(System.in);
   System.out.println("enter radious");
   radious=s.nextInt();
   area=3.14*radious*radious;
   System.out.println("area of circle is "+area);
   s.close();
  }
}
