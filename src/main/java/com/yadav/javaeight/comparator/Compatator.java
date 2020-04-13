package com.yadav.javaeight.comparator;

import java.util.function.Function;

@FunctionalInterface
public interface Compatator<T> {
	
	public int compare(T t1, T t2);

	public static <U> Compatator<U> comparing(Function<U, Comparable> returnAge) {
		return (p1, p2) -> returnAge.apply(p1).compareTo(returnAge.apply(p2));
	}

}
