package com.yadav.javaeight.lambdaExpression;

import java.util.Arrays;
import java.util.Comparator;

public class ComparitorInterface {

	public static void main(String[] args) {
		ComparitorInterface bc = new ComparitorInterface() ;
		String[] strArray = {"A", "AB", "ABC", "ABCD"};
		Arrays.sort(strArray);
		System.out.println("default natural sorting order \n" + Arrays.toString(strArray));
		Arrays.sort(strArray, bc.basicComparator);
		System.out.println("sorting using comparator \n" + Arrays.toString(strArray));
		Arrays.sort(strArray, bc.comparatorInJavaEight);
		System.out.println("sorting using ComparatorInJavaEight \n" + Arrays.toString(strArray));
	}

	// it uses in line implementation if an interface // we can do this from java 1
	Comparator<String> basicComparator = new Comparator<String>() { 
		public int compare(String s1, String s2) {
			return Integer.compare(s2.length(), s1.length());
		}
	};
	
	Comparator<String> comparatorInJavaEight = (s1, s2) -> Integer.compare(s1.length(), s2.length());
}
