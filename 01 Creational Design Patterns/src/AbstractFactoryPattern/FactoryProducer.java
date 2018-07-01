package AbstractFactoryPattern;

public class FactoryProducer {

	private static final String BANK = "BANK";
	private static final String ACCOUNT = "ACCOUNT";
	
	public AbstractFactory getFactory(String factoryName) {
		if(factoryName.equals(BANK)) {
			return new BankFactory();
		}
		else if(factoryName.equals(ACCOUNT)) {
			return new AccountFactory();
		}
		return null;
	}
}
