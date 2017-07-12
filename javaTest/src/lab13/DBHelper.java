/**
 * 
 */
package lab13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**  
* 项目名称：lab13   
* 类名称：DBHelper   
* 类描述：数据库帮助类，把常用的数据库连接和增、删、改、查封装成一个通用的帮助类，提高效率。    
* 创建人：潘正军  
* 创建时间：2013-11-25 下午2:36:53   
* 修改人：Administrator   
* 修改时间：2013-11-25 下午2:36:53   
* 修改备注：   
* @version 1.0.0   
*
 */
public class DBHelper implements DBConfig {
private static Connection conn;//创建Connection类型的引用
private static Statement stat;//创建Statement类型的引用
private static ResultSet rs;//创建ResultSet类型的引用

public static Connection getConnection() {//获得Connection类型的对象
	try {
		Class.forName(driver);
		conn=DriverManager.getConnection(url, user, password);
		return conn;
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}catch (SQLException e) {
		e.printStackTrace();
	}
	return null;
	
}

public static Statement openStatement() {//获得Statement类型的对象
	try {
		stat=getConnection().createStatement();
		return stat;
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return null;
}
public static int update(String sql) {//完成数据的更新操作，可以进行数据的增（insert）、删(delete)、改（update）
	try {
		return openStatement().executeUpdate(sql);
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return -1;
}

public  static ResultSet query(String sql) {//完成数据的查询操作，可以进行数据的查询select
	try {
		return openStatement().executeQuery(sql);
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return null;
}
public static void close() {//释放各种资源
	if (rs!=null) {
		try {
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	if (stat!=null) {
		try {
			stat.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	if (conn!=null) {
		try {
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

}
