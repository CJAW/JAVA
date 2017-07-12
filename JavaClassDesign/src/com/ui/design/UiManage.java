package com.ui.design;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JToolBar;

public class UiManage extends Frame {
	
	private static final int Width =400;
	private static final int Height = 400;
	static UiManage ui=new UiManage();
	public UiManage(){
	
	 Frame f = new Frame("网上商城信息管理系统");	
	 
	 MenuBar mb = new MenuBar();
	 
	 Menu m1= new Menu("系统管理");
	 MenuItem mt1 = new MenuItem("修改密码") ;
	 MenuItem mt2 = new MenuItem("退出系统");
	 m1.add(mt1);
	 m1.add(mt2);
	 
	 Menu m2= new Menu("客户信息管理");
	 Menu ec = new Menu("查询客户");  //子菜单
	 MenuItem mt3 = new MenuItem("增加客户");
	 MenuItem mt4 = new MenuItem("修改客户");
	 MenuItem mt5 = new MenuItem("删除客户");
	 MenuItem ec1 = new MenuItem("查询所有客户");
	 MenuItem ec2 = new MenuItem("按编号查询所有客户");
	 //添加到子菜单
	 ec.add(ec1);
	 ec.add(ec2);
	 //添加到菜单
	 m2.add(mt3);
	 m2.add(mt4);
	 m2.add(mt5);
	 m2.add(ec);
	 
	 Menu m3= new Menu("供应商信息管理");
	 Menu ecc = new Menu("查询供应商信息");//子菜单
	 MenuItem mt7 = new MenuItem("供应商信息增加");
	 MenuItem mt8 = new MenuItem("供应商信息修改");
	 MenuItem mt9 = new MenuItem("供应商信息删除");
	 MenuItem ecc1 = new MenuItem("查询所有供应商");
	 MenuItem ecc2 = new MenuItem("按编号查询所有供应商");
	 //添加到子菜单
	 ecc.add(ecc1);
	 ecc.add(ecc2);
	 //添加到菜单
	 m3.add(mt7);
	 m3.add(mt8);
	 m3.add(mt9);
	 m3.add(ecc);

	 Menu m4= new Menu("商品信息管理");
	 MenuItem mt11 = new MenuItem("商品类别管理");
	 MenuItem mt12 = new MenuItem("商品信息查询");
	 m4.add(mt11);
	 m4.add(mt12);
	
	 Menu m5= new Menu("订单信息管理");
	 MenuItem mt13 = new MenuItem("订单管理");
	 MenuItem mt14 = new MenuItem("订单信息管理查询");
	 m5.add(mt13);
	 m5.add(mt14);
	 mb.add(m5);
	 
	 //添加到menubar中 
	 mb.add(m1);
	 mb.add(m2);
	 mb.add(m3);
	 mb.add(m4);
	 mb.add(m5);
	 //加入到Frame中
	 f.setMenuBar(mb);
	 
	 f.setSize(Width, Height);
	 f.setLocation(500, 400); 
	 f.setVisible(true);
	
	 mt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Thread.sleep(1000);
					AlterPassword ap = new AlterPassword();
			        ap.setVisible(false);
				} catch (InterruptedException e1) {
					
					e1.printStackTrace();
				}
			}
		});
	 mt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.dispose();
			}

		});
	 mt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Thread.sleep(1000);
					AddComsuner ac	= new AddComsuner();
			        ac.setVisible(true);
			        ac.setSize(Width, Height);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			       
			}

		});
	 mt4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Thread.sleep(1000);
					AlterComsuner	ar = new AlterComsuner(); 
			        ar.setVisible(true);
			        ar.setSize(Width, Width);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			
			}

		});
	 
	 mt5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Thread.sleep(1000);
					DelectComsuner dc = new DelectComsuner() ; 
			        dc.setVisible(true);
			        dc.setSize(Width, Height);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			
			}

		});
	 
	 ec1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Thread.sleep(1000);
					SelectAllComsuner sac= new SelectAllComsuner(); 
			        sac.setVisible(true);
			        sac.setSize(Width, Height);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			
			}

		});
	 
	 ec2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Thread.sleep(1000);
					SelectOrderId	so= new SelectOrderId(); 
			        so.setVisible(true);
			        so.setSize(Width, Height);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			
			}

		});
	 
	 mt7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Thread.sleep(1000);
					AddVendor av = new AddVendor(); 
					av.setVisible(false);
			        
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			
			}

		});
	 
	 mt8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Thread.sleep(1000);
					AlterVendor ad = new AlterVendor(); 
			        ad.setVisible(false);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}

		});
	 
	 mt9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Thread.sleep(1000);
					DeleteVendor dv = new DeleteVendor(); 
			        dv.setVisible(false);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			
			}

		});
	 
	 ecc1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				try {
					Thread.sleep(1000);
					SelectVendor sv = new SelectVendor(); 
			        sv.setVisible(true);
			        sv.setSize(Width, Height);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			
			}

		});
	 ecc2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Thread.sleep(1000);
					SelectVendor sv = new SelectVendor(); 
			        sv.setVisible(true);
			        sv.setSize(Width, Height);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
		});
	 mt11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Thread.sleep(1000);
					TypeManage	tm = new TypeManage(); 
			        tm.setVisible(true);
			        tm.setSize(Width, Height);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			
			}

		});	 

		mt12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Thread.sleep(1000);
					UiShopManager tm = new UiShopManager();
					tm.setVisible(true);
					tm.setSize(Width, Height);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}

			}

		});

		mt13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Thread.sleep(1000);
					OrderMessage om = new OrderMessage();
					om.setVisible(true);
					om.setSize(Width, Height);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}

			}

		});

		mt14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Thread.sleep(1000);
					OrderMessageManager sac = new OrderMessageManager();
					sac.setVisible(true);
					sac.setSize(Width, Height);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
		});

	 /**
	  * 关闭
	  */
	 f.addWindowListener(new WindowAdapter(){
		 public void windowClosing(WindowEvent e){
			f.dispose();
		 }
	 });
	}
public static void main(String[] args){
	
	ui.dispose();
}
}
