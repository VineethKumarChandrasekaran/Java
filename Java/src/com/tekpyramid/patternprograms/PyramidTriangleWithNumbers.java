package com.tekpyramid.patternprograms;

public class PyramidTriangleWithNumbers {

	public static void main(String[] args) {
		int row =5;
		
		for(int i=1;i<=row;i++) {
			
			//space
			for(int j=1;j<=row-i;j++) {
				System.out.print("  ");//print spaces
			}
			
			//increasing number
			for(int k=1;k<=i;k++) {
				System.out.print(k+" ");
			}
			
			//decreasing number
			for(int l=i-1;l>=1;l--) {
				System.out.print(l+" ");
			}
			
			System.out.println();
		}

	}

}
