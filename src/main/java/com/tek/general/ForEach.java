package com.tek.general;

public class ForEach {
	int numbers[] = { 5, 6, 7, 8, 9 };
	int sum = 0;

	public ForEach() {
		for (int values : numbers) {
			System.out.println("Value is :" + values);
			sum += values;
		}
	}

	public static void main(String[] args) {
		ForEach obj = new ForEach();
	}

}
