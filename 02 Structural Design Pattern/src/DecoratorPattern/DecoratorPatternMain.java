package DecoratorPattern;

public class DecoratorPatternMain {

	public static void main(String[] args) {
		Account basicSavingsAccount = new SavingAccount();
		basicSavingsAccount.getTotalBenefits();
		
		Account seniorCitizenSavingAccount = new SavingAccount();
		seniorCitizenSavingAccount = new SeniorCitizen(seniorCitizenSavingAccount);
		System.out.println(
			seniorCitizenSavingAccount.getTotalBenefits()
		);
		
		Account priviledgedSavingAccount = new SavingAccount();
		priviledgedSavingAccount = new Priviledged(priviledgedSavingAccount);
		System.out.println(
			priviledgedSavingAccount.getTotalBenefits()
		);
	}
}
