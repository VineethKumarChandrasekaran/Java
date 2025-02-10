package com.tekpyramid.arrayprograms;

import java.util.LinkedHashSet;

public class TargetSum {

	public static void main(String[] args) {
		int a[] = {10,5,7,8,6,9,9,10,7};
        int sum = 15;
        LinkedHashSet hash = new LinkedHashSet();
        
        for(int i=0; i<a.length-1; i++) {
        	for(int j=i+1; j<=a.length-1; j++) {
        		if (a[i]+a[j]==sum) {
        			String result = a[i]<a[j]?"("+a[i]+","+a[j]+")":"("+a[j]+","+a[i]+")";
        			hash.add(result);
				}
        	}
        }
        System.out.println(hash);
	}

}
