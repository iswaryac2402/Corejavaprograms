package com.tek.general;

public class IfElse {
	private int quantity;
	double price;

	public IfElse(int quantity, double price) {
		this.quantity = quantity;
		this.price = price;
	}

	public void operation() {
		if (quantity < 0) {
			System.out.println("Price value is:" + quantity);
		} else
			System.out.println("quantity must be decreased");
	}

	public static void main(String[] args) {
		IfElse pricequantity = new IfElse(10, 50.06);
		pricequantity.operation();

	}

}
