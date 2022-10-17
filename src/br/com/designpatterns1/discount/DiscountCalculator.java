package br.com.designpatterns1.discount;

import java.math.BigDecimal;

import br.com.designpatterns1.budget.Budget;

public class DiscountCalculator {
	
	public BigDecimal calculate(Budget budget) {
		
		Discount discount = 
				new QuantityGreaterThanFive(
				new ValueGreaterThanFiveHundred(
				new NoDiscount()));
		
		return discount.Calculate(budget);
		
	}
	
}
