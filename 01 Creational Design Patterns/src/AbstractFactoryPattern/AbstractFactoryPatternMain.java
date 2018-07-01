package AbstractFactoryPattern;

public class AbstractFactoryPatternMain {

	public static void main(String[] args) {
		FactoryProducer producer = new FactoryProducer();
		AbstractFactory fac1 = producer.getFactory("BANK");
		fac1.getBank("HDFC_BANK").bankName();
		
		AbstractFactory fac2 = producer.getFactory("ACCOUNT");
		fac2.getAccount("SAVING_ACCOUNT").AccountType();
	}
}
