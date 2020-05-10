package com.oracle.learning.behavioural.chainofresponsibility;

public class Substraction implements Chain {
	private Chain nextInChain;
	
	public void setNextLink(Chain chain) {
		this.nextInChain = chain;
	}

	public void calculate(Numbers request) {
		if ("sub".equalsIgnoreCase(request.getOperation())) {
			System.out.println(request.getX() - request.getY());
		} else {
			nextInChain.calculate(request);
		}
	}

}
