package iterator.test;



import java.util.Iterator;

/**
 * 
 * 
 * 自己实现迭代器，用于遍历。
 * @author user
 *
 */

public class IteratorTest<E> {
	
	Object[] ele = new Object[10];
	
    int coursoe=-1;
	
	int size;
	
	public int size(){
		return size;
	}
	
	public void add(E obj){
		coursoe = 0;
		ele[coursoe++]=obj;
		size++;
	}
	
	
 class Myiter implements Iterator<E> {
			
	public void remove(){
		
	 System.arraycopy(ele, coursoe+1, ele,coursoe ,size-(coursoe+1));
	 coursoe--;
	 size--;
		
	}



	public E next() {
		coursoe++;
		return (E)ele[coursoe];
	}
	
	
	public boolean hasNext() {
		
	return coursoe+1!=size;
			
		
	}
	
	
   }

	
	public Iterator <E>iterator(){
	return  new Myiter();
}
	
	
	public static void main(String[] args){
		
		IteratorTest<String> iter = new IteratorTest();
		
		 iter.add("aa");
		 iter.add("cc");
		 iter.add("dd");
		
	    Iterator it = iter.iterator();
	    
	    while(it.hasNext()){
		System.out.println(it.next());
		
	}
	

	}
	

}
