package com.tek.general;

public class Switch {
	char choice;

	public void display() {
		switch (choice = 'M') {
		case 'Y':
			System.out.println("Yes");
			break;
		case 'M':
			System.out.println("Maybe");
			break;
		case 'N':
			System.out.println("No");
			break;
		default:
			System.out.println("Invalid response");
		}
	}

	public static void main(String[] args) {
		Switch demoobj = new Switch();
		demoobj.display();
	}
}
