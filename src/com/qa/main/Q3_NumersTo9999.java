package com.qa.main;

public class Q3_NumersTo9999 {

	// for test purposes:
	/*
	 * public static void main(String[] args) { Q3_NumersTo9999 Numbers = new
	 * Q3_NumersTo9999(); System.out.println(Numbers.nameThatNumber(9065)); }
	 */
	void crossSum(int Num1) {
		int units = Num1 % 10;
		// There is no good English word to describe the last digit of a number. This is
		// a German word instead.
		int tens = Num1 / 10;
		// There is no good English word to describe the second last digit of a number.
		// This is a German word instead.
		int crossSum = units + tens;
		// I'm feeling the German variable names atm.
		System.out.println(tens + " + " + units + " = " + crossSum);
	}

	String nameThatNumber(int Num) {
		String fullName;
		int tens = 0;
		int units = 0;
		int hundreds = 0;
		int thousands = 0;
		final String[] unitsName = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
				"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
		final String[] tensName = { "", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty",
				"ninety" };
		if (Num < 20) {
			return unitsName[Num];
		} else if (Num > 9999) {
			System.out.println("You're supposed to enter a number n where 0<n<1000.");
			return null;
		} else if (Num < 100) {
			if (Num % 10 == 0) {
				tens = Num / 10;
				fullName = tensName[tens];
				return fullName;
			} else {
				tens = Num / 10;
				units = Num % 10;
				fullName = tensName[tens] + "-" + unitsName[units];
				return fullName;
			}
		} else if (Num < 1000) {
			hundreds = Num / 100;
			if (Num % 100 == 0) {
				fullName = unitsName[hundreds] + " hundred ";
				return fullName;
			}
			if (Num % 100 < 20) {
				units = Num % 100;
				fullName = unitsName[hundreds] + " hundred and " + unitsName[units];
				return fullName;
			}
			if (Num % 10 == 0) {
				tens = (Num / 10) % 10;
				units = Num % 10;
				fullName = unitsName[hundreds] + " hundred and " + tensName[tens] + " " + unitsName[units];
				return fullName;
			} else {
				tens = (Num / 10) % 10;
				units = Num % 10;
				fullName = unitsName[hundreds] + " hundred and " + tensName[tens] + "-" + unitsName[units];
				return fullName;
			}
		} else {
			if (Num % 1000 == 0) {
				thousands = Num / 1000;
				fullName = unitsName[thousands] + " thousand";
				return fullName;
			} else if (Num % 1000 < 20) {
				thousands = Num / 1000;
				tens = (Num / 100) % 10;
				units = Num % 1000;
				fullName = unitsName[thousands] + " thousand and " + tensName[tens] + unitsName[units];
				return fullName;
			} else if (Num % 1000 < 100) {
				if (Num % 10 == 0) {
					thousands = Num / 1000;
					tens = (Num / 10) % 10;
					fullName = unitsName[thousands] + " thousand and " + tensName[tens];
					return fullName;
				} else {
					thousands = Num / 1000;
					tens = (Num / 10) % 10;
					units = Num % 10;
					fullName = unitsName[thousands] + " thousand and " + tensName[tens] + "-" + unitsName[units];
					return fullName;
				}
			} else {
				if (Num % 100 == 0) {
					hundreds = (Num / 100) % 10;
					thousands = Num / 1000;
					fullName = unitsName[thousands] + " thousand " + unitsName[hundreds] + " hundred";
					return fullName;
				} else if (Num % 100 < 20) {
					units = Num % 100;
					hundreds = (Num / 100) % 10;
					thousands = Num / 1000;
					fullName = unitsName[thousands] + " thousand " + unitsName[hundreds] + " hundred and "
							+ unitsName[units];
					return fullName;
				} else if (Num % 10 == 0) {
					thousands = Num / 1000;
					hundreds = (Num / 100) % 10;
					tens = (Num / 10) % 10;
					fullName = unitsName[thousands] + " thousand " + unitsName[hundreds] + " hundred and "
							+ tensName[tens];
					return fullName;
				} else {
					thousands = Num / 1000;
					hundreds = (Num / 100) % 10;
					tens = (Num / 10) % 10;
					units = Num % 10;
					fullName = unitsName[thousands] + " thousand " + unitsName[hundreds] + " hundred and "
							+ tensName[tens] + "-" + unitsName[units];
					return fullName;
				}
			}
		}
	}
}