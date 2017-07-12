package string;

public class StringBufferTest {

	public static void main(String[] args){
		
		StringBuffer str=new StringBuffer("zhangsan@scse.com");
		StringBuffer ch= new StringBuffer("Email:");
		StringBuffer sb= new StringBuffer("广州大学华软软件学院");
		System.out.println("追加:"+str.append(sb));
		System.out.println("插入:"+str.insert(0,ch));
		System.out.println("获取："+str.indexOf("sise"));
		System.out.println("替换："+str.replace(16,20,"scse"));
		System.out.println("长度："+str.length());
		System.out.println("删除："+str.delete(23,33));
	}
	
}
