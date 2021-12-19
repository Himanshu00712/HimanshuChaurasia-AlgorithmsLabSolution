package com.greatlearning.dsa;

import java.util.Scanner;

public class Transaction {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction array :");
		int n = sc.nextInt();
		System.out.println("Enter the values of array :");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		System.out.println("Enter the total no of targets that needs to be achieved :");
		int numTarget = sc.nextInt();

		while (numTarget != 0) {
			int flag = 0;
			long target;

			System.out.println("Enter the value of target :");
			target = sc.nextInt();
			long sum = 0;

			for (int i = 0; i < n; i++) {
				sum = sum + arr[i];
				if (sum >= target) {
					System.out.println("Target achieved after " + (i + 1) + " transactions");
					flag = 1;
					break;

				}

			}
			if (flag == 0)
				System.out.println("Given target is not achieved");

			numTarget--;
		}
	}

}
