import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 常用类的容器效率高，但线程不安全，不能同步
 * 
 * 使用collections实现容器的同步
 * 
 * @author user
 *
 */
public class SynCollectionDemo {
	
	
	public static void main(String[] args){
		
		List<String>list = new ArrayList<String>();
		
		list.add("aa");
		list.add("nsm");
		list.add("asd");
		
		List<String >list2 = Collections.synchronizedList(list);
		
		for(int i=0;i<list.size();i++){
		
		System.out.println(list.get(i));
		}
	}

}
