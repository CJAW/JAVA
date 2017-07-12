
package lab13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


/** 
* 项目名称：lab13   
* 类名称：MySqlDemo   
* 类描述：Java连接MySql数据库测试   
* 创建人：潘正军  
* 创建时间：2013-11-25 下午2:35:51   
* 修改人：Administrator   
* 修改时间：2013-11-25 下午2:35:51   
* 修改备注：   
* @version 1.0.0   
*
 */

public class SQLServerDemo {

	public static void main(String[] args) {
		//MySql数据库连接
		/*
		String url="jdbc:mysql://localhost:3306/db_mysise";//设置url
//		String url="jdbc:mysql://127.16.28.18:3306/db_mysise";//设置url
		String user="root";//数据库登录用户名
		String password="root";//数据库登录密码
		*/
		//SQLServer2005/2008数据库连接
//		String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String url="jdbc:sqlserver://172.16.168.43:1433;DatabaseName=design";
		String user="sa";
		String password="kcaj201510251025";
		Connection conn=null;//声明Connection对象
		Statement stat=null;//声明Statement对象
		try {
//			Class.forName("com.mysql.jdbc.Driver");//加载MySql驱动
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");//加载SQLServer驱动
//			System.out.println("加载驱动成功！");
			conn=DriverManager.getConnection(url, user, password);//创建连接
			stat=conn.createStatement();//通过Connection对象创建Statement对象
			String sql="select * from brand";//创建查询字符串对象语句，即增、删、改、查等
			ResultSet rs=stat.executeQuery(sql);//使用Statement对象执行查询字符串获得结果集
			while(rs.next()){
				System.out.println(rs.getObject(1));
			}
			
			
			
			rs.close();//释放资源
			stat.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
