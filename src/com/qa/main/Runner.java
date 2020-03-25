package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		Q1_Numbers Numbers = new Q1_Numbers();
		Numbers.crossSum(42);
		Numbers.crossSum(99);
		Numbers.crossSum(1);
		
		System.out.println(Numbers.nameThatNumber(55));
		System.out.println(Numbers.nameThatNumber(19));
		System.out.println(Numbers.nameThatNumber(99));
		
		System.out.println("\n"); //now up to 999
		Q2_NumbersTo999 Numbers2 = new Q2_NumbersTo999();
		System.out.println(Numbers2.nameThatNumber(111));
		System.out.println(Numbers2.nameThatNumber(17));
		System.out.println(Numbers2.nameThatNumber(858));
		
		System.out.println("\n"); //now up to 9999, some examples:
		Q3_NumersTo9999 Numbers3 = new Q3_NumersTo9999();
		System.out.println(Numbers3.nameThatNumber(1000));
		System.out.println(Numbers3.nameThatNumber(7016));
		System.out.println(Numbers3.nameThatNumber(17));
		System.out.println(Numbers3.nameThatNumber(8585));
		System.out.println(Numbers3.nameThatNumber(7770));
		System.out.println(Numbers3.nameThatNumber(7700));
		System.out.println(Numbers3.nameThatNumber(10000));
		
	}

}
