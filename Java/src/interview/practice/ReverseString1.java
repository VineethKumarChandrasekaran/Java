package interview.practice;
import java.util.*;
public class ReverseString1 {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the String : ");
    String a = s.nextLine();
    String b ="";
    for(int i=a.length()-1;i>=0;i--) {
    	b+=a.charAt(i);
    }
    System.out.println("The Reverse of the given String is "+b);
	}
}
