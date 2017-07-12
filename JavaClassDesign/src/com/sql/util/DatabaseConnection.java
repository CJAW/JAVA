package com.sql.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class DatabaseConnection {
	
	static Connection conn ;
	Vector <Object>vc;
	Vector <Object>msg;
	List<String> list;
	private String url="jdbc:sqlserver://172.16.168.43:1433;DatabaseName=design";
	private String user="sa";
	private String pd="kcaj201510251025";
	private String Driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	public Vector <Object> select(String uname){

		vc = new Vector<Object>();
	    try {
	    	Class.forName(Driver);
			conn = (Connection) DriverManager.getConnection(url,user,pd);
			String sql = "select Uname,Sex,Uage,Tname,Uaddress,Upostcode,Uphone from consumer where Uname=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, uname);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				msg =new Vector<Object>();
				for(int i =1;i<8;i++){
					msg.addElement(rs.getObject(i));
				}
				vc.addElement(msg);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	    
	    return vc;
	    
	}
	
	public Vector <Object> select(){

		vc = new Vector<Object>();
	    try {
	    	Class.forName(Driver);
			conn = (Connection) DriverManager.getConnection(url,user,pd);
			String sql = "select Uname,Sex,Uage,Tname,Uaddress,Upostcode,Uphone from consumer";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				msg =new Vector<Object>();
				for(int i =1;i<8;i++){
					msg.addElement(rs.getObject(i));
				}
				vc.addElement(msg);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	    
	    return vc;
	    
	}
	
	public Vector <Object> selectOrderMessages(String MID){

		vc = new Vector<Object>();
	    try {
	    	Class.forName(Driver);
			conn = (Connection) DriverManager.getConnection(url,user,pd);
			String sql = "select MID,Mnum,Osum,ptime from ord where MID=?" ;
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, MID);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				msg =new Vector<Object>();
				for(int i =1;i<6;i++){
					msg.addElement(rs.getObject(i));
				}
				vc.addElement(msg);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	    
	    return vc;
	    
	}
	
	
public Vector<Object> selectID(String ID) {

		vc = new Vector<Object>();
		try {
			Class.forName(Driver);
			conn = (Connection) DriverManager.getConnection(url, user, pd);
			String sql = "select UID,Uname,Sex,Uage,Tname,Uaddress,Upostcode,Uphone from consumer where UID=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,ID);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				msg = new Vector<Object>();
				for (int i = 1; i < 9; i++) {
					msg.addElement(rs.getObject(i));
				}
				vc.addElement(msg);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return vc;
	}

public List<String> selectIdPw(String ID,String password){
	
	
    try {
    	Class.forName(Driver);
		conn = (Connection) DriverManager.getConnection(url,user,pd);
		String sql = "select Uname, Password from consumer  where Uname = ? and Password=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setObject(1,ID);
		ps.setObject(2,password);
		ResultSet rs = ps.executeQuery();
	    while(rs.next()){
	    	list = new ArrayList<String>();
	    	list.add(0,rs.getString(1));
	    	list.add(1,rs.getString(2));
	    }
	  
	} catch (SQLException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
     
    return list;
}



public void Insert(String name,String sex,String age,String passWord,String tname,String uadd,String upc,String upho){
	
    
    try {
    	Class.forName(Driver);
		conn = (Connection) DriverManager.getConnection(url,user,pd);
		String sql = "insert into consumer(Uname,Sex,Uage,Password,Tname,Uaddress,Upostcode,Uphone,Signtime) values (?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setObject(1,name);
		ps.setObject(2,sex);
		ps.setObject(3,age);
		ps.setObject(4,passWord);
		ps.setObject(5,tname);
		ps.setObject(6,uadd);
		ps.setObject(7,upc);
		ps.setObject(8,upho);
		ps.setObject(9, new java.sql.Date(System.currentTimeMillis()));
		ps.execute();
	} catch (SQLException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
     
   
}


public void update(String pw,String name){
	
    try {
    	Class.forName(Driver);
		conn = (Connection) DriverManager.getConnection(url,user,pd);
		String sql = "update consumer  set Password= ? where Uname=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1,pw);
		ps.setString(2,name);
		ps.execute();
		
	} catch (SQLException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
     
}

public void delete(String name){
	
    try {
    	Class.forName(Driver);
		conn = (Connection) DriverManager.getConnection(url,user,pd);
		String sql = "delete from consumer where Uname=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1,name);
		ps.execute();
		
	} catch (SQLException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
     
}

public void updateMessage(String name,String sex,String age,String tname,String uadd,String upc,String upho){
	
    try {
    	Class.forName(Driver);
		conn = (Connection) DriverManager.getConnection(url,user,pd);
		String sql = "update consumer  set Uname=?,Sex=?,Uage=?,Tname=?,Uaddress=?,Upostcode=?,Uphone=?,Signtime=? where Uname=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setObject(1,name);
		ps.setObject(2,sex);
		ps.setObject(3,age);
		ps.setObject(4,tname);
		ps.setObject(5,uadd);
		ps.setObject(6,upc);
		ps.setObject(7,upho);
		ps.setObject(8, new java.sql.Date(System.currentTimeMillis()));
		ps.setObject(9,name);
		ps.execute();
		
	} catch (SQLException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
     
}

public List <String> selectVname(){

	List listName= new ArrayList<String>();	
    try {
    	Class.forName(Driver);
		conn = (Connection) DriverManager.getConnection(url,user,pd);
		String sql = "select *from vendor";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();		
		while(rs.next()){
			String name=rs.getString(2);
			listName.add(name);
		}
	} catch (SQLException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
    
    return listName;
    
}	

public Vector <Object> selectMerchandise(String Mname,String Vname){

	vc = new Vector<Object>();
    try {
    	Class.forName(Driver);
		conn = (Connection) DriverManager.getConnection(url,user,pd);
		Statement stat = conn.createStatement();
		String sql = "select * from merchandise where Mname="+"\'"+Mname+"\' and VID in (select VID from vendor where Vname="+"\'"+Vname+"\')";
		ResultSet rs=stat.executeQuery(sql);			
		while(rs.next()){
			msg =new Vector<Object>();
			for(int i =1;i<8;i++){
				msg.addElement(rs.getObject(i));
			}
			vc.addElement(msg);
		}
	} catch (SQLException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
    
    return vc;
    
}

public Vector <Object> selectAllVendor(){

	vc = new Vector<Object>();
    try {
    	Class.forName(Driver);
		conn = (Connection) DriverManager.getConnection(url,user,pd);
		Statement stat = conn.createStatement();
		String sql = "select * from vendor";
		ResultSet rs=stat.executeQuery(sql);			
		while(rs.next()){
			msg =new Vector<Object>();
			for(int i =1;i<8;i++){
				msg.addElement(rs.getObject(i));
			}
			vc.addElement(msg);
		}
	} catch (SQLException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
    
    return vc;
    
}

public Vector <Object> selectVendor(short VID){

	vc = new Vector<Object>();
    try {
    	Class.forName(Driver);
		conn = (Connection) DriverManager.getConnection(url,user,pd);
		Statement stat = conn.createStatement();
		String sql = "select * from vendor where VID="+"\'"+VID+"\'";
		ResultSet rs=stat.executeQuery(sql);			
		while(rs.next()){
			msg =new Vector<Object>();
			for(int i =1;i<8;i++){
				msg.addElement(rs.getObject(i));
			}
			vc.addElement(msg);
		}
	} catch (SQLException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
    
    return vc;
    
}

public Vector <Object> selectAllMtype(){

	vc = new Vector<Object>();
    try {
    	Class.forName(Driver);
		conn = (Connection) DriverManager.getConnection(url,user,pd);
		Statement stat = conn.createStatement();
		String sql = "select TID,Typename from mtype";
		ResultSet rs=stat.executeQuery(sql);			
		while(rs.next()){
			msg =new Vector<Object>();
			for(int i =1;i<3;i++){
				msg.addElement(rs.getObject(i));
			}
			vc.addElement(msg);
		}
	} catch (SQLException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
    
    return vc;
    
}

public Vector <Object> selectMtype(short TID){

	vc = new Vector<Object>();
    try {
    	Class.forName(Driver);
		conn = (Connection) DriverManager.getConnection(url,user,pd);
		Statement stat = conn.createStatement();
		String sql = "select TID,Typename from mtype where TID="+"\'"+TID+"\'";
		ResultSet rs=stat.executeQuery(sql);			
		while(rs.next()){
			msg =new Vector<Object>();
			for(int i =1;i<3;i++){
				msg.addElement(rs.getObject(i));
			}
			vc.addElement(msg);
		}
	} catch (SQLException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
    
    return vc;
    
}	

public void updateVendor(String Vphone,String Vaddress,String Vpostcode,String Vdescription,String Vname){
	
    try {
    	Class.forName(Driver);
		conn = (Connection) DriverManager.getConnection(url,user,pd);
		String sql = "update vendor  set Vphone= ? ,Vaddress= ? ,Vpostcode= ?,Vdescription = ? where Vname=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1,Vphone);
		ps.setString(2,Vaddress);
		ps.setString(3, Vpostcode);
		ps.setString(4, Vdescription);	
		ps.setString(5, Vname);
		ps.execute();
		
	} catch (SQLException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
     
}

public void addVendor(String Vphone,String Vaddress,String Vpostcode,String Vdescription,String Vname){
	
    try {
    	Class.forName(Driver);
		conn = (Connection) DriverManager.getConnection(url,user,pd);
		String sql = "insert into vendor(Vname,Vphone,Vaddress,Vpostcode,Vdescription,Btime) values(?,?,?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, Vname);
		ps.setString(2,Vphone);
		ps.setString(3,Vaddress);
		ps.setString(4, Vpostcode);
		ps.setString(5, Vdescription);
		ps.setObject(6, new java.sql.Date(System.currentTimeMillis()));
		ps.execute();
		
	} catch (SQLException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
     
}

public void addMtype(String Typename){
	
    try {
    	Class.forName(Driver);
		conn = (Connection) DriverManager.getConnection(url,user,pd);
		String sql = "insert into mtype(Typename) values(?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, Typename);
		ps.execute();
		
	} catch (SQLException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
     
}

public void deleteMtype(String Typename){
	
    try {
    	Class.forName(Driver);
		conn = (Connection) DriverManager.getConnection(url,user,pd);
		String sql = "delete from mtype where Typename=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1,Typename);
		ps.execute();
		
	} catch (SQLException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
     
}

public void deleteVendor(String Vname){
	
    try {
    	Class.forName(Driver);
		conn = (Connection) DriverManager.getConnection(url,user,pd);
		String sql = "delete from vendor where Vname=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1,Vname);
		ps.execute();
		
	} catch (SQLException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
     
}
public void addmtype(String tName,short BID){
	
    try {
    	Class.forName(Driver);
		conn = (Connection) DriverManager.getConnection(url,user,pd);
		String sql = "insert mtype(Typename,BID)  values(?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1,tName);
		ps.setObject(2,BID);
		ps.execute();
		
	} catch (SQLException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
     
}

public void deletemtype(String tName){
	
    try {
    	Class.forName(Driver);
		conn = (Connection) DriverManager.getConnection(url,user,pd);
		String sql = "delete from mtype where Typename=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1,tName);
		ps.execute();
		
	} catch (SQLException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
     
}

public void deleteorder(String tName){
	
    try {
    	Class.forName(Driver);
		conn = (Connection) DriverManager.getConnection(url,user,pd);
		String sql = "delete from ord where UID=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1,tName);
		ps.execute();
		
	} catch (SQLException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
     
}
public void updatemtype(String tName,short tTID){
	
    try {
    	Class.forName(Driver);
		conn = (Connection) DriverManager.getConnection(url,user,pd);
		String sql = "update mtype  set Typename= ? where TID=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1,tName);
		ps.setObject(2,tTID);
		ps.execute();
		
	} catch (SQLException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
     
}

public void addorder(String num,String sum){
	
    try {
    	Class.forName(Driver);
		conn = (Connection) DriverManager.getConnection(url,user,pd);
		String sql = "insert into ord(Mnum,Osum,ptime) values(?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1,num);
		ps.setString(2,sum);
		ps.setObject(3, new java.sql.Date(System.currentTimeMillis()));
		ps.execute();
		
	} catch (SQLException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
     
}

	public static void main(String[] args){
		
	}

	
}
