package codes;
public class For_Each_loop 
{
	public static void main(String[] args) 
	{
		//store weekdays into array variable
		String weekdays[]= {"mon","tue","wed","thu","fri","sat","sun"};
		//print only sat from collection
		System.out.println(weekdays[5]);
		System.out.println("================");
		//print each day one by one in single dimension
		for(String eachday:weekdays)
			{
			System.out.println(eachday);
			}
	}
}
