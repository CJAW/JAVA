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


public class UiShopManager extends Frame {
	static UiShopManager ui = new UiShopManager();
	private static final int Width =800;
	private static final int Height =600;
	Panel p1;
    JPanel p2;
	Panel p3;
	Panel p4;
	Panel p5;
    Label l;
    Label shopName;
    Label supplyName;
    Label describe;
    Label remark;
    TextField describeText;
    TextField remarkText;
    TextField shop;
    Choice name;
    Button set;
    Button clean;
    JTable msg;
    public List<String> listName;
    List<Object[]> list;
    Vector<Object> Merchandise;
    Vector<Object> columNames;
    DatabaseConnection  Smerchandise;
    String Mname;
	String Vname;
	public UiShopManager(){     
		setLayout(new GridLayout(5, 1));	
		
	
		setTitle("商品信息管理");
		p1 = new Panel();
		l = new Label("商品信息管理");
		l.setLocation(Width-100, Height-100);
		p1.add(l);
		add(p1);
		
		
		Object[] valuable={"商品编号","名称","类别","型号","价格"};
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
		shopName =  new Label("商品名称:"); 
		shop = new TextField(20);
		supplyName = new Label("供应商:");
		listName= new ArrayList<String>();	
		DatabaseConnection Svname = new DatabaseConnection();		
		listName = Svname.selectVname();
        name = new Choice();
        /*
        for(String list:listName){
        	name.add(+list);
        }
        */
        for(int i=0;i<listName.size();i++){
        	name.add(i+1+"- "+listName.get(i));
        }
		p3.add(shopName);
		p3.add(shop);
		p3.add(supplyName);
		p3.add(name);
		add(p3);
		
		p4 = new Panel();
		describe = new Label("用述:");
		describeText = new TextField(20);
		remark = new Label("备注:");
		remarkText = new TextField(20);
		p4.add(describe);
		p4.add(describeText);
		p4.add(remark);
		p4.add(remarkText);
		add(p4);
	
		
		p5 = new Panel(); 
		set = new Button("设置");
		clean = new Button("清空");
		p5.add(set);
		p5.add(clean);
		add(p5);
	  
		
		//鼠标事件
		   set.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				Mname = shop.getText();
				Vname = name.getSelectedItem().substring(3,5);
	            Smerchandise = new DatabaseConnection();
	            Merchandise = new Vector<Object>();
	            Merchandise = Smerchandise.selectMerchandise(Mname,Vname);
		        dtm.setDataVector(Merchandise,columNames );
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
