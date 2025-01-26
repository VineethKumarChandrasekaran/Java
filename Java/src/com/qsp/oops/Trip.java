package com.qsp.oops;
import java.util.Scanner;
public class Trip {
static int tw;
static int fw;
	public static void main(String[]args) {
boolean a;
do {
	Scanner s = new Scanner (System.in);
	System.out.println("Select the Vehicle - Two Wheeler or Four Wheeler");
	System.out.println("Enter 1 for Two Wheeler");
	System.out.println("Enter 2 for Four Wheeler");
	int n=s.nextInt();
	switch(n)
	{
	case 1: TwoWheeler t = new TwoWheeler();
	Trip.enter(t);
	break;
	case 2: FourWheeler f = new FourWheeler();
	Trip.enter(f);
	break;
	default: System.out.println("Invalid Output");
	}
	System.out.println("Enter True to Repeat or Enter False to Exit");
	a=s.nextBoolean();
} while(a);
System.out.println("Total Two Wheeler :"+tw);
System.out.println("Total Four Wheeler :"+fw);
System.out.println("Total Vehicle :"+(tw+fw));
	}
public static void enter(Vehicle z)	
{
	z.parking();
	if(z instanceof TwoWheeler)
	{
		tw++;
	}
	else
	{
		fw++;
	}
}
}
