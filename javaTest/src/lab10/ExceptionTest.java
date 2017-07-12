package lab10;
/**   
* 项目名称：lab10   
* 类名称：ExceptionTest   
* 类描述： 异常测试  
* 创建人：潘正军  
* 创建时间：2013-11-3 下午4:39:30   
* 修改人：Administrator   
* 修改时间：2013-11-3 下午4:39:30   
* 修改备注：   
* @version 1.0.0   
*
 */
public class ExceptionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			int x=86;
			int y= (int) Math.sqrt(Integer.parseInt(args[0]));
			int z=x/y;
			System.out.println("z="+z);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("异常简要说明:"+e.toString());
			System.out.println("异常详细说明:"+e.getMessage());
			System.out.println("异常发生位置:"+e.getStackTrace());
//			e.printStackTrace();
		}catch (NumberFormatException e) {
			System.out.println("异常简要说明:"+e.toString());
			System.out.println("异常详细说明:"+e.getMessage());
			System.out.println("异常发生位置:"+e.getStackTrace());
//			e.printStackTrace();
		}catch (ArithmeticException e) {
			System.out.println("异常简要说明:"+e.toString());
			System.out.println("异常详细说明:"+e.getMessage());
			System.out.println("异常发生位置:"+e.getStackTrace());
//			e.printStackTrace();
		}
		finally{
			System.out.println("这部分不管有没有异常，都会执行,用于程序释放资源。");
		}
	}

}
