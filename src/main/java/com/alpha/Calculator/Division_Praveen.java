package com.alpha.Calculator;

import java.util.Scanner;

public class Division_Praveen {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n1=sc.nextInt();
		System.out.println("Enter a Number");
		int n2=sc.nextInt();
		if(n1>n2)
		    System.out.println("The Product of the given numbers id :"+" " +n1/n2);
		else 
			System.out.println("The Product of the given numbers id :"+" " +n2/n1);
		
	}

}
