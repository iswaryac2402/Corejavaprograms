package com.tek.general;

public class Character {
	char letter = 'i', id = '8';

	public void display() {
		System.out.println(letter + " " + id);
	}

	public static void main(String[] args) {
		Character obj = new Character();
		obj.display();
	}
}
