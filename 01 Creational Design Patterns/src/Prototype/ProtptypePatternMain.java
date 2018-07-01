package Prototype;

public class ProtptypePatternMain {

	public static void main(String[] args) {
		Account CurrentAccount = (Account) AccountCache.accountCacheMap.get("CURRENT").clone();
		CurrentAccount.accountType();
		
		Account SavingAccount = (Account) AccountCache.accountCacheMap.get("SAVING").clone();
		SavingAccount.accountType();
	}
}
