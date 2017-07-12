package map_test;



/**
 * 
 * 自己实现Map(映射，通过键找到值)中的HashMap
 * 键不能相同，否则值会向下一个移动
 *
 */


public class MapTest {
	
	MyMap[] arr = new MyMap[100];
	
	int size;
	
	public void put(Object key,Object value){
		
		for(int i=0;i<size;i++){
		
		if(arr[i].key.equals(key)){
			
			arr[i].value=value;
		}
	}
		MyMap e = new MyMap(key,value);
		
		arr[size++]=e;
		
		
	}
	
	public Object get(Object key){
		
		for(int i=0;i<size;i++){
			
			if(arr[i].key.equals(key)){
				
				return arr[i].value;
			}
		}
		
		
		return 0;
	}
	
	public void remove(Object key){
		
		for(int i=0;i<size;i++){
			if(arr[i].key.equals(key)){
				
				arr[i].key=arr[i+1].key;
				arr[i].value=arr[i+1].value;
			}
		}
		
		
	}
	

	public  static void main(String[] args){
		
		
		
		
		MapTest map= new MapTest();
		map.put("123", "zhangshang");
		map.put("234", "lisi");
		map.put("444", "we");
		map.put("555", "rww");
		map.remove("234");
		System.out.print(map.get("444"));
		
		
	}
	

}


class MyMap{
	
	Object key;
	Object value;
	
	public MyMap(Object key,Object value){
		this.key=key;
		this.value=value;
	}
	
}
