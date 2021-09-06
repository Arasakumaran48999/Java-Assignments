package Day12;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Studentdata{
   @SuppressWarnings("unchecked")
  public static void main(String[] args) {
      List<Student> l = new ArrayList<Student>();
      l.add(new Student(1,"Arasa","dindigul",98,94,97,0, 0)); 
      l.add(new Student(2,"kumaran","madurai",99,93,97,0, 0)); 
      l.add(new Student(3,"Als","chennai",34,34,37,0, 0));
      l.add(new Student(4,"hari","dindigul",98,39,97,0, 0)); 
      l.add(new Student(5,"gopi","madurai",99,23,97,0, 0)); 
      l.add(new Student(6,"balaji","chennai",34,39,37,0, 0)); 
      l.add(new Student(7,"vichu","dindigul",98,74,97,0, 0)); 
      l.add(new Student(8,"puppy","madurai",99,30,97,0, 0)); 
      l.add(new Student(9,"zmr","chennai",34,34,39,0, 0)); 
      Student s=new Student();
      
      for (Student p : l) {
    	    p.total=p.maths+p.science+p.social;
    	    p.avg=p.total/3;
    	    //System.out.println("total:"+p.total+" avg:"+p.avg);
    	}
      
     
      /*Stream s1=l.stream();
     
      List<Student> kl=(List<Student>) l.stream().max((i1,i2)->i1.compareTo(i2)).get();
      System.out.println(kl);*/
      Student c=l.stream().max((i1,i2)->i1.compareTo(i2)).get();
	   System.out.println(c);
	   List<Student> ul=l.stream().sorted((i1,i2)->((Student)i1).name.length()>((Student)i2).name.length()?-1:1).collect(Collectors.toList());
	   System.out.println(ul);
	   List<Student> l1=l.stream().sorted((i1,i2)->((Student)i1).total/3>((Student)i2).total/3?1:-1).collect(Collectors.toList());
	   System.out.println(l1);
         }
   


}