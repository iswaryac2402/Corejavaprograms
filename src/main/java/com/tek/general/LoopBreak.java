package com.tek.general;

public class LoopBreak {
	public void stopLoop() {
		for (int num = 0; num < 100; num++) {
			if (num == 10)
				break;
			System.out.println("num:" + num + "\n");
		}
	}

	public static void main(String[] args) {
		LoopBreak obj = new LoopBreak();
		obj.stopLoop();
	}
}
