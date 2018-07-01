package AdapterPattern;

public class AdvancedPaymentGatewayAdapter implements AdvancedPaymentGateway {

	private PaymentGateway paymentGateway;
	
	public AdvancedPaymentGatewayAdapter(PaymentGateway gateway) {
		this.paymentGateway = paymentGateway;
	}
	
	@Override
	public void doPayment(String mobile1, String mobile2) {
		Account acc1 = new SavingAccount();
		Account acc2 = new SavingAccount();
		paymentGateway.makePayment(acc1, acc2);
	}

}
