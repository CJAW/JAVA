package com.jdbc.statement.demo;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
/**
 * 测试statement
 * @author user
 *
 */

public class TestStatement {

	
	public static void main(String[] args) throws SQLException{
		
		
		try {
			//加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			
			//链接数据库
			Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/land","root","");
			//SQL语句
			Statement stat = (Statement) conn.createStatement();
			
			String sql = "insert into up(id,pw) values(1,12345)";
			//执行

			stat.execute(sql);
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}
