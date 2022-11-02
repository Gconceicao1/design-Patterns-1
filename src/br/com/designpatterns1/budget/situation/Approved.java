package br.com.designpatterns1.budget.situation;

import java.math.BigDecimal;

import br.com.designpatterns1.budget.Budget;

public class Approved extends BugetSituation {
	
	public BigDecimal CalculateExtraDiscount(Budget budget) {
		return budget.getValue().multiply(new BigDecimal("0.02"));
	}
	
	public void Finalize(Budget budget) {
		budget.setSituation(new Finalize());
	}

}

