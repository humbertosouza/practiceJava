package com.practice1;

import java.lang.reflect.Array;
import java.util.ArrayList;

import jdk.nio.Channels.SelectableChannelCloser;

public class ExprTerm {

	double coefficient;
	double exponent;
	
	@Override
	public String toString() {
		//return "ExprTerm [coefficient=" + coefficient + ", exponent=" + exponent + "]";

		return " " + coefficient + "x exp" + exponent + " ";
	}

	public double getCoefficient() {
		return coefficient;
	}

	public void setCoefficient(double coefficient) {
		this.coefficient = coefficient;
	}

	public double getExponent() {
		return exponent;
	}

	public void setExponent(double exponent) {
		this.exponent = exponent;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double coef1 = 1.2;
		double coef2 = 5.3;
		double coef3 = 2;
		double coef4 = 4;
		double exp1 = -1.1;
		double exp2 = 2;
		double exp3 = 10;
		double exp4 = 10;
		
		System.out.println("Started");
		ExprTerm exprTerm1 = new ExprTerm();
		ExprTerm exprTerm2 = new ExprTerm();
		ExprTerm exprTerm3 = new ExprTerm();
		ExprTerm exprTerm4 = new ExprTerm();
		
		exprTerm1.setCoefficient(coef1);  
		exprTerm2.setCoefficient(coef2);  
		exprTerm3.setCoefficient(coef3);  
		exprTerm4.setCoefficient(coef4);  

		exprTerm1.setExponent(exp1);
		exprTerm2.setExponent(exp2);
		exprTerm3.setExponent(exp3);
		exprTerm4.setExponent(exp4);
		
		ArrayList<ExprTerm> expSum1 = new ArrayList<ExprTerm>();
		
		ExprTerm[] group1 = {exprTerm1, exprTerm2};
		ExprTerm[] group2 = {exprTerm3, exprTerm4};
		expSum1 = exprTerm1.sum( group1, group2);
		for (ExprTerm exprTerm : expSum1) {
			System.out.println(exprTerm.toString());
			
		}
		 
	}
	
	ArrayList<ExprTerm> sum(ExprTerm[] expr1, ExprTerm[] expr2) {
		
		// From int[] buckets = new int[] {5,4,56,7};
		//ExprTerm[] exprTemp = new ExprTerm[] {expr1, expr2}.
		ArrayList<ExprTerm> exprTemp = new ArrayList<ExprTerm>();
		
		for(int i=0; i< expr1.length; i++) {
			for(int z=0; z< expr2.length; z++) {
				// If same exponent, add the coefficient to the first. Otherwise, just add the term
				if (expr1[i].getExponent() ==  expr2[z].getExponent()) {
					expr1[i].setCoefficient(expr1[i].getCoefficient() + expr2[z].getCoefficient());
				} 
				exprTemp.add(expr1[i]);
			}		
		}
		
		return exprTemp;
		
	}
	


}
