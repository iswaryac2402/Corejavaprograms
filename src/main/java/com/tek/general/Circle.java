package com.tek.general;

public class Circle {
	private double radius = 4;
	private double area;

	public void area() {
		area = 3.14 * (radius * radius);
		System.out.println("The area of circle is:" + area);
	}

	public static void main(String[] args) {
		Circle obj = new Circle();
		obj.area();
	}
}