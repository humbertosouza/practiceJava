package com.puzzles;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
	
	private Map<Integer, Integer> memTable;
	
	
	public Fibonacci() {
		this.memTable = new HashMap<>();
		this.memTable.put(0,0);
		this.memTable.put(1,1);
		
	}
	
	/**
	 * Fibonacci with exponentian running time
	 * @param n
	 * @return
	 */
	public int naiveFibonacci(int n) {
		System.out.println("naive Function called... n = " + (n));
		
		if ( n == 0 ) return 0;
		if ( n == 1 ) return 1;
		
		return naiveFibonacci(n -1) + naiveFibonacci( n -2);
	}
	
	/**
	 * Fibonacci with linear running time due to memory usage
	 * @param n
	 * @return
	 */
	public int optimizedFibonacci(int n) {

		System.out.println("opt2 Function called... n = " + (n));		
		
		if ( n == 0 ) return 0;
		if ( n == 1 ) return 1;
		
		Integer n1 = this.memTable.get(n - 1);
		if (n1 == null ) {
			n1 = optimizedFibonacci(n -1);
			this.memTable.put(n -1, n1);
		} else {
			System.out.println("Used saved n1 n = " + (n - 1) );
		}
		
		Integer n2 = this.memTable.get(n - 2);
		if (n2 == null ) {
			n2 = optimizedFibonacci(n - 2);
			this.memTable.put(n - 2, n2);			
		} else {
			System.out.println("Used saved n2 n = " + (n - 2));
		}	

		return n1 + n2;
	}
	
	/**
	 * Fibonacci 2 with linear running time due to memory usage
	 * @param n
	 * @return
	 */
	public int optimized2Fibonacci(int n) {
		System.out.println("opt2 Function called... n = " + (n));	
		
		if ( memTable.containsKey(n)) {
			System.out.println("Used saved n = " + (n));
			return memTable.get(n);
		} 
		
		memTable.put(n-1, optimized2Fibonacci(n-1));
		memTable.put(n-2, optimized2Fibonacci(n-2));
		
		int current = memTable.get(n-1) + memTable.get(n-2);

		memTable.put(n, current);

		return current;
	}
	
	

}
