import java.util.HashMap;

class HashMap1
{
  public static void main(String[] args)
  {
    HashMap<String,String> map = new HashMap<>();
	map.put("abc2gmail.com","abc@123");
	map.put("xy@yahoo.com","xyz@123");
	map.put("bbc@rediff.com","redbbc");
	map.put("someuser@xyz.com","somexyz");
	System.out.println(map.size());
	System.out.println(map.get("xy@yahoo.com"));
  }
}