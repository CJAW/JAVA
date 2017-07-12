package lab12;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**   
* 项目名称：lab12   
* 类名称：ActionEventFrame   
* 类描述：ActionEvent事件处理   
* 创建人：潘正军  
* 创建时间：2013-11-17 下午6:41:13   
* 修改人：Administrator   
* 修改时间：2013-11-17 下午6:41:13   
* 修改备注：   
* @version 1.0.0   
*
 */

public class ActionEventFrame extends Frame implements ActionListener{
	Button bt1,bt2,bt3;//创建三个按钮对象
	Label lab;
	Label lab1;
	public ActionEventFrame() {
		Panel p=new Panel();//创建一个面板
		bt1=new Button("红色");//创建按钮
		bt2=new Button("绿色");
		bt3=new Button("蓝色");
		lab =new Label("鼠标坐标：");
		 lab1= new Label();
		p.add(bt1);//把按钮添加到面板中
		p.add(bt2);
		p.add(bt3);
		p.add(lab);
		p.add(lab1);
		this.add(p, "North");//把面板添加到Frame中
		bt1.addActionListener(this);//为按钮添加监听器
		bt2.addActionListener(this);
		bt3.addActionListener(this);
		addMouseMotionListener(new MouseMotionListener(){

			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseMoved(MouseEvent e) {
				lab1.setText("x:"+e.getX()+"   "+"y:"+e.getY());
				
			}
			
		}
				);
		
		
	}

	public void paint(Graphics g){
		
	}
	
		
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		String lbName=arg0.getActionCommand();//获得按钮标签文本
//		System.out.println("事件源对象是："+arg0.getSource());//获得事件源对象
//		if (arg0.getSource()==bt1) {//根据不同的事件源进行相应的状态和行为改变
//		下面两句话的作用一样	
//		System.out.println("I know"+bt1.getLabel());
//		System.out.println("I know"+bt1.getActionCommand());
//		}
		if (lbName.equals("红色")) {//根据不同的事件修改颜色状态
			setBackground(Color.red);
		}else if (lbName.equals("绿色")) {
			setBackground(Color.green);
		}else if (lbName.equals("蓝色")) {
			setBackground(Color.blue);
		}
		
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ActionEventFrame aef=new ActionEventFrame();//创建对象
		aef.setTitle("ActionEvent事件监听器");//设置标题、大小、可见性
		aef.setSize(700, 200);
		aef.setVisible(true);
		//为窗口添加window适配器对象，使关闭按钮可用
		aef.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}


}

	

	
	

