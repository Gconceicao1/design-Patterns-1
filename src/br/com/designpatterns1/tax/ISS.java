package br.com.designpatterns1.tax;

import java.math.BigDecimal;

import br.com.designpatterns1.budget.Budget;

public class ISS implements Tax {

	public BigDecimal calculate(Budget budget) {
		return budget.getValue()
		.multiply(new BigDecimal("0.06"));
	}

}
