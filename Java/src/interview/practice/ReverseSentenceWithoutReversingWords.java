package interview.practice;
import java.util.*;
public class ReverseSentenceWithoutReversingWords {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the String : ");
    String a = s.nextLine();
    String b[] =a.split(" ");
    for(int i=b.length-1;i>=0;i--) {
    	System.out.print(b[i]+" ");
    }
	}
}
