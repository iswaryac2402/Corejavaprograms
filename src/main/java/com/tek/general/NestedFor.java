package com.tek.general;

public class NestedFor {
	int num, val;

	public void doingNestedFor() {
		for (num = 0; num < 10; num++) {
			for (val = num; val < 10; val++)
				System.out.println(+num + " " + val);
		}
	}

	public static void main(String[] args) {
		NestedFor object = new NestedFor();
		object.doingNestedFor();
	}
}
