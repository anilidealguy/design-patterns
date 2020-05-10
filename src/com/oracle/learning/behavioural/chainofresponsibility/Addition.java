package com.oracle.learning.behavioural.chainofresponsibility;

public class Addition implements Chain {
	private Chain nextInChain;

	public void setNextLink(Chain chain) {
		this.nextInChain = chain;
	}

	public void calculate(Numbers request) {
		if ("add".equalsIgnoreCase(request.getOperation())) {
			System.out.println(request.getX() + request.getY());
		} else {
			if (nextInChain == null)
				System.out.println("end of the chain");
			
			nextInChain.calculate(request);
		}
	}

}
