class Person
{
  private int ssn,age;
  private String name;
  public Person(){}
  public Person(int ssn,String age,int age)
  {
    this.ssn=ssn;
	this.name=name;
	this.age=age;
  }
  public void setSsn(int ssn)
  {
    this.ssn=ssn;
  }
  public void setName(string name)
  {
    this.name=name;
  }
  public void setAge(int age)
  {
    this.age=age;
  }
public int getSsn(){ return ssn; }
public String getName() { return name; }
public int getAge() { return age; }
}
class Student extends Person
{
  private int rno;
  private char Grade;
  public Student(){}
  public Student( int ssn,String name,int age,int Rno,char grade)
{
  super(ssn,name,age);
  this.rno=rno  ;
  this.grade=grade;
  
 }
 public void setRno(int rno) { this.rno=rno ; }
 public void setGreade(char grade){ this.grade=grade;}
 public int getRno(){ return rno; }
 public char getGrade(){ return grade; }
 }
 class PostGraduate
 {  
  private String spcourse;
  public PostGraduate(){}
  public PostGraduate(int ssn,String name,int age,int Rno,char grade,String spcourse)
  {
   super(ssn,name,age,rno,grade);
   this.spcourse=spcourse;
   }
   public void setSpsourse( String spcourse) { this.spcourse=spcoure ; }
   public String getspcourse(){ return Spcourse; }
   }
   class Test11
   {
     public static void main(String[] args)
	 {
	  PostGraduate pg = new PostGraduate(101,"John",30,10,'A',"JAVA");
	  System.out.println(pg.getSsn());
	  System.out.println(pg.getName());
	  System.out.println(pg.getAge());
	  System.out.println(pg.getRno());
	  System.out.println(pg.getGrade());
	  System.out.println(pg.getSpcourse());
	  }
	}
	  
	  
  
	