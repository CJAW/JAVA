package lab13;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.net.*;
/**
 * 系统主界面
 */
public class MainFrame extends JFrame implements ActionListener{
	Dimension faceSize = new Dimension(600, 450);
	JMenuBar mainMenu = new JMenuBar();
	JMenu menuSystem=new JMenu();
	JMenuItem itemTypeMan=new JMenuItem();
	JMenuItem itemExit=new JMenuItem();
	JMenu menuAssets=new JMenu();
	JMenuItem itemAddAssets=new JMenuItem();
	JMenuItem itemModifyAssets=new JMenuItem();
	JMenuItem itemDeleteAssets=new JMenuItem();
	JMenu itemSelectAssets=new JMenu();
	JMenuItem itemSelectAssetsAll = new JMenuItem();
	JMenuItem itemSelectAssetsID=new JMenuItem();
	JMenu menuPerson=new JMenu();
	JMenuItem itemAddPerson=new JMenuItem();
	JMenuItem itemModifyPerson=new JMenuItem();
	JMenuItem itemDeletePerson=new JMenuItem();
	JMenu itemSelectPerson=new JMenu();
	JMenuItem itemSelectPersonAll = new JMenuItem();
	JMenuItem itemSelectPersonID=new JMenuItem();
	JMenu menuUsing=new JMenu();
	JMenuItem itemUsing=new JMenuItem();
	JMenuItem itemSelectUsing=new JMenuItem();
	JMenu menuBack=new JMenu();
	JMenuItem itemBack=new JMenuItem();
	JMenuItem itemSelectBack=new JMenuItem();
	/**
	 * 程序初始化函数
	 */
	 public MainFrame() {
		enableEvents(AWTEvent.WINDOW_EVENT_MASK);

		//添加框架的关闭事件处理
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		//设置框架的大小
		this.setSize(faceSize);
		//设置标题
		this.setTitle("网上超市信息管理系统");


		try {
			Init();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 程序初始化函数
	 */
	private void Init() throws Exception {
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new BorderLayout());

		//添加菜单组
		menuSystem.setText("系统管理");
		menuSystem.setFont(new Font("Dialog", 0, 12));
		menuAssets.setText("客户信息管理");
		menuAssets.setFont(new Font("Dialog", 0, 12));
		menuPerson.setText("供应商信息管理");
		menuPerson.setFont(new Font("Dialog", 0, 12));
		menuUsing.setText("商品信息管理") ;
		menuUsing.setFont(new Font("Dialog", 0, 12));
		menuBack.setText("订单信息管理");
		menuBack.setFont(new Font("Dialog", 0, 12));



		//生成“系统管理”菜单组的选项
		itemTypeMan.setText("密码修改");
		itemTypeMan.setFont(new Font("Dialog",0,12));
		itemExit.setText("退出");
		itemExit.setFont(new Font("Dialog",0,12));
		//生成“客户信息管理”菜单组的选项
		itemAddAssets.setText("增加客户");
		itemAddAssets.setFont(new Font("Dialog",0,12));
		itemModifyAssets.setText("修改客户");
		itemModifyAssets.setFont(new Font("Dialog",0,12));
		itemDeleteAssets.setText("删除客户");
		itemDeleteAssets.setFont(new Font("Dialog",0,12));
		itemSelectAssets.setText("查询客户");
		itemSelectAssets.setFont(new Font("Dialog",0,12));
		itemSelectAssetsAll.setText("查询所有客户");
		itemSelectAssetsAll.setFont(new Font("Dialog",0,12));
		itemSelectAssetsID.setText("按编号查询客户");
		itemSelectAssetsID.setFont(new Font("Dialog",0,12));
		//生成“供应商信息管理”菜单组的选项
		itemAddPerson.setText("供应商信息增加");
		itemAddPerson.setFont(new Font("Dialog",0,12));
		itemModifyPerson.setText("供应商信息修改");
		itemModifyPerson.setFont(new Font("Dialog",0,12));
		itemDeletePerson.setText("供应商信息删除");
		itemDeletePerson.setFont(new Font("Dialog",0,12));
		itemSelectPerson.setText("查询供应商信息");
		itemSelectPerson.setFont(new Font("Dialog",0,12));
		itemSelectPersonAll.setText("查询所有供应商");
		itemSelectPersonAll.setFont(new Font("Dialog",0,12));
		itemSelectPersonID.setText("按编号查询供应商");
		itemSelectPersonID.setFont(new Font("Dialog",0,12));
		//生成“商品信息管理”菜单组的选项
		itemUsing.setText("商品类别管理");
		itemUsing.setFont(new Font("Dialog",0,12));
		itemSelectUsing.setText("商品信息查询");
		itemSelectUsing.setFont(new Font("Dialog",0,12));
		//生成“订单信息管理”菜单组的选项
		itemBack.setText("订单管理");
		itemBack.setFont(new Font("Dialog",0,12));
		itemSelectBack.setText("订单信息管理查询");
		itemSelectBack.setFont(new Font("Dialog",0,12));




		menuSystem.add(itemTypeMan);
		menuSystem.add(itemExit);


		menuAssets.add(itemAddAssets);
		menuAssets.add(itemModifyAssets);
		menuAssets.add(itemDeleteAssets);
		menuAssets.addSeparator();
		menuAssets.add(itemSelectAssets);
		itemSelectAssets.add(itemSelectAssetsAll);
		itemSelectAssets.add(itemSelectAssetsID);


		menuPerson.add(itemAddPerson);
		menuPerson.add(itemModifyPerson);
		menuPerson.add(itemDeletePerson);
		menuPerson.addSeparator();
		menuPerson.add(itemSelectPerson);
		itemSelectPerson.add(itemSelectPersonAll);
		itemSelectPerson.add(itemSelectPersonID);


		menuUsing.add(itemUsing);
		menuUsing.add(itemSelectUsing);


		menuBack.add(itemBack);
		menuBack.add(itemSelectBack);


		//添加所有的菜单组
		mainMenu.add(menuSystem);
		mainMenu.add(menuAssets);
		mainMenu.add(menuPerson);
		mainMenu.add(menuUsing);
		mainMenu.add(menuBack);
		this.setJMenuBar(mainMenu);

		//添加事件侦听
		itemTypeMan.addActionListener(this);
		itemExit.addActionListener(this);
		itemAddAssets.addActionListener(this);
		itemModifyAssets.addActionListener(this);
		itemDeleteAssets.addActionListener(this);
		itemSelectAssetsAll.addActionListener(this);
		itemSelectAssetsID.addActionListener(this);
		itemAddPerson.addActionListener(this);
		itemModifyPerson.addActionListener(this);
		itemDeletePerson.addActionListener(this);
		itemSelectPersonAll.addActionListener(this);
		itemSelectPersonID.addActionListener(this);
		itemUsing.addActionListener(this);
		itemSelectUsing.addActionListener(this);
		itemBack.addActionListener(this);
		itemSelectBack.addActionListener(this);



		//关闭程序时的操作
		this.addWindowListener(
			new WindowAdapter(){
				public void windowClosing(WindowEvent e){
					System.exit(0);
				}
			}
		);
	}

	/**
	 * 事件处理
	 */
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == itemExit) { //退出
			System.exit(0);
		}
		else if (obj == itemTypeMan) { 
			
		}
		else if (obj == itemAddAssets) { 
			
		}
		else if (obj == itemModifyAssets) { 
			
		}
		else if (obj == itemDeleteAssets) { 
			
		}
		else if (obj == itemSelectAssetsAll) { 
			
		}
		else if (obj == itemSelectAssetsID) { 
			
		}
		else if (obj == itemAddPerson) { 
		
		}
		else if (obj == itemModifyPerson) { 
		}

		else if (obj == itemDeletePerson) { 
			
		}
		else if (obj == itemSelectPersonAll) { 
		}
		else if (obj == itemSelectPersonID) { 
		}
		else if (obj == itemUsing) {
		}
		else if (obj == itemSelectUsing) { 
		}
		else if (obj == itemBack) { 
		}
		else if (obj == itemSelectBack) { 
		}
	}

}