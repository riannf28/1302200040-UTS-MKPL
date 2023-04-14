package lib;

public class TaxFunction {

	private static final double taxRate = 0.05;
	private static final int taxSingle = 54000000;
	private static final int taxMarried = taxSingle + 4500000;
	private static final int maxChildren = 3;
	
	public static int calculateTax(int monthlySalary, int otherMonthlyIncome, int numberOfMonthWorking, int deductible, boolean isMarried, int numberOfChildren) {
		
		int tax = taxSingle;
		
		if (numberOfMonthWorking > 12) {
			System.err.println("More than 12 month working per year");
		}
		
		if (numberOfChildren > 3) {
			maxChildren;
		}
		
		if (isMarried) {
			tax = (int) Math.round(taxRate * (((monthlySalary + otherMonthlyIncome) * numberOfMonthWorking) - deductible - (taxMarried + (numberOfChildren * 1500000))));
		}else {
			tax = (int) Math.round(taxRate * (((monthlySalary + otherMonthlyIncome) * numberOfMonthWorking) - deductible - taxSingle));
		}
		
		if (tax < 0) {
			return 0;
		}else {
			return tax;
		}
			 
	}
	
}
