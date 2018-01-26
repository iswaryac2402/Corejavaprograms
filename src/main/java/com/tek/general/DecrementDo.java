package com.tek.general;

public class DecrementDo {
	int number = 10;

	public void doWhileOperation(int number) {
		do {
			System.out.println("print:" + number);
		} while (--number > 0);
	}

	public static void main(String[] args) {
		DecrementDo object = new DecrementDo();
		object.doWhileOperation(10);
	}
}
