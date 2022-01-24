package codes;
import java.util.Scanner;
public class Maxof3no
{
	public static void main(String[] args)
	{
		int no1,no2,no3;
		Scanner s=new Scanner(System.in);
		System.out.println("enter first integer numbers"+"\n");
		no1=s.nextInt();
		System.out.println("enter first integer numbers"+"\n");
		no2=s.nextInt();
		System.out.println("enter first integer numbers"+"\n");
		no3=s.nextInt();
		if(no1>no2 && no1>no3)
		{
			System.out.println("number 1 is max"+no1);
		}
		else if(no2>no1 && no2>no3)
		{
			System.out.println("number 2 is max"+no2);
		}
		else
		{
			System.out.println("no 3 is max"+no3);
		}
		s.close();
	}

}
