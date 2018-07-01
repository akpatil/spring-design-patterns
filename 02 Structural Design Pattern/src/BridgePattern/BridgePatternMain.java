package BridgePattern;

public class BridgePatternMain {

	public static void main(String[] args) {
		Bank icici = new ICICIBank(new CurrentAccount());
		Account current = icici.openAccount();
		current.accountType();
		
		Bank hdfc = new HDFCBank(new SavingAccount());
		Account savings = hdfc.openAccount();
		savings.accountType();
	}
}
