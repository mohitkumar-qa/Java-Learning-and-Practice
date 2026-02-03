package com.practice.beginner;

public class LargestNumber {
	
	public static void main(String[] args) {
		
		int num1 = 151;
		int num2 = 120;
		int num3 = 150;
		
		if(num1>=num2 && num1>=num3) {
			System.out.println("Largest Number: "+num1);
		} else if(num2>=num3 && num2>=num1) {
			System.out.println("Largest number is "+num2);
		} else {
			System.out.println("Largest number is "+num3);
		}
		
		
	}

}
