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
  public Student( int ssn,String name,int age,int Rno,char grage)
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
 
  
	
  