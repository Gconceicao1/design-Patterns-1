package br.com.designpatterns1.discount;

import java.math.BigDecimal;

import br.com.designpatterns1.budget.Budget;

public abstract class Discount {

	protected Discount next;

	public Discount(Discount next) {
		super();
		this.next = next;
	}
	
	public BigDecimal efectiveCalculate(Budget budget) {
		if(verifyAplication(budget)) {
			return Calculate(budget);
		}
		return next.efectiveCalculate(budget);
	}
	
	public abstract Boolean verifyAplication(Budget budget);
	public abstract BigDecimal Calculate(Budget budget);
}
