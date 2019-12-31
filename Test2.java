class Employee
 {
       private int empid;
       private String ename;
       double salary;
       public Employee(){}
       Employee(int empid,String ename,double salary)
 {
     this.empid=empid;
     this.ename=ename;
     this.salary=salary;
 }
  public String toString()
  {
    return "Empid is "+empid+"\n Ename is"+ename+"\n salary is "+salary;
}
class Test2
{ 
  public static void main(String[] args)
  {
    Employee e= new Employee(101,"Ajay",25000);
	System.out.println(e);
  }
}	
	
}