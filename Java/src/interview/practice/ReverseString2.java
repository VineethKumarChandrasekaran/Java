package interview.practice;
import java.util.*;
public class ReverseString2 {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the String : ");
    String a = s.nextLine();
    char ch[] = a.toCharArray();
    int i=0,j=a.length()-1;
    while(i<j) {
    	char temp = ch[i];
    	ch[i] = ch[j];
    	ch[j] = temp;
    	i++;j--;
    }
    String b = new String(ch);
    System.out.println("The Reverse of the given String is "+b);	
    s.close();
	}
}
