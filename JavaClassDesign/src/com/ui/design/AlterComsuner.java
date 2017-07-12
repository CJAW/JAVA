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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

import com.sql.util.DatabaseConnection;

public class AlterComsuner extends Frame{

	private static final int Width =600;
	private static final int Height = 600;
	Panel p1;
	Label titleName;
	Label userName;
	TextField id;
	Panel p2;
	Panel p3;
	Choice sex;
	Label ssex;
	Panel p4;
	Label age;
	TextField textage;
	Panel p5;
	Label Uname;
	TextField textUname;
	Label Tname;
	TextField textTname;
	Panel p6;
	Panel p7;
	Label Uaddress;
	TextField textUaddress;
	Panel p8;
	Label Upostcode;
	TextField textUpostcode;
	Panel p9;
	Label Uphone;
	TextField textUphone;
	Button submit;
	Button clear;
	Button returns;
	static AlterComsuner n = new AlterComsuner();;
	public AlterComsuner() {
		setLayout(new GridLayout(10, 1));

		setTitle("更改客户信息");
		p1 = new Panel();
		titleName = new Label("更改客户信息");
		p1.add(titleName);
		add(p1);
		
		p2 = new Panel();
		Uname = new Label("用户名：");
		textUname= new TextField(20);
		p2.add(Uname);
		p2.add(textUname);
		add(p2);
		
		p3 =new Panel();
		Tname = new Label("真实姓名：");
		textTname= new TextField(20);
		p3.add(Tname);
		p3.add(textTname);
		add(p3);
		
		p4 =new Panel();
		ssex = new Label("性别：");
		age = new Label("年龄：");
		sex = new Choice();
		textage = new TextField(8);
		sex.add("男");
		sex.add("女");
        p4.add(ssex);
        p4.add(sex);
        p4.add(age);
        p4.add(textage);
        add(p4);
        
        p5 =new Panel();
        Uphone = new Label("电话：");
        textUphone= new TextField(20);
		p5.add(Uphone);
		p5.add(textUphone);
		add(p5);
        
        
        p6 =new Panel();
        Upostcode = new Label("邮箱：");
        textUpostcode= new TextField(20);
		p6.add(Upostcode);
		p6.add(textUpostcode);
		add(p6);
        
		p7 =new Panel();
		Uaddress = new Label("地址：");
		textUaddress= new TextField(20);
		p7.add(Uaddress);
		p7.add(textUaddress);
		add(p7);
		
		p8 = new Panel();
		submit = new Button("确定");
		clear = new Button("取消");
		returns = new Button("返回");
		p8.add(submit);
		p8.add(clear);
		p8.add(returns);
		add(p8);
		//单击事件
		submit.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				if(textUname.getText().equals("")){
					JOptionPane.showMessageDialog(null, "用户名不为空");
				}
				Pattern p = Pattern.compile(
						"^(13[4,5,6,7,8,9]|15[0,8,9,1,7]|188|187)\\d{8}$"); // 创建正则表达式
				Matcher m = p.matcher(textUphone.getText());//匹配数据
				if (m.matches()==false) {
					JOptionPane.showMessageDialog(null, "请输入正确的电话");
					textUphone.setText("");
				}
				
				Pattern p1 = Pattern.compile(
						"^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$"); // 创建正则表达式
				Matcher m1 = p1.matcher(textUpostcode.getText());//匹配数据
				if (m1.matches()==false) {
					JOptionPane.showMessageDialog(null, "请输入正确的邮箱");
					textUpostcode.setText("");
				}
				
				DatabaseConnection data = new DatabaseConnection();
				data.updateMessage(textUname.getText(), sex.getSelectedItem(), textage.getText(),textTname.getText(), textUaddress.getText(), textUpostcode.getText(), textUphone.getText());
				JOptionPane.showMessageDialog(null, "修改成功客户成功");
			}

		});
		
		returns.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
		
			try {
				n.dispose();
				Thread.sleep(1000);
				UiManage ui = new UiManage();
				ui.setVisible(false);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				
			}
			
		});
		clear.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				textage.setText(" ");
				textUname.setText(" ");
				textUpostcode.setText(" ");
				textUaddress.setText(" ");
				textUpostcode.setText(" ");
				textUphone.setText(" ");
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
