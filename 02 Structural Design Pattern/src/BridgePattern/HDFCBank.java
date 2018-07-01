package BridgePattern;

public class HDFCBank extends Bank {

	public HDFCBank(Account account) {
		super(account);
	}
	
	@Override
	Account openAccount() {
		System.out.println("Open your account with HDFC Bank");
		return account;
	}

}
