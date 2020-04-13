package com.yadav.javaeight.function.pack;

public class PredicateClass {
	
	public static void main (String [] args) {
		
		PredicateInterface<String> stringPredicate = s -> s.length() < 2 ;
		
		PredicateInterface<String> stringPredicate1 = s -> s.length() > 5 ;
		
		PredicateInterface<String> stringPredicate2 = stringPredicate1.and(stringPredicate);
		
		PredicateInterface<String> stringPredicate3 = stringPredicate1.or(stringPredicate);
		
		PredicateInterface<String> stringPredicate4 = PredicateInterface.isEqualsTo("Yes");
		
		PredicateInterface<Integer> integer = PredicateInterface.isEqualsTo(5);
		
		boolean b = stringPredicate2.test("Test chiyandra");
		boolean b1 = stringPredicate2.test("Test chiyandra babu chudam");
		boolean b3 = stringPredicate2.test("Test chiyandra babu chudam");
		boolean b4 = stringPredicate3.test("abc");
		boolean b5 = stringPredicate4.test("Yes");
		boolean b6 = stringPredicate4.test("No");
		
		boolean b7 = integer.test(5);
		
		
	    System.out.println("b: " + b + " b1: " + b1 + " B3: "+ b3 + " B4 " + b4 +
	    		" B5 " +  b5 + " B6 " +  b6 + " B7 " +  b7);
	}
	


}
