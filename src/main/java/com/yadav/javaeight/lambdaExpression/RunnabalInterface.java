package com.yadav.javaeight.lambdaExpression;

import java.util.concurrent.Executors;

public class RunnabalInterface {

	public static void main(String[] args) {
		RunnabalInterface bri = new RunnabalInterface();
		Executors.newSingleThreadExecutor().execute(bri.r);
		System.out.println("called old runnable interface implimentation" );
		Executors.newSingleThreadExecutor().execute(bri.runnableInJavaEight);
		System.out.println("called new runnable interface implimentation" );
	}
	
	Runnable r = new Runnable() {
		@Override
		public void run() {
			int i =0;
			while(i++ < 3) {
				System.out.println("inside runnable interface " + i + " times");
			}
			
		}
	};
	
	final Runnable runnableInJavaEight =  () -> {
		int i = 0;
		while(i++ < 3) {
			System.out.println("inside runnable interface implimented in Java Eight " + i + " Times ");
		}
	};

}
