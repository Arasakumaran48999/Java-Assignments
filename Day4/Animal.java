package Day4;

public abstract class Animal {
	protected int legs;
	protected Animal(int leg) {
		this.legs=legs;
	}
	public abstract void eat();
	public void walk(){
		System.out.println(legs);
	}
}
