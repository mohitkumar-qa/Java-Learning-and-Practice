package com.practice.beginner;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int num = scan.nextInt();
		
		boolean isPrime = true;
		
		if(num<=1) {
			isPrime = false;
		}else {
			// we can also take num/2 instead of num
			for(int i=2;i<num;i++) {   
				if(num%i==0) {
					isPrime = false;
					break;
				}
				}
			}
		if(isPrime) {
			System.out.println(num+" is a prime number");
		}else {
			System.out.println(num+" is not a prime number");
		}
		
		scan.close();
	}
	
}

