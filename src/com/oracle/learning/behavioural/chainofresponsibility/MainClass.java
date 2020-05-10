package com.oracle.learning.behavioural.chainofresponsibility;

public class MainClass {

	public static void main(String[] args) {
		Addition a = new Addition();
		Chain m = new Multiplication();
		Chain s = new Substraction();
		
		
		a.setNextLink(m);
		m.setNextLink(s);
		s.setNextLink(a);
		
		
		Numbers n = new Numbers();
		n.setX(1);
		n.setY(2);
		n.setOperation("sub");
		
		a.calculate(n);
		
		
		/*
		 * Fee calculation
		 * 
		 * 
		 * 10000
		 * 
		 * first we have to go to the system called dash  10000 -> 5000
		 * second we have to go to the system nova 5000 -> 4000
		 * then use custom 1 impl 1000 -> 1000;
		 * then use custom 2 impl
		 * 
		 * 
		 * */
	}

}
