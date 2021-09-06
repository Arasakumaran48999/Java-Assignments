package Day12;
interface Nothing{
	default void say() {
		System.out.println("Hi this is AK");
	}
	static void sayHello() {
		System.out.println("This is a static method");
	}
	void display();
}
class A  implements Nothing{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Arasaku7maran");
	}

}
public class DefaultStaticEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		a.say();
		Nothing.sayHello();
		a.display();
	}

}
