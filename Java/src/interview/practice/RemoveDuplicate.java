package interview.practice;
import java.util.*;
public class RemoveDuplicate {

	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the String");
    String a = s.nextLine().toLowerCase();
    String b = "";
    for(int i=0; i<=a.length()-1; i++) {
    	char ch = a.charAt(i);
    	if(b.indexOf(ch)==-1) {
    		int count =0;
    	
    	for(int j=0; j<a.length(); j++) {
    		if(ch==a.charAt(j)) {
    			count++;
    		}
    		if(count>=1) {
    			System.out.println(ch);
    		}
    	}	
    }
    	b+=ch;
	}
	}
}
