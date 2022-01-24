package codes;
public class throw_Example {
public static void main(String[] args) {
	String str1="Hello india";
	String str2="Hello India";
	if(str1.equals(str2))
	{
	System.out.println("strings are equal");
	}
	else {
		try {
	throw new Error("String are not equal");
	}catch(Throwable t)
		{
		System.out.println(t.getMessage());
		}
		finally { System.out.println("iam executing");
		}
		}
	}
	}

