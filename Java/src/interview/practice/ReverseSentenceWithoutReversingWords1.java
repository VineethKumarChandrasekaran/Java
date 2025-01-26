package interview.practice;
import java.util.*;
public class ReverseSentenceWithoutReversingWords1 {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the String : ");
    String a = s.nextLine();
    char ch[] = a.toCharArray();
    String b = "";
    for(int i=a.length()-1;i>=0;i--) {
    	b+=ch[i];
    }
    System.out.println(b);
	}

}
