import java.math.BigDecimal;

import br.com.designpatterns1.budget.Budget;
import br.com.designpatterns1.discount.DiscountCalculator;
public class TestDiscount {

	public static void main(String[] args) {
		
		Budget budget1 = new Budget(
				new BigDecimal("200"), 6);
		
		DiscountCalculator calculator = new DiscountCalculator();
		
		System.out.println("Budget1 value: " + budget1.getValue() );
		System.out.println("Discount buget 1 is: " + calculator.calculate(budget1));
		budget1.setValue(budget1.getValue().subtract(calculator.calculate(budget1)));
		System.out.println("Budget1 value with discount: " + budget1.getValue() );
		budget1.Approved();
		budget1.extraDiscount();
		System.out.println("Situation: " + budget1.getSituation().getClass().getSimpleName());
		//budget1.Finalize();
		//System.out.println("Situation: " + budget1.getSituation().getClass().getSimpleName());
		//budget1.extraDiscount();
		System.out.println("Value with Extra Discount: " + budget1.getValue());
	}

}
