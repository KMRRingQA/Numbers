package com.qa.main;

public class Q2_NumbersTo999 {
	void crossSum(int Num1) {
		int Einerstelle = Num1%10;
		int Zehnerstelle = Num1/10;
		int Quersumme = Einerstelle + Zehnerstelle;
		System.out.println(Zehnerstelle + " + " + Einerstelle + " = " + Quersumme);
	}
	String nameThatNumber (int Num1) {
		final String[] EinerstelleName = {
	            "zero", "one", "two", "three", "four", "five", "six", "seven",
	            "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen",
	            "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
	    };
		final String[] ZehnerstelleName = {
				"", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"
		};
		if (Num1<20) {
			return EinerstelleName[Num1];
		}
		else if (Num1>999) {
			System.out.println("You're supposed to enter a number n where 0<n<1000.");
			return null;
		}
		else if (Num1<99) {
			int Zehnerstelle = Num1/10;
			int Einerstelle = Num1%10;
			String FullName;
			FullName = ZehnerstelleName[Zehnerstelle] + "-" + EinerstelleName[Einerstelle];
			return FullName;
		}
		else {
			int Hunderterstelle = Num1/100;
			int Zehnerstelle = (Num1/10)%10;
			int Einerstelle = Num1%10;
			String FullName;
			FullName = EinerstelleName[Hunderterstelle] + " hundred and "+ ZehnerstelleName[Zehnerstelle] + "-" + EinerstelleName[Einerstelle];
			return FullName;
		}
	}
}
