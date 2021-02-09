package com.training.corejava;
/**
 * method to print fibonacci series up to 100 numbers using for loop
 * @author sanjeev.Reddy
 *
 */
public class fibonacci {
		
		int n=10 ;
		int f=1,s=1,t;
		
	public void fibonacciSeries() {
	
		System.out.println(f);
		System.out.println(s);
		
		for(int i = 0; i<n; i++)
		{
			t = f + s;
			if (t>=100) {
					break;
			}
			System.out.println(t);
			f = s;
			s = t;
				}
	}
	
	public static void main(String[] args) {
		fibonacci fibo = new fibonacci();
		fibo.fibonacciSeries();
		
	}

}
		
		
	


