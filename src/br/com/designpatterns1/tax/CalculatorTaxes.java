package br.com.designpatterns1.tax;

import java.math.BigDecimal;

import br.com.designpatterns1.budget.Budget;

public class CalculatorTaxes {
	
	public BigDecimal calculate(Budget budget, Tax Tax) {
		 return Tax.calculate(budget);
		}

}
