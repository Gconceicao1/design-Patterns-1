package br.com.designpatterns1.discount;

import java.math.BigDecimal;

import br.com.designpatterns1.budget.Budget;

public class ValueGreaterThanFiveHundred extends Discount{

	public ValueGreaterThanFiveHundred(Discount next) {
		super(next);
	}

	public BigDecimal Calculate(Budget budget) {
			return budget.getValue().multiply(new BigDecimal("0.5"));
	}

	@Override
	public Boolean verifyAplication(Budget budget) {
		return budget.getValue().compareTo(new BigDecimal("500"))> 0;
	}
}
