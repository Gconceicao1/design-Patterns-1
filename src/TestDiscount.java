import java.math.BigDecimal;

import br.com.designpatterns1.budget.Budget;
import br.com.designpatterns1.discount.DiscountCalculator;
public class TestDiscount {

	public static void main(String[] args) {
		
		Budget budget1 = new Budget(
				new BigDecimal("200"), 6);
		
		Budget budget2 = new Budget(
				new BigDecimal("1000"), 1);
		
		DiscountCalculator calculator = new DiscountCalculator();
		System.out.println(
				"Discount is: " + calculator.calculate(budget1));
		
		System.out.println(
				"Discount is: " + calculator.calculate(budget2));

	}

}
