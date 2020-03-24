package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		Q1_Numbers Numbers = new Q1_Numbers();
		Numbers.crossSum(42);
		Numbers.crossSum(99);
		Numbers.crossSum(1);
		
		System.out.println(Numbers.nameThatNumber(55));
		System.out.println(Numbers.nameThatNumber(9));
		System.out.println(Numbers.nameThatNumber(99));
		
		System.out.println("\n"); //now up to 999
		Q2_NumbersTo999 Numbers2 = new Q2_NumbersTo999();
		System.out.println(Numbers2.nameThatNumber(455));
		System.out.println(Numbers2.nameThatNumber(17));
		System.out.println(Numbers2.nameThatNumber(898));
		
		System.out.println("\n"); //now up to 9999
		Q3_NumersTo9999 Numbers3 = new Q3_NumersTo9999();
		System.out.println(Numbers3.nameThatNumber(5248));
		System.out.println(Numbers3.nameThatNumber(17));
		System.out.println(Numbers3.nameThatNumber(8984));
		System.out.println(Numbers3.nameThatNumber(7077));
		System.out.println(Numbers3.nameThatNumber(10000));
		
	}

}
