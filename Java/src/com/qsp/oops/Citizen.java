package com.qsp.oops;
import java.util.Scanner;
public class Citizen {
	public static void login()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Country Name");
		String a = s.nextLine();
		String b = "India";
		if(a.equalsIgnoreCase(b))
		{
			System.out.println("Welcome to India");
		}
		else
		{
			throw new NoSuchCountryException("India is the only Country");
		}
	}
	public static void main (String[]args)
	{
		try
		{
			Citizen.login();
		}
		finally
		{
			System.out.println("Thank you Visit Again");
		}
	}

}
