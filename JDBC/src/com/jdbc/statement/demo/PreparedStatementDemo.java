package com.jdbc.statement.demo;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
/**
 * 测试prepareStatement
 * @author user
 *
 */

public class PreparedStatementDemo {

	public static void main(String[] args){
		try {
			
			//加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			
			//链接数据库
			Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/land","root","");
			
			//SQL语句
			String sql = "insert into up(id,pw,time) values(?,?,?)";

			//准备SQL语句
			PreparedStatement ps = conn.prepareStatement(sql);
			
			//给占位符赋值
			ps.setInt(1,3);   
			ps.setInt(2, 12345678);
			ps.setObject(3, new java.sql.Date(System.currentTimeMillis()));
			//执行
			ps.execute();
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
