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
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.sql.util.DatabaseConnection;

import java.sql.*;


public class SelectVendor extends Frame {
	static SelectVendor ui = new SelectVendor();
	private static final int Width =800;
	private static final int Height =600;
	Panel p1;
    JPanel p2;
	Panel p3;
	Panel p4;
	Panel p5;
    Label l;
    Label vidName;
    Label describe;
    Label remark;
    TextField describeText;
    TextField remarkText;
    TextField tVID;
    Choice name;
    Button select;
    Button set;
    Button clean;
    JTable msg;
    public List<String> listName;
    List<Object[]> list;
    Vector<Object> Vendor;
    Vector<Object> columNames;
    DatabaseConnection  Svendor;
    short VID;
	String Vname;
	public SelectVendor(){     
		setLayout(new GridLayout(5, 1));	
		
	
		setTitle("供应商信息查询");
		p1 = new Panel();
		l = new Label("供应商信息查询");
		l.setLocation(Width-100, Height-100);
		p1.add(l);
		add(p1);
		
		
		Object[] valuable={"供应商编号","名称","地址","邮编","电话","描述","注册时间"};
		columNames = new Vector<Object>();
		for(int i=0;i<valuable.length;i++){
			columNames.add(valuable[i]);
		}  
		final DefaultTableModel dtm = new DefaultTableModel();  //存储数据
		msg = new JTable(dtm);
		JPanel p2 = new JPanel();
		p2.add(new JScrollPane(msg));
	    add(p2);
	    
	   
		p3 = new Panel();
		vidName =  new Label("供应商编号"); 
		tVID = new TextField(20);
		p3.add(vidName);
		p3.add(tVID);
		select = new Button("查询所有供应商");
		p3.add(select);
		add(p3);
		
		p5 = new Panel(); 
		set = new Button("设置");
		clean = new Button("清空");
		p5.add(set);
		p5.add(clean);
		add(p5);
	  
		
		//鼠标事件
		   select.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
	            Svendor = new DatabaseConnection();
	            Vendor = new Vector<Object>();
	            Vendor = Svendor.selectAllVendor();
		        dtm.setDataVector(Vendor,columNames );
			}
		   }); 
		   
		   set.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				VID = Short.parseShort(tVID.getText());
	            Svendor = new DatabaseConnection();
	            Vendor = new Vector<Object>();
	            Vendor = Svendor.selectVendor(VID);
		        dtm.setDataVector(Vendor,columNames );
			}
		   }); 
		   
		
        //窗口事件
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				dispose();
				
			}
			
		});
		
	}
	
	public static void main(String[] args){
		
		ui.setSize(Width, Height);
		ui.setLocation(500, 500);
		ui.setVisible(true);
	}
}
