package DecoratorPattern;

public class SeniorCitizen extends AccountDecorator {

	private Account account;
	
	public SeniorCitizen(Account account) {
		super();
		this.account = account;
	}
	
	@Override
	public String getTotalBenefits() {
		return account.getTotalBenefits() + " other benefits are " + applyOtherBenefits();
	}

	@Override
	String applyOtherBenefits() {
		return "Medical Insurance of upto $1000 or Senior Citizens";
	}

}
