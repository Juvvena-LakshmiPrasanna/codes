import java.util.HashMap;
import java.util.Set;
import java.util.Collection;
class HashMap2
{
  public static void main(String[] args)
  {
    HashMap<String,String> map = new HashMap<>();
	map.put("abc2gmail.com","abc@123");
	map.put("xy@yahoo.com","xyz@123");
	map.put("bbc@rediff.com","redbbc");
	map.put("someuser@xyz.com","somexyz");
	Set(<String> keys = map.KeySet());
	for(String k : keys)
	  System.out.println(k+" "+map.get(k));
	Collection<String> values = map.values();
	for(String v : values)
	  System.out.println(v);
	
  }
}