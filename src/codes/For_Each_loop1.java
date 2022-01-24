package codes;
public class For_Each_loop1 
{
	public static void main(String[] args)
	{
		//store numbers in array variable
		int num[]= {100,300,400,500,43,56,67,89};
		for(int each:num)
			{
			System.out.println(each);
			}
		System.out.println("====================");
		System.out.println(num[6]);
		System.out.println(num[0]);
		System.out.println("==============using for loop==========");
		for(int i=0;i<num.length;i++)
			{
			System.out.println(num[i]);
			}
	}
}
