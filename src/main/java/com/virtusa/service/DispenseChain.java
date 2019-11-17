package com.virtusa.service;
/**
 * @author arvind.varma
 *
 */
public interface DispenseChain {
	void setNextChain(DispenseChain dispenseChain);
	void dispense(int num);
}
