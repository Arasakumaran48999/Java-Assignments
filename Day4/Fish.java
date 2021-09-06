package Day4;
public  class Fish extends Animal implements Pet {
	public Fish(){
		super(0);
	}
	private String fname;
	//Override
	public void eat(){
		System.out.println("Fish eat");
	}
	public String getName(){
		return fname;
	}
	public void setName(String fname){
		this.fname=fname;
	}
	public void play(){
		throw new UnsupportedOperationException("play in fish class");
	}
	//@Override
	public void walk(){
		System.out.println("walk method in fish");
	}
}