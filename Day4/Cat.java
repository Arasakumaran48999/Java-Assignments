package Day4;
public  class Cat extends Animal implements Pet {
	private String name;
	public Cat(){
		this("");
	}
	public Cat(String name){
		super(4);
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public void play(){
		throw new UnsupportedOperationException("play method");
	}
	//@Override
	public void eat(){
		System.out.println("Eat method in cat class..");
	}
}
