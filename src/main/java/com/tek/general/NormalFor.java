package com.tek.general;

public class NormalFor {
	int num = 5;

	public void doingFor() {
		for (num = 5; num <= 10; num++) {
			System.out.println(+num);
		}
	}

	public static void main(String[] args) {
		NormalFor create = new NormalFor();
		create.doingFor();
	}
}
