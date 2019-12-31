class ExceptionHandling2
{
 public static void main(String[] args)
 {
  try
   { 
   int a[]=new int[5];
	a[5]=25/0;
	System.out.println("The value is: "+a[5]);
   }
   catch(ArithmeticException e)
	{
	System.out.println("Arithmetic Exception occurs");
	}
	finally
	{
	 System.out.println("Finally block will always executed");
	}
 }
}