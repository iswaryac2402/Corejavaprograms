package com.tek.general;

public class SampleWhile {
	public void doingWhile(int value) {
		while (value > 0) {
			System.out.println("print:" + value);
			value--;
		}
	}

	public static void main(String[] args) {
		SampleWhile object = new SampleWhile();
		object.doingWhile(6);
	}
}
