package com.qa.main;

public class Q1_Numbers {
	void crossSum(int Num1) {
		int units = Num1 % 10;
		int tens = Num1 / 10;
		int crossSum = units + tens;
		System.out.println(tens + " + " + units + " = " + crossSum);
	}

	String nameThatNumber(int num) {
		final String[] unitsName = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
				"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
		final String[] tensName = { "", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty",
				"ninety" };
		if (num < 20) {
			return unitsName[num];
		} else if (num > 99) {
			System.out.println("You're supposed to enter a number n where 0<n<100.");
			return null;
		} else {
			int tens = num / 10;
			int units = num % 10;
			String fullName;
			fullName = tensName[tens] + " " + unitsName[units];
			return fullName;
		}
	}
}
