package Day12;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.function.IntConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import Day8.Employee;
class Customer implements Comparable{
	private static String name;
	private static int price;
	private static int id;
	public static String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", price=" + price + ", id=" + id + "]";
	}
	public Customer(String name, int price, int id) {
		super();
		this.name = name;
		this.price = price;
		this.id = id;
	}
	public static int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public int compareTo(Object o) {
		 Customer e=(Customer) o;
		 if(this.price>e.price) {
			 return -1;
		 }
		 else if(this.price<e.price) {
			 return 1;
			 
		 }else {
			 return 0;
		 }
	}
}
public class StreamEx{
   @SuppressWarnings("unchecked")
public static void main(String[] args) {
      List<Customer> l = new ArrayList<Customer>();
      l.add(new Customer("arasa", 2200,11 )); 
      l.add(new Customer("kumaran", 1900, 10)); 
      l.add(new Customer("als", 6300, 5)); 
      l.add(new Customer("ravi", 5500, 1)); 
      l.add(new Customer("yaamnin", 1800, 21));
               
      Stream s=l.stream();
      Stream s1=l.stream();
      long result=l.stream().filter(o->((Customer)o).getPrice()>5000).count();
      System.out.println(result);
      
      IntConsumer bi=((o)->
		{
			int max=5000;
			if(max<o)
			{
				max=o;
			}
			System.out.println("Highest Price : "+max);
			highamount(max);
			
		});
		bi.accept(Customer.getPrice());
     
     }
   private static void highamount(int max) {
	   if(Customer.getPrice()==max)
		{
			System.out.print(Customer.getName()+" "+Customer.getId());			
		}
		
	}
}