package com.qsp.oops;
import java.util.Scanner;
public class StringWordCount {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the String : ");
	String a = s.nextLine();
	char ch[]=a.toCharArray();
	int count=0;
	for(int i=0;i<=a.length()-1;i++)
	{
		if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
		{
			if(ch[i]>='a'&&ch[i]<='z')
			ch[i]=(char)(ch[i]-32);
		}
		else if(ch[i]>='A'&&ch[i]<='Z')
		{
			ch[i]=(char)(ch[i]+32);
		}
			
		System.out.print(ch[i]);
	}
	
	}

}
