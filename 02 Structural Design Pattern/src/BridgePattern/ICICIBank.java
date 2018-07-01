package BridgePattern;

public class ICICIBank extends Bank {

	public ICICIBank(Account account) {
		super(account);
	}
	
	@Override
	BridgePattern.Account openAccount() {
		System.out.println("Open your account with ICICI Bank");
		return account;
	}

}
