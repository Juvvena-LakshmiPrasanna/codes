class TestSplit
{
  public static void main(String[] args)
  {
    String s = "Something to , Written and Shown , to the participants";
	String[] s1 = s.split(" , ");
	for(int i=0;i<=s1.length;i++)
	  System.out.println(s1[i]);
  }
}
	