package br.com.designpatterns1.budget.situation;

import br.com.designpatterns1.budget.Budget;

public class Reproved extends BugetSituation {
	
	public void Finalize(Budget budget) {
		budget.setSituation(new Finalize());
	}

}

