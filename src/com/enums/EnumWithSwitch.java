package com.enums;

import java.util.Scanner;

public class EnumWithSwitch {

	enum Temp {

		hot(50), mod(30), chill(20);

		int value;

		private Temp(int value) {
			this.value = value;
		}
	}

	public static void main(String[] args) {

		Temp t =Temp.hot;
		

		switch (t) {
		case hot:
			System.out.println("hot temp");
			break;
		case mod:
			System.out.println("cold temp");
			break;
		case chill:
			System.out.println("chill temp");
			break;

		default:
			System.out.println("invalid...");
			break;

		}

	}
}
