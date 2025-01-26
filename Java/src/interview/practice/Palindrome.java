package interview.practice;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the String : ");
    String a = s.nextLine();
    char b[] = a.toCharArray();
    char c[] = new char[a.length()];
    for(int i=a.length()-1, j=0; i>=0; i--,j++) {
    	c[j] = a.charAt(i);
    }
    String d = new String(c);
    System.out.println("The Reverse of the String is : "+d);
    if(d.equalsIgnoreCase(a)) {
    	System.out.println("The given String is a Palindrome");
    }else {
    	System.out.println("The given String is not a Palindrome");
    }
	}

}
