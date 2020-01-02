import java.util.TreeSet;
import java.util.Iterator;
class TreeSet2
{
  public static void main(String[] args)
  {
    TreeSet<Employee> tset = new TreeSet<>();
	tset.add(new Employee(102,"Babu",2000));
	tset.add(new Employee(103,"Ajay",1000));
	tset.add(new Employee(104,"Dinesh",4000));
	tset.add(new Employee(103,"Chandra",3000));
	for(Employee e : tset)
	  e.display();
  }
}