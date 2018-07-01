package AbstractFactoryPattern;

public class BankFactory extends AbstractFactory {

	private static final String ICICI_BANK = "ICICI_BANK";
	private static final String HDFC_BANK = "HDFC_BANK";
	
	@Override
	Bank getBank(String bankName) {
		if(bankName.equals(ICICI_BANK)) {
			return new ICICIBank();
		}
		else if(bankName.equals(HDFC_BANK)) {
			return new HDFCBank();
		}
		return null;
	}

	@Override
	Account getAccount(String accountName) {
		// TODO Auto-generated method stub
		return null;
	}

}
