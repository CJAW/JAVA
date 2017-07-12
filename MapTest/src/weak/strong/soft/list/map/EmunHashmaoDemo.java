package weak.strong.soft.list.map;

import java.util.EnumMap;

/**
 * emunHashMap 枚举hashmap,键必须是枚举
 * @author user
 *
 */

public class EmunHashmaoDemo {
	
	public static void main(String[] args){
		
		EnumMap <munber,String>map = new EnumMap <munber,String>(munber.class);
		
		map.put(munber.a,"sda" );
		map.put(munber.b,"sdsa" );
		map.put(munber.c,"sdasa" );
		map.put(munber.d,"sdda" );
	
		
		System.out.println(map.get(munber.a));
		System.out.println(map.get(munber.b));
		System.out.println(map.get(munber.c));
		System.out.println(map.get(munber.d));
	}
	
	 enum  munber{
		
		 a,b,c,d
		 
	}

}
