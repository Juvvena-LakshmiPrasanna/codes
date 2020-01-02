import java.util.StringTokenizer;
class TestToken
{
  public static void main(String[] args)
  {
    String s = "Something to , Written and Shown , to the participants";
	StringTokenizer st = new StringTokenizer(s,",");
	System.out.println(st.countTokens());
	while(st.hasMoreTokens())
	  System.out.println(st.nextToken());
  }
}
	