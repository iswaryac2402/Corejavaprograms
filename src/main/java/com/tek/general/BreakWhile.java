package com.tek.general;

public class BreakWhile {
	int num = 0;

	public void showBreakWhile() {
		while (num < 100) {
			if (num == 10)
				break;
			System.out.println("num: " + num);
			num++;
		}
		System.out.println("Loop complete.");
	}

	public static void main(String[] args) {
		BreakWhile obj = new BreakWhile();
		obj.showBreakWhile();
	}
}
