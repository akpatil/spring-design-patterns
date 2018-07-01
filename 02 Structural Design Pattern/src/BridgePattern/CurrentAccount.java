package BridgePattern;

public class CurrentAccount implements Account {

	@Override
	public Account openAccount() {
		System.out.println("Opened: Current Account");
		return new CurrentAccount();
	}

	@Override
	public void accountType() {
		System.out.println("Its a Current Account");
	}

}
