package string;

public class StringCompare {

	public static void main(String[] args) {
		String str1="sise";
		String str2="sise";
		String str3=new String("sise");
		String str4=new String("sise");
		
		System.out.println("str1==str2?:"+str1==str2);
		System.out.println("str1.equals(str2)?:"+str1.equals(str2));
		System.out.println("str1.compare(str2)?:"+str1.compareTo(str2));
		System.out.println("str1.compareTo(str3)?:"+str1.compareTo(str3));
		System.out.println("str1.equals(str3)?:"+str1.equals(str3));
		System.out.println("str3.equals(str4)?:"+str3.equals(str4));
		System.out.println("str3==str4?:"+str3==str4);
		System.out.println("str1hasCode?:"+str1.hashCode());
		System.out.println("str3hasCode?:"+str3.hashCode());
		System.out.println("str2hasCode?:"+str2.hashCode());
		System.out.println("str4hasCode?:"+str4.hashCode());
	}

}
