package br.com.designpatterns1.budget.situation;

import java.math.BigDecimal;

import br.com.designpatterns1.budget.Budget;
import br.com.designpatterns1.budget.exception.DomainException;

public abstract class BugetSituation {
	
	public BigDecimal CalculateExtraDiscount(Budget budget) {
		return BigDecimal.ZERO;
	}
	
	public void Aproved() {
		throw new DomainException("Budget cannot be approved");
	}
	
	public void Reprove() {
		throw new DomainException("Budget cannot be disapproved");
	}
	
	public void Finalize() {
		throw new DomainException("Budget cannot be finalized");
	}
}
