package com.tek.general;

public class SampleArray {
	public int roll_no;
	public String name;

	public SampleArray(int roll_no, String name) {
		this.roll_no = roll_no;
		this.name = name;
	}

	public static void main(String[] args) {
		SampleArray size = new SampleArray(10, "ish");
		System.out.println(size.roll_no + size.name);

	}

}
