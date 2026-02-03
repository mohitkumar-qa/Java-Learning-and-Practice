package com.practice.beginner;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Sum of natural number from 1 to ");
		int num = scan.nextInt();
		
		int total = 0;
		
		for(int i=1;i<=num;i++) 
		{
			total=total+i;
		}
		System.out.println("Answer :" +total);
		
		scan.close();
	}
	
	
}
