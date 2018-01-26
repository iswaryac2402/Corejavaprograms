package com.tek.general;

public class MoreFor {
	public void doingMoreFor() {
		for (int num = 1, val = 4; num < val; num++, val--) {
			System.out.println("num=" + num);
			System.out.println("val=" + val);
		}
	}

	public static void main(String[] args) {
		MoreFor ob = new MoreFor();
		ob.doingMoreFor();
	}
}
