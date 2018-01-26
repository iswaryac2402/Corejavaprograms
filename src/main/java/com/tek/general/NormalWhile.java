package com.tek.general;

public class NormalWhile {
	int value, number;

	public void whileOperation(int value, int number) {
		while (++value < --number)
			;
		System.out.println("Midpoint of value is:" + value);
	}

	public static void main(String[] args) {
		NormalWhile obj = new NormalWhile();
		obj.whileOperation(10, 11);

	}

}
