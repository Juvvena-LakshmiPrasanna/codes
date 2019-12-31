import java.util.Scanner;
class TestScanner
{
 public static void main(String[] args)
 {
   Scanner s = new Scanner(System.in);
   System.out.println("Enter a Number :"   );
   int n =s.nextInt();
   s.nextLine();
   System.out.println("Enter a String : " );
   String p=s.nextLine();
   System.out.println(n+" "+p);
  }
}  
   