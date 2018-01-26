package com.tek.general;

public class BlockForEach {
	int numbers[] = { 5, 6, 7, 8, 9 };
	int sum = 0;

	public BlockForEach() {
		for (int values : numbers) {
			System.out.println("Value is :" + values);
			sum += values;
			if (values == 7)
				break;
		}
	}

	public static void main(String[] args) {
		BlockForEach obj = new BlockForEach();
	}

}
