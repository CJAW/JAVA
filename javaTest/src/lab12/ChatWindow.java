/**
 * 
 */
package lab12;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**    
* 项目名称：lab12   
* 类名称：ChatWindow   
* 类描述： 模拟简易聊天室  
* 创建人：潘正军  
* 创建时间：2013-11-17 下午6:40:29   
* 修改人：Administrator   
* 修改时间：2013-11-17 下午6:40:29   
* 修改备注：   
* @version 1.0.0   
*
 */
public class ChatWindow extends Frame implements ActionListener {

	Label lb;
	TextField message;
	TextArea displayMessage;
	Button submit,reset;
	
	public ChatWindow(String title) {
		super(title);
		Panel p1=new Panel();
		lb=new Label("请输入一行文字：");
		message=new TextField(30);
		message.addActionListener(this);
		p1.add(lb);
		p1.add(message);
		
		displayMessage=new TextArea();
		displayMessage.setEditable(false);
		
		Panel p2=new Panel();
		submit=new Button("发送");
		reset=new Button("重置");
		submit.addActionListener(this);
		reset.addActionListener(this);
		p2.add(submit);
		p2.add(reset);
		
		this.add(p1, "North");
		this.add(displayMessage,"Center");
		add(p2,"South");
		pack();
		setVisible(true);	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj=e.getSource();
		if (obj instanceof TextField) {
			displayMessage.append("用户"+message.getText()+"\n");
			message.setText("");
		}
		if (obj instanceof Button) {
			if (e.getActionCommand().equals("发送")) {
				displayMessage.append("用户"+message.getText()+"\n");
				message.setText("");
			}
			if (reset==(Button)obj) {
				displayMessage.setText("");
				message.setText("");
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ChatWindow cw=new ChatWindow("模拟聊天窗口");
		cw.addWindowListener(new WindowAdapter() {
			/* (non-Javadoc)
			 * @see java.awt.event.WindowAdapter#windowClosing(java.awt.event.WindowEvent)
			 */
			@Override
			public void windowClosing(WindowEvent e) {
//				cw.dispose();
				System.exit(0);
			}
		});
	}
}
