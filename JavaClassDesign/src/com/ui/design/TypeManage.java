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


public class TypeManage extends Frame {
	
	private static final int Width =800;
	private static final int Height =600;
	Panel p1;
    JPanel p2;
	Panel p3;
	Panel p4;
	Panel p5;
    Label l;
    Label TIDName;
    Label describe;
    Label remark;
    TextField describeText;
    TextField remarkText;
    TextField tTID;
    Choice name;
    Button select;
    Button add;
    Button alter;
    Button delete;
    Button set;
    Button clean;
    JTable msg;
    public List<String> listName;
    List<Object[]> list;
    Vector<Object> Mtype;
    Vector<Object> columNames;
    DatabaseConnection  Smtype;
    short TID;
	String Vname;
	static TypeManage ui = new TypeManage();
	public TypeManage(){     
		setLayout(new GridLayout(5, 1));	
		
	
		setTitle("商品类别管理");
		p1 = new Panel();
		l = new Label("商品类别信息");
		l.setLocation(Width-100, Height-100);
		p1.add(l);
		add(p1);
		
		
		Object[] valuable={"商品类别编号","商品类别名"};
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
		TIDName =  new Label("商品类别编号"); 
		tTID = new TextField(20);
		p3.add(TIDName);
		p3.add(tTID);
		select = new Button("查询所有商品类别");
		p3.add(select);
		add(p3);

		p4 = new Panel(); 
		add = new Button("添加");
		alter = new Button("修改");
		delete = new Button("删除");
		p4.add(add);
		p4.add(alter);
		p4.add(delete);
		add(p4);		
		
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
	            Smtype = new DatabaseConnection();
	            Mtype = new Vector<Object>();
	            Mtype = Smtype.selectAllMtype();
		        dtm.setDataVector(Mtype,columNames );
			}
		   });
		   
		   add.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e) {
					ui.dispose();
		            AddType a = new AddType();
		            a.setVisible(false);
		         
				}
			   });
		   
		   alter.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
				    ui.dispose();
		            AlterType ay = new AlterType();
		            ay.setVisible(false);
		            
				}
			   });
		   
		   delete.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
				    ui.dispose();
		            DeleteType ay = new DeleteType();
		            ay.setVisible(false);
		          
				}
			   });
		   
		   
		   set.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				TID = Short.parseShort(tTID.getText());
	            Smtype = new DatabaseConnection();
	            Mtype = new Vector<Object>();
	            Mtype = Smtype.selectMtype(TID);
		        dtm.setDataVector(Mtype,columNames );
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
