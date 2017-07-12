package link_list;
/**
 * 
 * 自己实现双链表
 * @author user
 *
 */
public class LinkListTest {
	
	private Node first;
	private Node last;
	int size;
	
	public int size(){
		
		return size;
	}
	
	public void add(Object obj){
		Node newNode = new Node();
		if(first==null){
			newNode.setPrevious(null);
			newNode.setData(obj);
			newNode.setNext(null);
			first = newNode;
			last=newNode;
			
		}else{
			
			
			newNode.setPrevious(last);
			newNode.setData(obj);
			newNode.setNext(null);
			last.setNext(newNode);
            last= newNode;
			
		}
		size++;
	}
	
	public Object get(int index){
		
		rangCheck(index);
		
		Node temp = null;
		
		if(first==null){
			return 0;
		}else{
			temp = first;
			for(int i=0;i<index;i++){
				
				temp=temp.next;
			}
			return temp.Data;
		}
	}
	
	public void remove(int index){
		
		Node temp = null;
		if(first==null){
			
		}else{
			temp = first;
			for(int i=0;i<index;i++){
				
				temp=temp.next;
			}
		}
		
		if(temp!=null){
			
			Node up = temp.previous;
			Node down = temp.next;
			up.next = down;
			down.previous = up;
			size--;
			
		}
	}
	
	public void rangCheck(int index){
		if(index >=size||index<0){
			
			 try {
				throw new Exception();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
		}
	}
	
	
	public void add(int index,Object obj){
		
		Node temp = null;
		if(first==null){
			return;
		}else{
			temp = first;
			for(int i=0;i<index;i++){
				
				temp=temp.next;
			}
		}
		
		Node newNode = new Node();
		newNode.Data=obj;
		if(first == null){
			
			return ;
		}else{
			Node up = temp.previous;
			up.next=newNode;
			newNode.previous=up;
			
			
			newNode.next=temp;
			temp.previous=newNode;
			
			size++;
		}
	}
	
	public static void main(String[] args){
		
		LinkListTest list = new LinkListTest();
		 list.add("aaa");
		 list.add("bbb");
		 list.add("ccc");
		 list.add("ddd");
		 list.add("eee");
		 list.remove(1);
		 list.add(1, "fff");
		System.out.print(list.get(1));
			
	}

}
