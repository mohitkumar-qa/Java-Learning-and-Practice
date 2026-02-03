package com.practice.beginner;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		// Scanner class used to take input from the console
		Scanner scan = new Scanner(System.in); 
		
		System.out.print("Enter a number: ");
		int num = scan.nextInt();
		
		
		
		if(num%2==0){
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
		
		System.out.println();
		// using boolean value
		
		boolean isEven = (num%2==0);
		
		if(isEven) {
			System.out.println(num+" is Even");
		}else {
			System.out.println(num+" is Odd");
		}
		
		
		
		
		scan.close();
		
	}
}
