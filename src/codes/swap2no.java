package codes;

import java.util.Scanner;

public class swap2no
{
	public static void main(String[] args)
	{
		//Using third variable
		int no1,no2,temp;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter firsrt number"+"\n");
		no1=s.nextInt();
		System.out.println("Enter second number"+"\n");
		no2=s.nextInt();
		System.out.println("before swap first number is "+no1);
		System.out.println("before swap second number is "+no2);
		temp=no1;
		no1=no2;
		no2=temp;
		System.out.println("after swap first number is "+no1);
		System.out.println("after swap second number is "+no2);
		s.close();
		//without using third variable
		/*
		int a=100,b=50;
		a=a-b;//50
		b=a;//100
		System.out.println("first number is "+a);
		System.out.println("second number is "+b);
		*/

	}

}
