/**
 * 
 */
package lab11;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

/**    
* 项目名称：lab11   
* 类名称：DictionaryGui   
* 类描述：英汉小词典界面   
* 创建人：潘正军  
* 创建时间：2013-11-11 上午9:39:57   
* 修改人：Administrator   
* 修改时间：2013-11-11 上午9:39:57   
* 修改备注：   
* @version 1.0.0   
*
 */

public class DictionaryGui {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Frame f=new Frame();//创建窗口
		f.setTitle("英汉小词典");
		f.setFont(new Font("宋体",Font.PLAIN,15));
		f.setForeground(Color.blue);
		f.setBackground(Color.lightGray);
		
		Panel p=new Panel();//创建面板
		Label lb=new Label("输入单词：");
		TextField tf=new TextField(20);
		Button bt1=new Button("查询");
		Button bt2=new Button("前一单词");
		Button bt3=new Button("后一单词");
		p.add(lb);
		p.add(tf);
		p.add(bt1);
		p.add(bt2);
		p.add(bt3);
		f.add(p,"North");
		
		TextArea ta=new TextArea();//创建文本域
		ta.setEnabled(false);
		ta.setVisible(true);
		f.add(ta,"Center");
		f.pack();
		f.setSize(500, 250);
		f.setVisible(true);
	}
}
