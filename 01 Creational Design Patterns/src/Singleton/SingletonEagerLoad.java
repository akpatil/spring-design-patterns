package Singleton;

public class SingletonEagerLoad {

	private static final SingletonEagerLoad instance = new SingletonEagerLoad();
	
	private SingletonEagerLoad() {}
	
	public static SingletonEagerLoad getInstance() {
		return instance;
	}
}
