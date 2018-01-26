package com.tek.general;

public class DoWhile {
	int number = 10;

	public void doWhileOperation(int number) {
		do {
			System.out.println("print:" + number);
			number--;
		} while (number > 0);
	}

	public static void main(String[] args) {
		DoWhile object = new DoWhile();
		object.doWhileOperation(10);

	}

}
