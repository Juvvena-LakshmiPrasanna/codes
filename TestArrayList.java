import java.util.ArrayList;
class Student
{
  private int stid;
  private String sname;
  private int age;
  public Student(){}
  public Student(int stid,String sname,int age)
  {
     this.stid=stid;
     this.sname=sname;
     this.age=age;
  }
  public void setStid(int stid)
  {
     this.stid=stid;
  }
  public void setsname(String sname)
  {
     this.sname=sname;
  }
  public void setAge(int age)
  {
	 this.age=age;
  }
  public int getStid() { return stid; }
  public String getSname() { return sname; }
  public int getAge() { return age; }
  }
class Training
 {
    private int tno;
	private String tname;
	ArrayList<Student> slist = new ArrayList<>();
	list.add(1,"Ajay",20);
	list.add(2,"Babu",21);
	for(Student s : slist)
	  System.out.println(s);
	public Training(){}
	public Training(int tno,String tname,ArrayList<Student>)
	{
	 this.tno=tno;
	 this.tname=tname;
	}
	public void setTno(int tno)
	{
	 this.tno=tno;
	}
    public void setTname(String tname)
    { 
	  this.tname=tname;
	}
	public int getTno() { return tno; }
	public String getTname() { return tname; }
	}
class TestArrayList
 {
	public static void main(String[] args)
	 {
	   Student[] s ={ new Student(101,"Ajay",20),new Student(102,"Babu",21),new Student(103,"Chandu",20)};
	   Training t = {new Training(10,"JAVA"),new Training(20,"PYTHON")};
	   {
	     System.out.println(get
	   }
	   }
		
        		
	 
	
   