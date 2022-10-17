package br.com.designpatterns1.budget;

import java.math.BigDecimal;

public class Budget {
	private BigDecimal value;
	private Integer quantityItens;

	public Budget(BigDecimal value, Integer quantityItens) {
		super();
		this.value = value;
		this.quantityItens = quantityItens;
	}

	public BigDecimal getValue() {
		return value;
	}
	
	public Integer getQuantityItens() {
		return quantityItens;
	}


}

