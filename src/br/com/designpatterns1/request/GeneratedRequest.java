package br.com.designpatterns1.request;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import br.com.designpatterns1.budget.Budget;

public class GeneratedRequest {
	private String client;
	private BigDecimal BudgetValue;
	private Integer quantityItens;
	
	public GeneratedRequest(String client, BigDecimal budgetValue, Integer quantityItens) {
		this.client = client;
		BudgetValue = budgetValue;
		this.quantityItens = quantityItens;
	}
	
	public void execute() {
		Budget budget = new Budget(this.BudgetValue, this.quantityItens);
		
		Request request = new Request(client, budget, LocalDateTime.now());
		
		System.out.println("Save request in db");
		System.out.println("Send E-mail");
	}
	
}
