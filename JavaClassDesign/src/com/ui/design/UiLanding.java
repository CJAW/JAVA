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
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.sql.util.DatabaseConnection;

public class UiLanding extends Frame{

	private static final int Width =400;
	private static final int Height = 400;
	static UiLanding  ui = new UiLanding();
	
	Panel p1;
	Panel p2;
	Panel p3;
	Label l1;
	Label l2;
	TextField userID;
	TextField ps;
	Button submit;
	Button clear;
	Button zhuce;
	List<String>list;
	DatabaseConnection data;
	static boolean setvisuable = true;
	
	public UiLanding(){
	
	    setLayout(new GridLayout(3, 1));
	    setTitle("商场用户登陆系统");
	    
	    l1 = new Label("用户名:");
	    userID = new TextField(20);
	    p1 = new Panel();
	    p1.add(l1);
	    p1.add(userID);
	    add(p1);
	    
	    
	    l2 = new Label("密码:");
	    ps = new TextField(20);
	    ps.setEchoChar('*'); //密码的输入显示格式
	    p2 = new Panel();
	    p2.add(l2);
	    p2.add(ps);
	    add(p2);
	    
	 
	    submit = new Button("提交");
	    clear = new Button("重置");
	    zhuce = new Button("注册");
	    p3= new Panel();
	    p3.add(submit);
	    p3.add(clear);
	    p3.add(zhuce);
	    add(p3);
	    
	   /**
	    *  单击事件
	    */
	    submit.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e) { 
			data = new DatabaseConnection();
			list = new ArrayList<String>();
		    list = data.selectIdPw(userID.getText(),ps.getText());
		    
		    if((userID.getText().equals(""))){
		    	JOptionPane.showMessageDialog(null,"用户名为空");
		    }
		    if((userID.getText().equals(""))){
		    	JOptionPane.showMessageDialog(null,"密码为空");
		    }
		    
		    if(!(userID.getText().equals(list.get(0)))){
		    	JOptionPane.showMessageDialog(null,"账号错误");
		    }
		    
		    if(!(ps.getText().equals(list.get(1)))){
		    	JOptionPane.showMessageDialog(null,"密码错误");
		    }
		    
		    if((list.get(0)).equals(userID.getText())&&list.get(1).equals(ps.getText())){
		    	ui.dispose();
		    	UiManage n=new UiManage();
		    	n.setVisible(false);
		    }

		}
	  });
	    zhuce.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
			 ui.dispose();
			 Regist r= new Regist();
			 r.setVisible(true);
			 r.setSize(Width, Height);
				
			}
	    	
	    });
	    
	    clear.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				userID.setText(" ");
	    		ps.setText("");
			}	    	
	    });
	     
	    /**
	     * 关闭窗口
	     */
	    addWindowListener(new WindowAdapter(){
	    	public void windowClosing(WindowEvent e){
	    		dispose();
	    	}
	    });
	    
	}
	public static void main(String[] args){
		
	   	
		ui.setSize(Width ,Height);
		ui.setLocation(400,400);
		ui.setVisible(true);
		
	}
}
