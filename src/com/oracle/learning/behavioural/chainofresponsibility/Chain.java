package com.oracle.learning.behavioural.chainofresponsibility;

public interface Chain {
	void setNextLink(Chain chain);
	void calculate(Numbers request);
}
