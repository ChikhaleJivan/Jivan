package codes;
import java.util.Scanner;
public class If_Condition 
{
	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		for(int i=1;i<=10;i++)
			{
			System.out.println("enter marks");
			int marks=obj.nextInt();
			if(marks>=35)
				{
				System.out.println("pass::"+marks);
				}
			else
				{
				System.out.println("fail::"+marks);
				}
			obj.close();
		    }
	}
}
