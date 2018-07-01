package Singleton;

public class SingletonLazyLoad {

	private static SingletonLazyLoad instance = null;
	
	private SingletonLazyLoad() {}
	
	public static SingletonLazyLoad getInstance() {
		if(instance == null) {
			synchronized (SingletonLazyLoad.class) {
				if(instance == null) {
					instance = new SingletonLazyLoad();
				}
			}
		}
		return instance;
	}
}
