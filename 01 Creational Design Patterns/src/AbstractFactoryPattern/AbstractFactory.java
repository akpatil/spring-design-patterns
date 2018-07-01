package AbstractFactoryPattern;

public abstract class AbstractFactory {

	abstract Bank getBank(String bankName);
	abstract Account getAccount(String accountName);
}
