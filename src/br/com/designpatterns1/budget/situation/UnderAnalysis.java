package br.com.designpatterns1.budget.situation;

import java.math.BigDecimal;

import br.com.designpatterns1.budget.Budget;

public class UnderAnalysis extends BugetSituation {
	
	public BigDecimal CalculateExtraDiscount(Budget budget) {
		return budget.getValue().multiply(new BigDecimal("0.05"));
	}
	
	public void Approve(Budget budget) {
		budget.Approved();
	}
	public void Reprove(Budget budget) {
		budget.setSituation(new Reproved());
	}
}

