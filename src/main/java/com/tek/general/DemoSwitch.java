package com.tek.general;

public class DemoSwitch {
	public void demo() {
		for (int id = 0; id <= 10; id++) {
			switch (id) {
			case 0:
				System.out.println("id become zero");
			case 1:
				System.out.println("id is one");
				break;
			}
		}
	}

	public static void main(String[] args) {
		DemoSwitch example = new DemoSwitch();
		example.demo();
	}
}
