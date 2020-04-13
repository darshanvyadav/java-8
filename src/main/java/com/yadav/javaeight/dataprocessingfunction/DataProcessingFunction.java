package com.yadav.javaeight.dataprocessingfunction;

import java.util.function.Predicate;

public class DataProcessingFunction {

	public static void main(String[] args) {
		

	}

	// java 7  it is capturing a value because of that every time we call new object is created.
	Predicate<String> pOld = new Predicate<String>() {
		@Override
		public boolean test(String s) {
			int i = s.length();
			return s.length() > 20 ;
		}
	};
	
	// java 8  we are not storing any
	Predicate<String> pNew = s-> s.length() > 20 ;
}
