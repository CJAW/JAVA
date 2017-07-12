package com.jdbc.statement.demo;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.jdbc.Connection;
/**
 * 测试Blob,处理较大的数据。
 * 
 * @author user
 *
 */

public class TestBlob {

	public static void main(String[] args){
		try {
			
			//加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			
			//链接数据库
			Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/land","root","");
			
			//SQL语句
			String sql = "insert into up(id,pw,time,text) values(?,?,?,?)";

			//准备SQL语句
			PreparedStatement ps = conn.prepareStatement(sql);
			
			//给占位符赋值
			ps.setInt(1,3);   
			
			ps.setInt(2, 12345678);
			
			ps.setObject(3, new java.sql.Date(System.currentTimeMillis()));
			
			ps.setClob(4,new BufferedReader(new InputStreamReader(new ByteArrayInputStream("aaaaaade".getBytes()))));
			//执行
			ps.execute();
			
			Thread.sleep(5000);
			
			String sql1 = "select * from up";
			
			PreparedStatement ps1 = conn.prepareStatement(sql1);
			
			//执行返回结果集
			ResultSet rs = ps1.executeQuery();
			
			while(rs.next()){
				
				int len = 0;  //接收容器
				
				Blob c = rs.getBlob(4);
				
				InputStream r = c.getBinaryStream();
				
				OutputStream ot = new BufferedOutputStream(new FileOutputStream(new File("")));  //输出到固定的文件
				
				while(-1!=(len = r.read())){
					
					//System.out.print(len);
					//ot.write(len);
	
				}
			}
			
			ps.close();
			conn.close();
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
