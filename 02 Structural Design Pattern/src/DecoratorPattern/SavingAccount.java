package DecoratorPattern;

public class SavingAccount implements Account {

	@Override
	public String getTotalBenefits() {
		return "This account has 4% intrest rate with 5000 Rs. monthly withdrawal limit";
	}

}
