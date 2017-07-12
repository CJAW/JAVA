package map.list.javabean.save_result;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mysql.jdbc.Connection;

/**
 * 使用list存储结果集
 * 
 * List存表，map存数据
 * @author user
 *
 */

public class MapSaveResult {

	public static void main(String[] args) {
		List<Map<String,String>> list = new ArrayList<Map<String,String>>();
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

				Map<String,String> map = new HashMap<String,String>();
				
				map.put("id", rs.getString(1));
				map.put("pw", rs.getString(2));
				map.put("time", rs.getString(3));

				list.add(map);//存储到list中

			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (Map msg : list) {
        System.out.println(msg);
		}
	}
}
