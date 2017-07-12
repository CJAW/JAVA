package tree;

import java.util.Scanner;

/**
 * 创建树,前序遍历
 * @author user
 *
 */

 public class ParentTree{
	
  public static Scanner str;
  
  public static void main(String[] args){
	  
	 
	 
	  //实例化内部类，要先实例化外部类，在调用时实例化内部类，（内部类相当于方法的调用）
	  ParentTree p = new ParentTree();
	  Node root = p.new Node();
	
	  Tree(root);
	  PreorderTraver(root,0);
	  
  }
	
	/**
	 * 前序遍历
	 */
	
	public static void PreorderTraver(Node p, int i){
		
		if(p!=null){
			
			System.out.println(p.date+"  "+i+1);
			PreorderTraver(p.lchild,i+1);
			PreorderTraver(p.rchild,i+1);
			
		}
		
	}


/**
 * 创建树
 * @author user
 *
 */

public static void Tree(Node root){
	String[] data ={"a","b","c","d","e","f"};
		if(root.date==null){
			
			return;
		}else{
			
			Tree(root.lchild);
			Tree(root.rchild);
			
		}
		
}
/**
 * 创建节点
 * @author user
 *
 */
 class Node {
	
	private Node lchild;
	private Node rchild;
	private String date;
	public Node(Node lchild, Node rchild, String date) {
		super();
		this.lchild = lchild;
		this.rchild = rchild;
		this.date = date;
	}
	

	public Node() {
		super();
		
	}
	
  }
}
 


	

	
