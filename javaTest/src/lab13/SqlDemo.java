package lab13;

import java.sql.CallableStatement;
 
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
 

/**
 * 项目名称：lab13 类名称：SqlDemo 类描述：sql测试主类，使用DBHelper类进行数据的增删改查 创建人：潘正军
 * 创建时间：2013-11-25 下午2:37:11 修改人：Administrator 修改时间：2013-11-25 下午2:37:11 修改备注：
 * 
 * @version 1.0.0
 * 
 */
public class SqlDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws SQLException {
		// 查询出所有李姓同学所学专业
	 
		  String sql="select * from student where 姓名 like '李%'";//创建sql语句
		  ResultSet rs= DBHelper.query(sql);//使用DBHelper获得查询结果集 
		  while(rs.next()) {//遍历结果集
		  System.out.println(rs.getString("姓名")+"的专业是："+ rs.getString("专业")); }
		 

		  
		DBHelper.close();// 释放资源
		// 思考题：如何统计男女生的人数？如何进行增删改？
	}

}
