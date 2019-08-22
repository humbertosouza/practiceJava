package com.puzzles;
/**
 * Call most puzzles from here
 * @author humberto
 *
 */
public class App {

	public static void main(String[] args) {
		
		System.out.println("\n-- Textual Hanoi Tower");
		HanoiTower hanoiTower = new HanoiTower();
		hanoiTower.solveHanoi(3, 'A', 'B', 'C');
		
		System.out.println("\n-- Fibonacci naive");
		Fibonacci fibonacci = new Fibonacci();
		System.out.println(fibonacci.naiveFibonacci(6));
		
		System.out.println("\n-- Fibonacci optimized");
		System.out.println(fibonacci.optimizedFibonacci(6));
		
		System.out.println("\n-- Fibonacci optimized 2");
		System.out.println(fibonacci.optimized2Fibonacci(6));

	}

}
