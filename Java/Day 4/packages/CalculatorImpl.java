package com.zensar;

public class CalculatorImpl implements Calculator, AdvCalculator{
	@Override
	public int add(int no1, int no2){
		return no1+no2;
	}
	@Override
	public int sub(int no1, int no2){
		return no1-no2;
	}
	@Override
	public int mul(int no1, int no2){
		return no1*no2;
	}
	@Override
	public int div(int no1, int no2){
		return no1/no2;
	}
}
