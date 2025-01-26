package interview.practice;
import java.util.*;
public class DuplicateCharacters {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the String : ");
    String a = s.nextLine();
    String b ="";
    while(a.length()>0) {
    	char ch = a.charAt(0);
    	b=a.replace(ch+"", "");
    	int count = a.length()-b.length();
    	System.out.println(ch+" : "+count);
    	a=b;
    }
    s.close();
    }
}
