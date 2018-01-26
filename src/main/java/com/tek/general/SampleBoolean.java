package com.tek.general;

public class SampleBoolean {
	boolean value = true;

	public void value() {
		if (value == true) {
			System.out.println("This is executed");
		} else {
			System.out.println("This is not executed");
		}
	}

	public static void main(String[] args) {
		SampleBoolean object = new SampleBoolean();
		object.value();
	}
}
