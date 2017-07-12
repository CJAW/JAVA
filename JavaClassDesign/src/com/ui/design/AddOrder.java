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

public class AddOrder extends Frame{

	public AddOrder(){
		
		final Frame f = new Frame();
		f.setLayout(new GridLayout(6, 1));
		
		Panel p1 = new Panel();
		Label name = new Label("订单编号：");
		final TextField ordername = new TextField(20);
		p1.add(name);
		p1.add(ordername);
		f.add(p1);

		Panel p2 = new Panel();
		Label num = new Label("数量：");
		final TextField textNum = new TextField(20);
		p2.add(num);
		p2.add(textNum);
		f.add(p2);
		
		Panel p3 = new Panel();
		Label sum = new Label("总数目：");
		final TextField textSum = new TextField(20);
		p3.add(sum);
		p3.add(textSum);
		f.add(p3);
		
		Panel p4 = new Panel();
		Label time = new Label("时间：");
		final TextField textTime = new TextField(20);
		p4.add(time);
		p4.add(textTime);
		f.add(p4);
	
		Panel p5 = new Panel();
		Button submit = new Button("确认");
		Button cancel = new Button("取消");
		Button returns = new Button("返回登陆");
		p5.add(submit);
		p5.add(cancel);
		p5.add(returns);
		f.add(p5);

		submit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(ordername.getText().equals("")){
					JOptionPane.showMessageDialog(null,"订单编号为空");
				}
				DatabaseConnection n = new DatabaseConnection();
				n.addorder(textNum.getText(), textSum.getText());
				JOptionPane.showMessageDialog(null,"修改成功");
			}
			
		});

		cancel.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				ordername.setText(" ");
				textNum.setText(" ");
				textSum.setText(" ");
				
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
		AddOrder ao = new AddOrder();
		ao.setVisible(false);
	}
}

