import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Collection;
import java.util.Map.Entry;
class HashMap4
{
  public static void main(String[] args)
  {
    LinkedHashMap<String,String> map = new LinkedHashMap<>();
	map.put("abc2gmail.com","abc@123");
	map.put("xy@yahoo.com","xyz@123");
	map.put(null,"redbbc");
	map.put(null,"somexyz");
	map.put("xy@yahoo.com","newpassword");
	Set<Entry<String,String>> set = map.entrySet();
	for(Entry<String,String> s : set)
	  System.out.println(s.getKey()+" "+s.getValue());
	
  }
}