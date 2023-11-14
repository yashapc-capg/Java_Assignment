package com.cg;

public class Numbers {

	public static void main(String[] args) {
		int n[]= {1,2,3,4,5};
		//pyramid
		
		for(int i=0;i<n.length;i++) {
			for(int j=0;j<=i;j++) {
				
				System.out.print(n[j]);
				
			}
			System.out.println("");
		}
		//reverse pyramid
		
//		for(int i=0;i<n.length;i++) {
//			for(int j=0;j<n.length-i;j++) {
//				System.out.print(n[j]);
//			}
//			System.out.println("");
//		}
		
//		for(int i=0;i<n.length;i++) {
//			for(int j=0;j<=i;j++) {
//				System.out.print(n[i]);
//			}
//			System.out.println("");
//		}
		
//		for(int i=n.length-1;i>=0;i--) {
//			System.out.println(n[i]);
//		}
		
	}

}
