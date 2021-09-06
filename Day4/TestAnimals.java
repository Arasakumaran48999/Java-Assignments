package Day4;
public class TestAnimals {
	public static void main(String[] args){
		Fish f = new Fish();
		Cat c = new Cat("Fluffy");
		Animal a = new Fish();
		Animal s = new Spider();
		Pet p = new Cat();
		f.setName("Blue fish");
		f.eat();
		System.out.println("Name:"+f.getName());
		f.walk();
		c.eat();
		System.out.println("Name:"+c.getName());
		c.walk();
		((Fish)a).setName("Salmon");
		((Fish)a).eat();
		System.out.println("Name:"+((Fish)a).getName());
		a.walk();
		s.eat();
		s.walk();
		((Cat)p).setName("Scooopy Cat");
		((Cat)p).eat();
		System.out.println("Name:"+((Cat)p).getName());
		((Cat)p).walk();
		}
	}