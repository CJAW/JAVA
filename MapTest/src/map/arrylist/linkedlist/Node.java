package map.arrylist.linkedlist;

public class Node {
	
	  Node previous;
	  Node next;
    Object Data;
	
	
	public Node(){
		
	}

	public Node(Node previous,Node next,Object Data){
		this.previous=previous;
		this.next=next;
		this.Data=Data;
	}

	public Object getPrevious() {
		return previous;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Object getData() {
		return Data;
	}

	public void setData(Object data) {
		Data = data;
	}

	public void setPrevious(Node previous) {
		this.previous = previous;
	}


	

}