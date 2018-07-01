package DecoratorPattern;

public class Priviledged extends AccountDecorator {

	private Account account;
	
	public Priviledged(Account account) {
		this.account = account;
	}
	
	@Override
	public String getTotalBenefits() {
		return account.getTotalBenefits() + " Other benefits are " + applyOtherBenefits();
	}

	@Override
	String applyOtherBenefits() {
		return "An accident insurance of upto $1600 & an overdraft of $84";
	}

}
