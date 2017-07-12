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
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.sql.util.DatabaseConnection;

public class SelectAllComsuner extends Frame{
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
	JTable msg;
	 Vector<Object>columNames;
	static SelectAllComsuner n = new SelectAllComsuner();
	public SelectAllComsuner() {
		setLayout(new GridLayout(3, 1));

		setTitle("搜索所有客户信息");
		p1 = new Panel();
		titleName = new Label("搜索所有客户信息");
		p1.add(titleName);
		add(p1);
		
		DefaultTableModel dtm = new DefaultTableModel();  //存储数据
		msg = new JTable(dtm);
		msg.setBounds(500, 500, 500, 600);
		 p2 = new JPanel();
		p2.add(new JScrollPane(msg));
	    add(p2);
		
	    
		Object[] valuable={"Uname","Sex","Uage","Tname","Uaddress","Upostcode","Uphone"};
		columNames = new Vector<Object>();
		for(int i=0;i<valuable.length;i++){
			columNames.add(valuable[i]);
		}  
		p3 = new Panel();
		submit = new Button("搜索所有客户");
		clear = new Button("取消");
		returns = new Button("返回");
		p3.add(submit);
		p3.add(clear);
		p3.add(returns);
		add(p3);
		//单击事件
		submit.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

					DatabaseConnection data = new DatabaseConnection();
					Vector<Object> vec = new Vector<Object>();
					vec = data.select();
					dtm.setDataVector(vec, columNames);
			}
		});
		
		
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}

		});
		returns.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
			n.dispose();
			try {
				Thread.sleep(1000);
				UiManage ui = new UiManage();
				ui.setVisible(false);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				
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
