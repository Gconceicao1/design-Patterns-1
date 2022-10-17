import java.math.BigDecimal;

import br.com.designpatterns1.budget.Budget;
import br.com.designpatterns1.tax.CalculatorTaxes;
import br.com.designpatterns1.tax.ICMS;
import br.com.designpatterns1.tax.ISS;
public class TestTax {

	public static void main(String[] args) {
		Budget budget = new Budget(
				new BigDecimal("100"), 1);
		
		CalculatorTaxes calculator = new CalculatorTaxes();
		System.out.println(
				"tax is: " + calculator.calculate(budget, new ICMS()));
		
		System.out.println(
				"tax is: " + calculator.calculate(budget, new ISS()));
		
	}

}
