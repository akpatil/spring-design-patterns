package DecoratorPattern;

public class CurrentAccount implements Account {

	@Override
	public String getTotalBenefits() {
		return "There is no withdrawal limit in this account";
	}

}
