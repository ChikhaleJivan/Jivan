package codes;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations 
{
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("Inside before suite");
	}
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("Inside after suite");
	}
	@BeforeTest
	public void beforetest()
	{
		System.out.println("Inside before test");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("Inside aftertest");
	}
	@BeforeClass 
	public void beforeclass()
	{
		System.out.println("Inside beforeclass");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("Inside after class");
	}
	@BeforeMethod 
	public void beforemethod()
	{
		System.out.println("Inside before method");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("Inside after method");
	}
	@BeforeGroups
	public void beforegroup()
	{
		System.out.println("Inside before group");
	}
	@AfterGroups 
	public void aftergroup()
	{
		System.out.println("Inside after group");
	}
	@Test
	public void test()
	{
		System.out.println("Jivan Chikhale");
	}

}
