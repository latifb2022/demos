package com.lbenzzine.interfaces;

import java.util.*;

interface InterfaceExample {
	int divisorSum(int n);
}

class Calculator implements InterfaceExample {

	/*
	 * Method Name: divisorSum
	 * 
	 * @return an int denoting the sum of all divisors of a given n int.
	 */
	public int divisorSum(int n) {
		int sum = 0;
		for (int i = 1; i < n + 1; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		return sum;
	}
}

class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
			// every class in Java is an Object
		InterfaceExample myCalculator = new Calculator();
		int sum = myCalculator.divisorSum(n);
		System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
		System.out.println(sum);
	}
}