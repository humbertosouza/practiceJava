package com.puzzles;

public class HanoiTower {


	public void solveHanoi(int n,  char rodFrom, char middleRod, char rodTo) {
		//System.out.println("Current n "+ n + " Current rod from: " + rodFrom + " middle "+ middleRod + " to " + rodTo);
		if (n==1) {
			System.out.println("Plate 1 from "+rodFrom + " to " + rodTo);
			return;
		}
		solveHanoi(n-1, rodFrom, rodTo, middleRod);
		System.out.println("Plate "+ n + " from " + rodFrom + " to " + rodTo);
		solveHanoi(n-1,middleRod, rodFrom, rodTo);
		
	}
	
}
