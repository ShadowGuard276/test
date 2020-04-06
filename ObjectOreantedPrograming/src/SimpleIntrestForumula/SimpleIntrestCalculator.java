package SimpleIntrestForumula;

import java.math.BigDecimal;

public class SimpleIntrestCalculator {
private BigDecimal principle;
private BigDecimal intrest;
	public SimpleIntrestCalculator(String principle, String intrest) {
		this.principle=new BigDecimal(principle);
		this.intrest=new BigDecimal(intrest).divide(new BigDecimal(100));
	}
	public BigDecimal calculateTotalValue(int noOfYears) {
	BigDecimal	totalValue= principle.add(principle.multiply(intrest).multiply(new BigDecimal(noOfYears)));
	return totalValue;
	}
	

}
