package SimpleIntrestForumula;

import java.math.BigDecimal;

public class SimpleIntrestrunner {

	public static void main(String[] args) {
		SimpleIntrestCalculator calculator= new SimpleIntrestCalculator("4500","7.5") ;
		BigDecimal totalValue = calculator.calculateTotalValue(5);
		System.out.println(totalValue);
	}

}
