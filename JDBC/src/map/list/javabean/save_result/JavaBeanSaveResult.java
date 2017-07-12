package map.list.javabean.save_result;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;

/**
 * 使用javaBean存储结果集
 * 将结果变成一个对象
 * list存储表
 * @author user
 *
 */

public class JavaBeanSaveResult {

	public static void main(String[] args) {
		List<BeanMath> list = new ArrayList<BeanMath>();
		BeanMath b =null;
		try {

			// 加载驱动
			Class.forName("com.mysql.jdbc.Driver");

			// 链接数据库
			Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/land", "root", "");

			// SQL语句
			String sql = "select * from up2 where id>?";

			// 准备SQL语句
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, 0);

			// 给占位符赋值

			// 执行
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
			 b = new BeanMath(rs.getInt(1),rs.getString(2),rs.getInt(3));  //存储到javabean中
			 list.add(b);//存储到list中
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for(BeanMath msg:list){
		System.out.println(msg);
		}
	}
}
