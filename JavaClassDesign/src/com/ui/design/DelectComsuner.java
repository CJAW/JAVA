package com.ui.design;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.sql.util.DatabaseConnection;

public class DelectComsuner extends Frame{

	private static final int Width =600;
	private static final int Height = 600;
	Panel p1;
	Label titleName;
	Label userName;
	TextField textUname;
	JPanel p2;
	Panel p3;
	
	Button submit;
	Button clear;
	Button returns;
	Button delete;
	JTable msg;
	Vector<Object>columNames;
	static DelectComsuner n = new DelectComsuner();;
	public DelectComsuner() {
		setLayout(new GridLayout(10, 1));

		setTitle("删除客户信息");
		p1 = new Panel();
		titleName = new Label("删除客户信息");
		p1.add(titleName);
		add(p1);
		
		DefaultTableModel dtm = new DefaultTableModel();  //存储数据
		msg = new JTable(dtm);
		 p2 = new JPanel();
		p2.add(new JScrollPane(msg));
	    add(p2);
		
	    
		Object[] valuable={"Uname","Sex","Uage","Tname","Uaddress","Upostcode","Uphone"};
		columNames = new Vector<Object>();
		for(int i=0;i<valuable.length;i++){
			columNames.add(valuable[i]);
		}  
		p3 = new Panel();
		userName = new Label("用户名：");
		textUname= new TextField(20);
		p3.add(userName);
		p3.add(textUname);
		add(p3);
		
		p3 = new Panel();
		submit = new Button("搜索");
		clear = new Button("取消");
		returns = new Button("返回");
		delete = new Button("删除");
		p3.add(submit);
		p3.add(delete);
		p3.add(clear);
		p3.add(returns);
		add(p3);
		//单击事件
		submit.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (textUname.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "用户名不为空");
				}
					DatabaseConnection data = new DatabaseConnection();
					Vector<Object> vec = new Vector<Object>();
					vec = data.select(textUname.getText());
					dtm.setDataVector(vec, columNames);
					
					//JOptionPane.showMessageDialog(null, "删除客户成功");
			}
		});
		
		delete.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (textUname.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "用户名不为空");
				}
					DatabaseConnection datas = new DatabaseConnection();
					datas.delete(textUname.getText());
					JOptionPane.showMessageDialog(null, "删除客户成功");
					
			}
		});
		
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textUname.setText(" ");
			}

		});
		
		returns.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
			
			try {
				
				Thread.sleep(1000);
				UiManage ui = new UiManage();
				ui.setVisible(false);
				
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				n.dispose();
			}
			
		});
		
		
		/**
		 * 关闭窗口
		 */
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
				
			}
		});

	}
	
	public static void main(String[] args){
			
		n.setSize(Width ,Height);
	    n.setLocation(400,400);
	    n.setVisible(true);
	}
}
