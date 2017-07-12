package map.list.collections;
/**
 * 使用collections工具类实现容器的只读；
 * 
 * List,Map的用法一样。
 */

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapCollections {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();

		map.put("aa", "ddd");
		map.put("ee", "ddwd");
		map.put("aaw", "dddw");

		Map<String, String> map2 = Collections.unmodifiableMap(map);

		// map2.put("aad","adw");

		System.out.println(map.size());
	}

}
