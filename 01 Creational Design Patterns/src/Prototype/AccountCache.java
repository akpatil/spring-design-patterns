package Prototype;

import java.util.HashMap;
import java.util.Map;

public class AccountCache {

	public static Map<String, Account> accountCacheMap = new HashMap<>();
	
	static {
		Account currentAccount = new CurrentAccount();
		Account savingAccount = new SavingAccount();
		accountCacheMap.put("CURRENT", currentAccount);
		accountCacheMap.put("SAVING", savingAccount);
	}
}
