package br.com.designpatterns1.discount;

import java.math.BigDecimal;

import br.com.designpatterns1.budget.Budget;

public class NoDiscount extends Discount {

	public NoDiscount() {
		super(null);
	}

	public BigDecimal Calculate(Budget budget) {
		return BigDecimal.ZERO;
	}

	@Override
	public Boolean verifyAplication(Budget budget) {
		return true;
	}
	
	
}
