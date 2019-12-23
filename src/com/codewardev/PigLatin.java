package com.codewardev;

import java.util.Arrays;
import java.util.stream.Collectors;

// https://www.codewars.com/kata/simple-pig-latin/train/java

public class PigLatin {
	public static String pigIt(String str) {
		return Arrays.stream(str.split(" "))
				.map(x->{
					char first = x.charAt(0);
					return (x.matches("\\w+")? x.subSequence(1, x.length()).toString().concat(first+"ay"):x);
				}).collect(Collectors.joining(" ")).toString().trim();
	}

}
