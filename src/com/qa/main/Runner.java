package com.qa.main;

public class Runner {

	public static void main(String[] args) {
//		Q1_Numbers Numbers = new Q1_Numbers();
//		Numbers.crossSum(42);
//		Numbers.crossSum(99);
//		Numbers.crossSum(1);
//
//		System.out.println(Numbers.nameThatNumber(19));
//		System.out.println(Numbers.nameThatNumber(99));
//
//		System.out.println("\n"); // now up to 999
//		Q2_NumbersTo999 Numbers2 = new Q2_NumbersTo999();
//		System.out.println(Numbers2.nameThatNumber(111));
//		System.out.println(Numbers2.nameThatNumber(858));
//
//		System.out.println("\n"); // now up to 9999, some examples:
//		Q3_NumersTo9999 Numbers3 = new Q3_NumersTo9999();
//		System.out.println(Numbers3.nameThatNumber(1000));
//		System.out.println(Numbers3.nameThatNumber(5678));

//		ExtraNumbersTo2147483647 extraNumbers = new ExtraNumbersTo2147483647();
//		long Num = 2147425254342583643L;
//		int length = (extraNumbers.howLong(Num));
//		int[] Split = extraNumbers.splitIntoArray(Num, length);
//		extraNumbers.nameThatNumber(Split, length);

		System.out.println(
				"up to 101 digits. There is no english name given to most numbers above the magnitude 99E101.");

		ChunkCounter chunkCounter = new ChunkCounter();
		String numString = "110225523454322423423446242424323425234523452345244694743123413412341234615363614352423874223400024410";
		chunkCounter.chunker(numString);

	}

}
