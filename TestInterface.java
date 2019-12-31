interface Calculator
{
  int sum(int a,int b);
  int minus(int a,int b);
  
 }
 class ACalculator implements Calculator
 {
   public int sum(int a,int b)
   {
     return a+b;
   }
   public int minus(int a ,int b)
   {
    return a-b;
   }
   
 }
 class BCalculator implements Calculator
 {
  public int sum(int a,int b)
  {
    return a-(-b);
  }
  public int minus(int a,int b)
  {
    return a+(-b);
  }
 }
class TestInterface
{ 
 public static void main(String[] args)
 {
 Calculator c = new ACalculator();
 {
 System.out.println(c.sum(25,50));
 System.out.println(c.minus(50,25));
 }
 Calculator s = new BCalculator();
 {
 System.out.println(s.sum(25,50));
 System.out.println(s.minus(25,50));
 }
}
}

  