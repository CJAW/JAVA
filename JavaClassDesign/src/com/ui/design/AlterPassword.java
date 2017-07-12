package com.ui.design;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

import com.sql.util.DatabaseConnection;

public class AlterPassword extends Frame{
	static AlterPassword ap = new AlterPassword();
	public AlterPassword(){
		
		final Frame f = new Frame();
		f.setLayout(new GridLayout(3, 1));
		
		Panel p1 = new Panel();
		Label name = new Label("用户名：");
		final TextField tname = new TextField(20);
		p1.add(name);
		p1.add(tname);
		f.add(p1);
		
		Panel p2 = new Panel();
		Label password = new Label("新密码：");
		final TextField pw = new TextField(20);
		p2.add(password);
		p2.add(pw);
		f.add(p2);
		
		Panel p3 = new Panel();
		Button submit = new Button("确认");
		Button cancel = new Button("取消");
		Button returns = new Button("返回登陆");
		p3.add(submit);
		p3.add(cancel);
		p3.add(returns);
		f.add(p3);
		
		submit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(tname.getText().equals("")){
					JOptionPane.showMessageDialog(null,"用户名为空");
				}
				if(pw.getText().equals("")){
					JOptionPane.showMessageDialog(null,"密码为空");
				}
				DatabaseConnection n = new DatabaseConnection();
				n.update(pw.getText(), tname.getText());
				JOptionPane.showMessageDialog(null,"修改成功");
			}
			
		});
		
		cancel.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				tname.setText(" ");
				pw.setText(" ");
				
			}
		});
		
		returns.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				f.dispose();
				try {
					Thread.sleep(1000);
					UiLanding n = new UiLanding();
					n.setVisible(true);
					n.setSize(600, 600);
					n.setLocation(400, 100);
				} catch (InterruptedException e1) {
					
					e1.printStackTrace();
				}
				
				
			}
		});
		   f.addWindowListener(new WindowAdapter(){
		    	public void windowClosing(WindowEvent e){
		    		f.dispose();
		    	}
		    });
		    
		f.setSize(600, 600);
		f.setVisible(true);
		f.setLocation(400, 100);
		
	}
	
	public static void main(String[] args){
		ap.setVisible(false);
	}
}
