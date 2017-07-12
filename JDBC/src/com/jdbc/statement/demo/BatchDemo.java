package com.jdbc.statement.demo;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
/**
 * 测试Batch
 * 大批量的处理数据
 * @author user
 *
 */

public class BatchDemo {

	
	public static void main(String[] args) throws SQLException{
		
		
		try {
			//加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			
			//链接数据库
			Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/land","root","");
			//SQL语句
			Statement stat = (Statement) conn.createStatement();
			
			conn.setAutoCommit(false);
			
			for(int i=0;i<30;i++){
			String sql = "insert into up(id,pw,time) values('4"+i+"',1111,now())";
			stat.addBatch(sql); 
			}
			
			//执行
			stat.executeBatch();
			
			conn.commit();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}
