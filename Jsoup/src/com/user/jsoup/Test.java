package com.user.jsoup;


import java.util.ArrayList;

public class Test {
	
	
    public static java.util.List<Data> lists = new ArrayList<Data>();
    
	public static void main(String[] args){
		HtmlUtils htmlUtils = new HtmlUtils();
		lists = htmlUtils.getAttendce();
		System.out.println(lists.get(0).leftList.get(2));
		
	}

}
