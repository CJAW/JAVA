package com.jdbc.statement.demo;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
/**
 * 测试rollback (回滚)
 * 所有事务一起完成或一起失败
 * @author user
 *
 */

public class TestRollback {

	public static void main(String[] args){
		try {
			
			//加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			
			//链接数据库
			Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/land","root","");
			
			conn.setAutoCommit(false);
			//SQL语句
			String sql1 = "insert into up(id,pw,time) values(?,?,?)";

			//准备SQL语句
			PreparedStatement ps = conn.prepareStatement(sql1);
			
			//给占位符赋值
			ps.setInt(1,3);   
			ps.setInt(2, 12345678);
			ps.setObject(3, new java.sql.Date(System.currentTimeMillis()));
			ps.execute();
			System.out.println("插入一个数");
			
			Thread.sleep(5000);
			
			//SQL语句
			String sql = "insert into up(id,pw,time) values(?,?)"; //错误的语句，用于测试

			//准备SQL语句
			PreparedStatement ps2 = conn.prepareStatement(sql);
			
			//给占位符赋值
			ps2.setInt(1,5);   
			ps2.setInt(2, 78);
			ps2.setObject(3, new java.sql.Date(System.currentTimeMillis()));
			//执行
			ps2.execute();
			
			conn.commit();
			
			conn.rollback(); //正确就执行，错误就回滚到最原始的位置
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
