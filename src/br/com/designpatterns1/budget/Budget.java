package br.com.designpatterns1.budget;

import java.math.BigDecimal;

import br.com.designpatterns1.budget.situation.Approved;
import br.com.designpatterns1.budget.situation.BugetSituation;
import br.com.designpatterns1.budget.situation.Finalize;
import br.com.designpatterns1.budget.situation.Reproved;
import br.com.designpatterns1.budget.situation.UnderAnalysis;

public class Budget {
	private BigDecimal value;
	private Integer quantityItens;
	private BugetSituation situation;			

	public Budget(BigDecimal value, Integer quantityItens) {
		super();
		this.value = value;
		this.quantityItens = quantityItens;
		this.situation = new UnderAnalysis();
	}

	public void extraDiscount() {
		BigDecimal extraDiscountValue = this.situation.CalculateExtraDiscount(this);
		this.value = this.value.subtract(extraDiscountValue);
	}
	
	public void Approved() {
		this.situation = new Approved();
	}
	
	public void Reprove() {
		this.situation = new  Reproved();
	}
	
	public void Finalize() {
		this.situation = new Finalize();
	}
	
	
	public BigDecimal getValue() {
		return value;
	}
	
	public void setValue(BigDecimal value) {
		this.value = value;
	}
	
	public Integer getQuantityItens() {
		return quantityItens;
	}

	public BugetSituation getSituation() {
		return situation;
	}

	public void setSituation(BugetSituation situation) {
		this.situation = situation;
	}

	
}

