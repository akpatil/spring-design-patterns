package AbstractFactoryPattern;

public class AccountFactory extends AbstractFactory {

	private static final String SAVING_ACCOUNT = "SAVING_ACCOUNT";
	private static final String CURRENT_ACCOUNT = "CURRENT_ACCOUNT";
	
	@Override
	Bank getBank(String bankName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Account getAccount(String accountName) {
		if(accountName.equals(SAVING_ACCOUNT)) {
			return new SavingAccount();
		}
		else if(accountName.equals(CURRENT_ACCOUNT)) {
			return new CurrentAccount();
		}
		return null;
	}

}
