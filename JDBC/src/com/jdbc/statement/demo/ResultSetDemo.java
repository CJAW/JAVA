package com.jdbc.statement.demo;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
/**
 * 测试ResultSet
 * 可以处理返回的结构集
 * @author user
 *
 */

public class ResultSetDemo {

	public static void main(String[] args){
		try {
			
			//加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			
			//链接数据库
			Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/land","root","");
			
			//SQL语句
			String sql = "select *from up where id>?";

			//准备SQL语句
			PreparedStatement ps = conn.prepareStatement(sql);
			
			//给占位符赋值
			ps.setInt(1,0);   
			
			//执行,返回结果集
			ResultSet rs= ps.executeQuery();
			
			while(rs.next()){
				System.out.println(rs.getInt(1)+"    "+rs.getInt(2)+"    "+rs.getInt(3));
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
