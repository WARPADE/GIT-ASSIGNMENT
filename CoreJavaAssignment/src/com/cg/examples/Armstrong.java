//find out if the given number is an armstrong number.
//logic :if 153 is supplied value then 1^3+5^3+3^3=1+125+27=153
//this is the same as supplied value hence it is an armstong number
package com.cg.examples;

public class Armstrong {

	public static void main(String[] args) {

		int number = 153, originalNumber, remainder, result = 0;

		originalNumber = number;

		while (originalNumber != 0) {
			remainder = originalNumber % 10;
			result += Math.pow(remainder, 3);
			originalNumber /= 10;
		}

		if (result == number)
			System.out.println(number + " is an Armstrong number.");
		else
			System.out.println(number + " is not an Armstrong number.");
	}
}