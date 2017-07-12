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

public class DeleteOrder extends Frame{

	static DeleteOrder dos = new DeleteOrder();
	public DeleteOrder(){
		
		final Frame f = new Frame();
		f.setLayout(new GridLayout(3, 1));
				
		Panel p2 = new Panel();
		Label typeName = new Label("订单编号：");
		final TextField tName = new TextField(20);
		p2.add(typeName);
		p2.add(tName);
		f.add(p2);
		
		Panel p3 = new Panel();
		Button submit = new Button("确认");
		Button cancel = new Button("取消");
		Button returns = new Button("返回");
		p3.add(submit);
		p3.add(cancel);
		p3.add(returns);
		f.add(p3);
		
		submit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(tName.getText().equals("")){
					JOptionPane.showMessageDialog(null,"订单编号为空");
				}
				DatabaseConnection n = new DatabaseConnection();
				n.deleteorder(tName.getText());
				JOptionPane.showMessageDialog(null,"删除成功");
			}
			
		});
		
		cancel.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				tName.setText(" ");
				
			}
		});
		
		returns.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				f.dispose();
				try {
					Thread.sleep(1000);
					UiManage n = new UiManage();
					n.setVisible(false);
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
		dos.dispose();
	}
}

