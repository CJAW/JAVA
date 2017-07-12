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

public class DeleteVendor extends Frame{
  
	public DeleteVendor(){
		
		final Frame f = new Frame();
		f.setLayout(new GridLayout(3, 1));
		f.setTitle("删除供应商");
		
		Panel p1 = new Panel();
		Label name = new Label("供应商名：");
		final TextField Vname = new TextField(20);
		p1.add(name);
		p1.add(Vname);
		f.add(p1);
		
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
				if(Vname.getText().equals("")){
					JOptionPane.showMessageDialog(null,"用户名为空");
				}
				DatabaseConnection n = new DatabaseConnection();
				n.deleteVendor(Vname.getText());
				JOptionPane.showMessageDialog(null,"修改成功");
			}
			
		});
		
		cancel.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				Vname.setText(" ");
				
			}
		});
		
		returns.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				f.dispose();
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
	    DeleteVendor dv = new DeleteVendor();
		dv.dispose();
	}
}
