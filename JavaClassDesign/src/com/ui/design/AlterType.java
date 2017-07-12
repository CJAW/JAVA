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

public class AlterType extends Frame{

	static AlterType at= new AlterType();
	public AlterType(){
		
		final Frame f = new Frame();
		f.setLayout(new GridLayout(3, 1));
		
		Panel p1 = new Panel();
		Label tid = new Label("商品类别编号：");
		final TextField tTID = new TextField(20);
		p1.add(tid);
		p1.add(tTID);
		f.add(p1);
		
		Panel p2 = new Panel();
		Label typeName = new Label("商品类别名：");
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
				if(tTID.getText().equals("")){
					JOptionPane.showMessageDialog(null,"商品类别编号为空");
				}
				if(tName.getText().equals("")){
					JOptionPane.showMessageDialog(null,"商品类别名称为空");
				}
				short ttid;
				ttid = Short.parseShort(tTID.getText());
				DatabaseConnection n = new DatabaseConnection();
				n.updatemtype(tName.getText(), ttid);
				JOptionPane.showMessageDialog(null,"修改成功");
			}
			
		});
		
		cancel.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				tTID.setText(" ");
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
		at.setVisible(false);;
	}
}
