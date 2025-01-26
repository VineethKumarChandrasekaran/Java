package interview.practice;
import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
    System.out.println("Enter the String : ");
    String a = s.nextLine();
    char b[] = a.toCharArray();
    char c[] = new char[a.length()];
    for(int i=a.length()-1, j=0; i>=0; i--,j++) {
    	c[j]= a.charAt(i);
    }
    String d = new String(c);
    System.out.println("The Resverse of the given String is : "+d);
	}

}
