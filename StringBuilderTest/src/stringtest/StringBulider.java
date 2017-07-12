package stringtest;

public class StringBulider {
	public static void main(String[] args){
		
	
	String str = new String("wanmei");
	
	for(int i=0;i<10;i++){
		
		str=str+i;
		System.out.println(str);
		
	}
	
	
	
	StringBuilder sc=new StringBuilder("ee");
	for(int i=0;i<10;i++){
		sc.append(i);
		
		System.out.println(sc);
	}

	StringBuilder st=new StringBuilder("222eeee");
	
	          st.insert(1, 3);
	          System.out.println(st);
	          
	 StringBuilder ste=new StringBuilder("222eeee");
	            ste.lastIndexOf(str);
	            System.out.println(ste);
	            
	  StringBuilder sta=new StringBuilder("dadwdfgrgh");
	            sta.delete(2, 8);
	            System.out.println(sta);
	            
	            
	   StringBuilder sb=new StringBuilder("dadwdfgrgh"); 
	           sb.replace(2, 5,"aaaaa");
	           System.out.println(sb);
	           
	           
	    
	}

}
