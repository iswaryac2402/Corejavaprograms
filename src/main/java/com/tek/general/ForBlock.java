package com.tek.general;

public class ForBlock {
	public void blockFor() {
		int number = 5;
		for (int value1 = 0; value1 < 10; value1++) {
			System.out.println("displaying values are:" + value1 + "" + number);
			number = number - 10;
		}
	}

	public static void main(String[] args) {
		ForBlock obj = new ForBlock();
		obj.blockFor();
	}

}
