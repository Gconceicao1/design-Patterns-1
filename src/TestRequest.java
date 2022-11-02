import java.math.BigDecimal;

import br.com.designpatterns1.request.GeneratedRequest;

public class TestRequest {

	public static void main(String[] args) {
	
	 String Client  = args[0];
	 BigDecimal BudgetValue = new BigDecimal(args[1]);
	 Integer quantityItens = Integer.parseInt(args [2]);
	 
	 GeneratedRequest generated = new GeneratedRequest(Client, BudgetValue, quantityItens);
	 generated.execute();
	}
	
}
