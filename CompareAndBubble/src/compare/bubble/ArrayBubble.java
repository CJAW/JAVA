package compare.bubble;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 实现数组内部的排序
 * @author user
 * @param <T>
 *
 */

public class ArrayBubble{
	

public static  void sort(String[] arr,Comparator com){
		
		boolean sore = true;
	
	for(int j=0;j<arr.length-1;j++){   //趟数
		
		sore = true;

      for(int i=0;i<arr.length-1-j;i++){   //减次数
 
    	  if(com.compare(arr[i], arr[i+1])<0){
    		 
    		  String temp;
    		  temp = arr[i+1];
    		  arr[i+1]=arr[i];
    		  arr[i]=temp;
    	      sore = false;
    	  }
    		
      } 
     		if(sore){
    	    break;
      }
		}

	}
	



public static void main(String[] args){
	
	String[] str ={"asd","qde","ad","sda"};

     sort(str,new Com());
 
	 System.out.println(Arrays.toString(str));
}



}
