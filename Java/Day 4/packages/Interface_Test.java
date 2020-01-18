package com.zensar.test;
import com.zensar.Calculator;
import com.zensar.AdvCalculator;
import com.zensar.CalculatorImpl;

public class Interface_Test{
	public static void main(String[] args){
		Calculator calc;
		//calc = new Calculator();
		
		AdvCalculator advcalc;
		//advcalc = new AdvCalculator;
		
		CalculatorImpl calcImpl;
		calcImpl = new CalculatorImpl();
		System.out.println("Addition is :"+calcImpl.add(10,20));
		//calcImpl.add(10,2);
		calcImpl.sub(10,2);
		calcImpl.mul(10,2);
		calcImpl.div(10,2);
		
		calc = calcImpl;
		calc.add(10,2);
		calc.sub(10,2);
		//calc.mul(10,2);
		//calc.div(10,2);

		advcalc = calcImpl;
		//advcalc.add(10,2);
		//advcalc.sub(10,2);
		advcalc.mul(10,2);
		advcalc.div(10,2);

	}
}
