import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
public class App92 {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> hm= new LinkedHashMap<>();
		hm.put(100, "mo");
		hm.put(101, "dia");
		hm.put(102, "chat");
		for(Map.Entry<Integer,String> m:hm.entrySet())
			System.out.println(m.getKey()+""+m.getValue());
		System.out.println("before invoking remove method: "+hm);
		hm.remove(101);
		System.out.println("after invoking remove method: "+hm);
	}
}