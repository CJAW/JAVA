package lab11;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

/**   
* 项目名称：lab11   
* 类名称：LoginFrame   
* 类描述：用户登录界面   
* 创建人：潘正军  
* 创建时间：2013-11-11 上午9:41:37   
* 修改人：Administrator   
* 修改时间：2013-11-11 上午9:41:37   
* 修改备注：   
* @version 1.0.0   
*
 */
 

public class LoginFrame extends Frame {
	Label lb1,lb2;//定义2个label
	TextField userId,password;//定义2输入文本
	Button submit,reset;//定义2个按钮
	
	public LoginFrame() {//构造器
		super("用户登录窗口");//设置标题
		setLayout(new GridLayout(3, 1));//设置网格布局管理器，3行1列
		Panel p1=new Panel();//定义第一个panel
		lb1=new Label("用户名：");
		userId = new TextField(12);//用户名文本输入框
		p1.add(lb1);//添加到p1中
		p1.add(userId);
		
		Panel p2=new Panel();//定义第二个panel
		lb2 = new Label("密码：");
		password = new TextField(12);//密码文本输入框
		password.setEchoChar('*');//设置密码显示格式
		p2.add(lb2);//添加到p2中
		p2.add(password);
		
		Panel p3=new Panel();//定义第三个panel
		submit = new Button("提交");
		reset = new Button("重置");
		p3.add(submit);//添加到p3中
		p3.add(reset);
		
		add(p1);//把三个panel添加到Frame中
		add(p2);
		add(p3);
		pack();//设置自适应
//		setSize(300, 200);
		setVisible(true);//设置可见
	}
	public static void main(String[] args) {
		LoginFrame lf=new LoginFrame();//生成LoginFrame对象
	}
}
