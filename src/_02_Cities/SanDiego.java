package _02_Cities;

public class SanDiego extends City{

	public SanDiego(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double total = 0;
		total += population * growthRate;
		total += 1000000;
		return total;
	}
}
