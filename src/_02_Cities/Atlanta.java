package _02_Cities;

public class Atlanta extends City{

	public Atlanta(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double total = 0;
		total +=  population * growthRate * 2;
		return total;	
	}

}
