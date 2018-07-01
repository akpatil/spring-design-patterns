package BridgePattern;

public class SavingAccount implements Account {

	@Override
	public Account openAccount() {
		System.out.println("Opened Account: Saving Account");
		return new SavingAccount();
	}

	@Override
	public void accountType() {
		System.out.println("Its a Savings Account");
	}

}
