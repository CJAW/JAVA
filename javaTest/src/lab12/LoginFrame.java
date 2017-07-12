package lab12;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

/**   
* 项目名称：lab12   
* 类名称：LoginFrame   
* 类描述： 用户登录程序设计  
* 创建人：潘正军  
* 创建时间：2013-11-17 下午6:40:53   
* 修改人：Administrator   
* 修改时间：2013-11-17 下午6:40:53   
* 修改备注：   
* @version 1.0.0   
*
 */

public class LoginFrame extends Frame implements ActionListener {

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
//		setBounds(200, 200, 300, 200);
//		setSize(300, 200);
		setVisible(true);//设置可见
		
		userId.addActionListener(this);//为用户名输入框添加监听器
		password.addActionListener(this);//为密码输入框添加监听器
		submit.addActionListener(this);//为提交按钮添加监听器
		reset.addActionListener(this);//为重置按钮添加监听器
		//为密码输入框添加键盘监听器，要求只能输入数字和退格键
		password.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if ((e.getKeyCode()<e.VK_0||e.getKeyCode()>e.VK_9)&&e.getKeyCode()!=e.VK_BACK_SPACE) {
					e.consume();
				}
			}	
		});
		//为窗口添加监听器，使关闭按钮功能可用
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj=e.getSource();//获得事件源对象
		//判断事件源对象是否为提交或者密码输入完毕
		if ((obj==submit)||(obj==password)) {
			//判断用户名和密码是否正确
			if (userId.getText().equals("admin")
					&&password.getText().equals("123456")) {
				//如果正确，创建新的弹出提示窗口
				final Frame f=new Frame("弹出新窗口");
				//设置窗体的字体、大小、可见性和窗体显示消息
				f.setFont(new Font("宋体", Font.BOLD, 32));
				Label cogr=new Label("恭喜您，登录成功！");
				f.add(cogr,"Center");
				f.setSize(300, 200);
				f.setVisible(true);
				//为弹出新窗口添加监听器，使关闭按钮功能可用
				f.addWindowListener(new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						f.setVisible(false);
						f.dispose();
//						System.exit(0);
					}
				});
			}else {//如果用户名或密码输入错误，弹出提示信息
				JOptionPane.showMessageDialog(null,"账号、密码不正确！");
			}
		}else if (obj==reset) {//处理重置事件,如果点击reset按钮，所有输入框置空
			userId.setText("");
			password.setText("");
		}else if (obj==userId) {//处理只输入用户名，未输入密码就回车确认事件
			password.requestFocusInWindow();//光标定位到密码输入框
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
     LoginFrame lf=new LoginFrame();//创建登录对象
	}

}
