package com.codewardev;

// https://www.codewars.com/kata/simple-pig-latin/train/java

public class PigLatin {

	public static String pigIt(String str) {
		String[] strings = str.split(" ");
		String result ="";
		for(String x: strings) {
			if(x.matches("[a-zA-Z]+")) {
				char first = x.charAt(0);
				String newStr = x.replaceFirst(first+"", "").concat(first+"ay");
				result += newStr+" ";
				System.out.println(newStr);
			} else {
				result += x;
			}
		}
		return result.trim();
	}

}
