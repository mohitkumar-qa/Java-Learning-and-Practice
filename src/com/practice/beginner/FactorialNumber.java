package com.practice.beginner;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int num = scan.nextInt();
		
		long fact =1;
		
		if(num<0) {
			System.out.println("Factorial is not defined for negative numbers" );
		}else {
			for(int i=1;i<=num;i++) {
				fact=fact*i;
			}
			
		System.out.println("Factorial: "+fact);
			
		}
		
scan.close();	
	}
}


