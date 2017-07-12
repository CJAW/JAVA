package compare.bubble;
/**
 * comparator实现长度的比较
 * @author user
 *
 * @param <T>
 */

public class Com<T> implements java.util.Comparator<String> {

	public int compare(String O1,String O2 ) {
		
		int len1 =O1.length();
		int len2 = O2.length();
		return len1-len2;
		
		
	}
	
}
