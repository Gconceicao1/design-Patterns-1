package br.com.designpatterns1.discount;

import java.math.BigDecimal;

import br.com.designpatterns1.budget.Budget;

public class QuantityGreaterThanFive extends Discount {

	public QuantityGreaterThanFive(Discount next) {
		super(next);
	}

	public BigDecimal Calculate(Budget budget) {
		return budget.getValue().multiply(new BigDecimal("0.1"));
	}

	@Override
	public Boolean verifyAplication(Budget budget) {
		return budget.getQuantityItens() > 5;
	}
	
	
}
