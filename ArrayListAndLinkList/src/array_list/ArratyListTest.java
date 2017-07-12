package array_list;

public class ArratyListTest {
	
	int size;
	private Object[] elementData;
	
	
	public ArratyListTest(){
		this(10);    //无参可以默认参数的值。
	}
	
	
    public ArratyListTest(int initialCapactiry){
    	super();
    	if(initialCapactiry<0){
    		throw new IndexOutOfBoundsException("index more array");
    	}
		
    	this.elementData = new Object[initialCapactiry];
	}
    
	
	public void add(Object obj,int index){   //插入
		
		rangCheck(index);
		arrayListCapacity(index);
		elementData[size++]=obj;
		
	}
	
	public void add(int index,Object obj){   //指定位置插入
		rangCheck(index);
		arrayListCapacity(index);
		System.arraycopy(elementData, index, elementData, index+1, size-index);
		elementData[index]=obj;
		size++;
	}
	
	public void remove(int index){    //移除指定位置
		
		rangCheck(index);
		arrayListCapacity(index);
		System.arraycopy(elementData, index+1, elementData,index, size-index-1);
		elementData[--size]= null;
	}
	
	public void remove(Object obj){    //移除指定字符的位置
		
		for(int i=0;i<size;i++){
			if(get(i).equals(obj)){
				remove(i);
				
			}
			
		}
	}
	
	public Object set(Object obj,int index){
		rangCheck(index);
		arrayListCapacity(index);
		
		Object oldArray=elementData[index];
		elementData[index]=obj;
		return oldArray;
		
	}
	
	public Object get(int index){
		rangCheck(index);
		arrayListCapacity(index);
		return elementData[index];
		
	}
	
	public void arrayListCapacity(int index){   //扩容
		if(index>=size){
			Object[] newelementData = new Object[size*2+1];
			System.arraycopy(elementData, 0, newelementData, 0, elementData.length);
			elementData=newelementData;
		}
		
		
	}
	
	public  void rangCheck(int index){
		if(index>=size||index<0){
			throw new IndexOutOfBoundsException("index more array");
		}
		
	}
	
	
	public static void  main(String[] args){
		
		ArratyListTest list = new ArratyListTest(10);
	
		list.add(1, "dad");

	
	}
}
