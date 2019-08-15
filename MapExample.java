
import java.util.*;
public class MapExample
{
	public static void main(String[] args) {
	 Map<Integer,String> map=new HashMap<Integer,String>();
	  map.put(1,"Yash");
	  map.put(4,"Yash");
	  map.put(2,"Gupta");
	  map.put(3,"Gupta");
	  
	  Set set=map.entrySet();
	  Iterator itr=set.iterator();
	  while(itr.hasNext()){
	      Map.Entry entry=(Map.Entry)itr.next();
	      System.out.println(entry.getKey()+" "+entry.getValue()+" "+entry.hashCode());
	  }
	}
}
