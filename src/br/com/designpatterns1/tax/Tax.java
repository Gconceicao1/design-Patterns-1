package br.com.designpatterns1.tax;

import java.math.BigDecimal;

import br.com.designpatterns1.budget.Budget;

public interface Tax {

	BigDecimal calculate (Budget budget);
}
