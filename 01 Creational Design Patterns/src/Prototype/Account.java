package Prototype;

public abstract class Account implements Cloneable {

	public abstract void accountType();
	
	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
}
