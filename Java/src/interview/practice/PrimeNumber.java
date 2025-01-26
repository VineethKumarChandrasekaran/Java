package interview.practice;

import java.util.*;

public class PrimeNumber {
	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the number :");
    int a = s.nextInt();
    if(isPrime(a)) {
    	System.out.println("The given number is Prime Number");
    }else {
    	System.out.println("The given Number is not a Prime Number");
    }
	}
	public static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2; i<=n/2;i++) {
			if(n%2==0) {
				return false;
			}
		}
		return true;
	}
}
