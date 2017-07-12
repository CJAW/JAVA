package map.arrylist.linkedlist;
/**
 * 
 * Map的底层是数组＋链表
 * 使用hashCode 实现Map键值的快速查找。
 *
 */

public class NewMap {
	
	int size;
	
	LinkListTest[] arr = new LinkListTest[100];
	
	
	
	public void put(Object key,Object value){
		
		MyMap e = new MyMap(key,value);
		
		int a = key.hashCode()%arr.length;
		
		if(arr[a]== null){
			LinkListTest list = new LinkListTest();
			arr[a] =list;
			list.add(e);
			
			
		}else{
			
	        	LinkListTest list = arr[a];
	        	
	        	for(int i=0;i<list.size();i++){
	        		
	            MyMap e1=(MyMap) list.get(i);
	            
	            if(e1.key.equals(key)){
	            	
	           e1.value=value;
	       	}
	        		
	        	}
			
			arr[a].add(e);
		}
		
	    size++;
      }



    public Object get(Object key){
    	
        int a = key.hashCode()%arr.length;
        
        if(arr[a]!=null){ 
        	
        	LinkListTest list = arr[a];
        	
        	for(int i=0;i<list.size();i++){
        		
            MyMap e=(MyMap) list.get(i);
            
            if(e.key.equals(key)){
            	
            	return e.value;
            }
            
  
       	}
        		
        	}
        	return 0;
        }
        
    	
    public static void main(String[] args){
    	NewMap map = new NewMap();
    	map.put("1","aaa");
    	map.put("1","bbb");
    	map.put("2","bbb");
    	map.put("3","ccc");
		map.put("4","ddd");
		map.put("5","eee");
		
		
		System.out.print(map.get("3"));
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