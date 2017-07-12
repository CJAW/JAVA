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

public class OrderMessageManager extends Frame{
	private static final int Width =800;
	private static final int Height =600;
	Panel p1;
    JPanel p2;
	Panel p3;
	Panel p4;
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
    Button returns;
    List<String> listName;
    List<Object[]> list;
    Vector<Object> data;
    Vector<Object> columNames;
    static OrderMessageManager ui = new OrderMessageManager();
    DatabaseConnection  select;
	public OrderMessageManager(){     
		setLayout(new GridLayout(5, 1));	
		
	
		setTitle("订单信息管理查询");
		p1 = new Panel();
		l = new Label("商品信息管理查询");	
		l.setLocation(Width-100, Height-100);
		p1.add(l);
		add(p1);
		
		
		Object[] valuable={"商品编号","名称","数量","价钱","交易时间"};
		columNames = new Vector<Object>();
		for(int i=0;i<valuable.length;i++){
			columNames.add(valuable[i]);
		}  
		DefaultTableModel dtm = new DefaultTableModel();  //存储数据
		msg = new JTable(dtm);
		JPanel p2 = new JPanel();
		p2.add(new JScrollPane(msg));
	    add(p2);
	    
	   
		p3 = new Panel();
		shopName =  new Label("订单编号:"); 
		shop = new TextField(20);
		supplyName = new Label("订单人:");
        name = new Choice();
        /*
        for(String list:listName){
        	name.add(+list);
        }
        */
        name.add("客户");
        name.add("用户");
		p3.add(shopName);
		p3.add(shop);
		p3.add(supplyName);
		p3.add(name);
		add(p3);
		
	
		p4 = new Panel(); 
		set = new Button("设置");
		clean = new Button("清空");
		returns = new Button("返回");
		p4.add(set);
		p4.add(clean);
		p4.add(returns);
		add(p4);
	  
		// 鼠标事件
		set.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				select = new DatabaseConnection();
				data = new Vector<Object>();
				 data = select.selectOrderMessages(shop.getText());
				dtm.setDataVector(data, columNames);
			}
		});
		   
		
      
		
		returns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ui.dispose();
				try {
					Thread.sleep(1000);
					UiManage n = new UiManage();
					n.setVisible(false);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}

		});
		
		
		clean.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				shop.setText(" ");
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
