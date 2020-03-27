package com.qa.main;

public class Q2_NumbersTo999 {
	void crossSum(int Num1) {
		int unit = Num1 % 10;
		int tens = Num1 / 10;
		int crossSum = unit + tens;
		System.out.println(tens + " + " + unit + " = " + crossSum);
	}

	String nameThatNumber(int Num1) {
		final String[] unitsName = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
				"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
		final String[] tensName = { "", "one", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty",
				"ninety" };
		if (Num1 < 20) {
			return unitsName[Num1];
		} else if (Num1 > 999) {
			System.out.println("You're supposed to enter a number n where 0<n<1000.");
			return null;
		} else if (Num1 < 100) {
			if (Num1 % 10 == 0) {
				int tens = Num1 / 10;
				String fullName;
				fullName = tensName[tens];
				return fullName;
			} else {
				int tens = Num1 / 10;
				int units = Num1 % 10;
				String fullName;
				fullName = tensName[tens] + "-" + unitsName[units];
				return fullName;
			}
		} else {
			int hundreds = Num1 / 100;
			if (Num1 % 100 == 0) {
				String fullName;
				fullName = unitsName[hundreds] + " hundred ";
				return fullName;
			}
			if (Num1 % 100 < 20) {
				int units = Num1 % 100;
				String fullName;
				fullName = unitsName[hundreds] + " hundred and " + unitsName[units];
				return fullName;
			}
			if (Num1 % 10 == 0) {
				int tens = (Num1 / 10) % 10;
				int units = Num1 % 10;
				String fullName;
				fullName = unitsName[hundreds] + " hundred and " + tensName[tens] + " " + unitsName[units];
				return fullName;
			} else {
				int tens = (Num1 / 10) % 10;
				int units = Num1 % 10;
				String fullName;
				fullName = unitsName[hundreds] + " hundred and " + tensName[tens] + "-" + unitsName[units];
				return fullName;
			}
		}
	}
}
