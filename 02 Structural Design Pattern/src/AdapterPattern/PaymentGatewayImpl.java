package AdapterPattern;

public class PaymentGatewayImpl implements PaymentGateway {

	@Override
	public void makePayment(Account acc1, Account acc2) {
		System.out.println("Make Payment Using Old Gateway");
	}

}
