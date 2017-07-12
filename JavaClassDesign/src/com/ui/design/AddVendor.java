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

public class AddVendor extends Frame{
	public AddVendor(){
		
		final Frame f = new Frame();
		f.setLayout(new GridLayout(6, 1));
		f.setTitle("增加供应商信息");
		
		Panel p1 = new Panel();
		Label name = new Label("供应商名：");
		final TextField Vname = new TextField(20);
		p1.add(name);
		p1.add(Vname);
		f.add(p1);

		Panel p2 = new Panel();
		Label phone = new Label("电话：");
		final TextField Vphone = new TextField(20);
		p2.add(phone);
		p2.add(Vphone);
		f.add(p2);
		
		Panel p3 = new Panel();
		Label address = new Label("地址：");
		final TextField Vaddress = new TextField(20);
		p3.add(address);
		p3.add(Vaddress);
		f.add(p3);
		
		Panel p4 = new Panel();
		Label postcode = new Label("邮编：");
		final TextField Vpostcode = new TextField(20);
		p4.add(postcode);
		p4.add(Vpostcode);
		f.add(p4);

		Panel p5 = new Panel();
		Label description = new Label("描述：");
		final TextField Vdescription = new TextField(20);
		p5.add(description);
		p5.add(Vdescription);
		f.add(p5);
	
		Panel p6 = new Panel();
		Button submit = new Button("确认");
		Button cancel = new Button("取消");
		Button returns = new Button("返回");
		p6.add(submit);
		p6.add(cancel);
		p6.add(returns);
		f.add(p6);

		submit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(Vname.getText().equals("")){
					JOptionPane.showMessageDialog(null,"客户名为空");
				}
				DatabaseConnection n = new DatabaseConnection();
				n.addVendor(Vphone.getText(), Vaddress.getText(),Vpostcode.getText(),Vdescription.getText(),Vname.getText());
				JOptionPane.showMessageDialog(null,"添加成功");
			}
			
		});

		cancel.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				Vname.setText(" ");
				Vphone.setText(" ");
				Vaddress.setText(" ");
				Vpostcode.setText(" ");
				Vdescription.setText(" ");
				
			}
		});
		
		returns.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				try {
				
					Thread.sleep(1000);
					UiManage n = new UiManage();
					n.setVisible(false);
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
        AddVendor av = new AddVendor();
		av.dispose();
	}
	
}

