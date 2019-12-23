package com.codewardev;

import java.util.Arrays;
import java.util.stream.Collectors;

// https://www.codewars.com/kata/simple-pig-latin/train/java

public class PigLatin {
	public static String pigIt(String str) {
		return Arrays.stream(str.split(" "))
				.map(x->(x.matches("\\w+")? x.subSequence(1, x.length()).toString().concat(x.charAt(0)+"ay"):x))
				.collect(Collectors.joining(" ")).toString().trim();
	}

}
