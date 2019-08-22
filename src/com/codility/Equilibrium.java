package com.codility;

public class Equilibrium {
	
    public static void main(String[] args) {
    	
    	int[] values = {3,1,2,4,3};
    	Equilibrium equ  = new Equilibrium() ;
    	
    	System.out.println(equ.equilibr(values));
      	    	
    	
    }   
	
	
    public int equilibr(int[] A) {
        // write your code in Java SE 8
        int[] left= new int[A.length];
        int[] right = new int[A.length];
        int min = 100002;
        
        left[0] = A[0];
        right[A.length -1 ] = A[A.length -1];
        
        for(int k = 1; k < A.length - 2; k++){
            left[k] = left[k-1] + A[k];
            right[A.length - k - 1] = right[A.length - k ] + A[A.length - k];
        }
        
        for(int k = 0; k < A.length -1 ; k++){
            
            int current = Math.abs(left[k] - right[k]);
            if(current < min) {
               min = current;
            }
            
        }
        
        return min;            
        
    }
    
 

}