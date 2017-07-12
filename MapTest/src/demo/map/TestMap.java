package demo.map;
/**
 * 可以使用iterator方法遍历容器
 */


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMap {
	
	
public static void main(String[] args){
		
   Map map1 = new HashMap();
	map1.put("name","jj");
	map1.put("age", 23);
	map1.put("price", 32);
	map1.put("day", "210-11");
	
	
	 Map map2 = new HashMap();
		map2.put("name","jf");
		map2.put("age", 23);
		map2.put("price", 42);
		map2.put("day", "2100-11");
		
	 Map map3 = new HashMap();
			map3.put("name","jd");
			map3.put("age", 25);
			map3.put("price", 22);
			map3.put("day", "2105-11");
			
			
			List list = new ArrayList();
			
			list.add(map1);
			list.add(map2);
			list.add(map3);
			
			print(list);
	}


public static void  print(List list){
	
	for(int i=0;i<list.size();i++){
	
		
		System.out.println((Object)((Map) list.get(i)).get("name"));
		
		
		
		
	}
	
}

}
