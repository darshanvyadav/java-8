package com.yadav.javaeight.function.pack;

@FunctionalInterface
public interface PredicateInterface<T> {
	
	public boolean test(T t);
	
	public default PredicateInterface<T> and(PredicateInterface<T> other){
		return p -> test(p) && other.test(p);
	}
	
	public default PredicateInterface<T> or(PredicateInterface<T> other){
		return p -> test(p) || other.test(p);
	}
	
	public static <U> PredicateInterface<U> isEqualsTo(U s){
		return s1 -> s1.equals(s);
	}
	
}
