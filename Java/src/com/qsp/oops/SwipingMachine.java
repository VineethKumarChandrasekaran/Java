package com.qsp.oops;

public class SwipingMachine {

	public static void main(String[] args) {
		DebitCard d=new DebitCard();
		SwipingMachine.swipe(d);
		}
public static void swipe(Card x)
{
	x.payment();
	x.view();
	if(x instanceof DebitCard)
	{
		DebitCard a=(DebitCard)x;
		a.reduceBal();
	}
	else
	{
		CreditCard b=(CreditCard)x;
		b.reduceLimit();
	}
}
}
