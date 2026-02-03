package com.practice.beginner;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// Hint: if number is 123 it is processed as 300+20+1
		
		System.out.print("Number: ");
		int num = scan.nextInt();
		
		int reverse = 0;
		
		while(num!=0){
		
			int digit = num%10;  			//Extract Last digit -->  123%10 = 3 -> 12%10	= 2  -> 1%10 = 1
			reverse = reverse*10+digit;		// 0*10+3 = 3 -> 3*10+2 = 32 -> 32*10+1 = 321
			num = num/10;					//Remove Last digit --> 123/10 =12 -> 12/10 = 1   -> 1/10 = 0 loop ended                
		}
		
		System.out.println("Reverse: "+reverse);
		
		scan.close();
		
	}
	
}
