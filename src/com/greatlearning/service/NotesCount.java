package com.greatlearning.service;

public class NotesCount {

	public void notesCountImplementation(int[] arr, int amount) {

		int n = arr.length;

		int[] count = new int[n];
		try {
			for (int i = 0; i < n; i++) {
				if (amount >= arr[i]) {
					count[i] = amount / arr[i];
					amount = amount - count[i] * arr[i];

				}
			}

			if (amount > 0)
				System.out.println("Exact amount cannot be given with the highest denomination");
			else {
				System.out.println("Your payment approach in order to give min no of notes will be :");
				for (int i = 0; i < n; i++) {
					if (count[i] != 0) {
						System.out.println(arr[i] + " : " + count[i]);

					}
				}
			}
		} catch (ArithmeticException e) {
			System.out.println(e + "Notes of denomination 0 is invalid");
		}
	}
}
