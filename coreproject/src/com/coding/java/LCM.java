package com.coding.java;
/*Algorithm
1. Initialize A and B with positive integers.
2. Store maximum of A & B to the max.
3. Check if max is divisible by A and B.
4. If divisible, Display max as LCM.
5. If not divisible then step increase max, go to step 3.*/
public class LCM {
	public static void main(String[] args) {
		int n1 = 72, n2 = 120, lcm, gcd = 1;
		/*
		 * we initially set lcm to the largest of the two numbers. This is
		 * because, LCM cannot be less than the largest number.
		 */

		// maximum number between n1 and n2 is stored in lcm
		lcm = (n1 > n2) ? n1 : n2;
		// Always true
		while (true) {
			if (lcm % n1 == 0 && lcm % n2 == 0) {
				System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
				break;
			}
			++lcm;
		}

		// calculate LCM using GCD
		/*
		 * We can also use GCD to find the LCM of two numbers using the
		 * following formula:
		 * 
		 * LCM = (n1 * n2) / GCD
		 */
		for (int i = 1; i <= n1 && i <= n2; ++i) {
			// Checks if i is factor of both integers
			if (n1 % i == 0 && n2 % i == 0)
				gcd = i;
					}
		System.out.println("GCD of Numbers"+gcd);
		 lcm = (n1 * n2) / gcd;
		 System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
	}
}