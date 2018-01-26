package com.tek.general;

public class PrimeNumber {
	int num = 9;

	public void findingPrime() {
		for (int value = 2; value <= num / value; value++)
			if (num % value == 0) {
				System.out.println("it is a prime number");
			} else {
				System.out.println("it is not a prime number");
			}
	}

	public static void main(String[] args) {
		PrimeNumber create = new PrimeNumber();
		create.findingPrime();
	}
}
