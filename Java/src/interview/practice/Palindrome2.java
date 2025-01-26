package interview.practice;
import java.util.*;
public class Palindrome2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String : ");
	    String a = s.nextLine();
	    char ch[] = a.toCharArray();
	    int i=0,j=a.length()-1;
	    boolean b = true;
	    while(i<j) {
	    	if (ch[i]!=ch[j]) {
			    b = false;
			    break;
			} 
	    	i++;j--;
	    }
     if (b==true) {
		System.out.println("The given String is a Palindrome");
	} else {
		System.out.println("The given String is not a Palindrome");
	}
     s.close();
	}
}
