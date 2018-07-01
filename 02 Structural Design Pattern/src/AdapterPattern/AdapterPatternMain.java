package AdapterPattern;

public class AdapterPatternMain {

	public static void main(String[] args) {
		PaymentGateway paymentGateway = new PaymentGatewayImpl();
		AdvancedPaymentGatewayAdapter adapter = new AdvancedPaymentGatewayAdapter(paymentGateway);
		
		String mobile1 = null, mobile2 = null;
		adapter.doPayment(mobile1, mobile2);
	}
}
