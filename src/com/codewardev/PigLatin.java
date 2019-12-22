package com.codewardev;

// https://www.codewars.com/kata/simple-pig-latin/train/java

public class PigLatin {

	public static String pigIt(String str) {
		String[] strings = str.split(" ");
		String result ="";
		for(String x: strings) {
			char first = x.charAt(0);
			String newStr = x.replace(x.charAt(0)+"", "").concat(first+"ay");
			result += newStr+" ";
			System.out.println(newStr);
		}
		return result.trim();
	}

}
