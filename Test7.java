class Student
{
  private int Rno;
  private String Name;
  int M1,M2,M3;
  public Student(){}
  public Student(int Rno,String Name,int M1,int M2,int M3)
  {
     this.Rno=Rno;
	 this.Name=Name;
	 this.M1=M1;
	 this.M2=M2;
	 this.M3=M3;
  }
 public int getTotalMarks()
 {
    return M1+M2+M3;
 }	
 public int getAverage()
 {
   return (M1+M2+M3)/3;
 } 
 public String getResults()
 {
   if(M1>=40 && M2>=40 && M3>=40)
   return "PASS";
   return "FAIL";
 }
 public String getDivision()
 {
 if(M1>=40 && M2>=40 && M3>=40)
  {
    int avg=getAverage();
    if(avg>=70)
	 return "FIRST";
    if(avg>=50)
	 return"SECOND";
	else
	 return "THIRD";
  }
  else 
   return "NILL";
 }
 public int getRno() { return Rno; }
 public String getName() { return Name; }
 }
 class Test7
{
  public static void main(String[] args)
  {
    Student[] s={new Student(101,"John",70,80,90),new Student(102,"Ajay",65,75,85),new Student(103,"Babu",45,78,89)};
	for(int i=0;i<s.length;i++)
	{
    System.out.println(s[i].getRno());
	System.out.println(s[i].getName());
    System.out.println(s[i].getTotalMarks());	
	System.out.println(s[i].getAverage());
	System.out.println(s[i].getResults());
	System.out.println(s[i].getDivision());
  }	
 } 
}
