/**
 * 
 */
package lab13;

/**
 * 项目名称：lab13 类名称：DBConfig 接口描述：数据库配置接口 创建人：潘正军 创建时间：2013-11-25 下午2:36:16
 * 修改人：Administrator 修改时间：2013-11-25 下午2:36:16 修改备注：
 * 
 * @version 1.0.0
 * 
 */
public interface DBConfig {
	// MySql数据库配置
	String driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost/student";
	String user = "root";
	String password = "";

	// SqlServer ，请参考大课课件完成
/*
    String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	String url = "jdbc:sqlserver://172.16.28.155:1433;DatabaseName=BCIMS";
	String user = "sa";
	String password = "123456"; 
*/
}
