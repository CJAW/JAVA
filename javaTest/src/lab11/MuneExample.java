package lab11;

import java.awt.*;
public class MuneExample extends Frame {
	MuneExample(String title) {
		super(title);//设置框架标题
		MenuBar mbar = new MenuBar();//创建菜单条

		
		//创建菜单对象:文件,编辑,帮助
		Menu menuFile = new Menu("文件");
		Menu menuEdit = new Menu("编辑");
		Menu menuHelp = new Menu("帮助");
				
		//创建"文件"菜单的菜单项对象
		MenuItem menuItemFileNew=new MenuItem("新建");
		MenuItem menuItemFileOpen=new MenuItem("打开");
		MenuItem menuItemFileSave=new MenuItem("保存");		
		MenuItem menuItemFileSaveAs=new MenuItem("另存为");
		MenuItem menuItemFileQuit=new MenuItem("退出");
						
		//创建"编辑"菜单的菜单项对象
		MenuItem menuItemEditUndo=new MenuItem("撤消");
		MenuItem menuItemEditCut=new MenuItem("撤消");
		MenuItem menuItemEditCopy=new MenuItem("复制");		
		MenuItem menuItemEditPaste=new MenuItem("zhantei");

		//创建"帮助"菜单的菜单项对象
		MenuItem menuItemHelp=new MenuItem("关于...");
		
		//将菜单项添加到对应的菜单中
		menuFile.add(menuItemFileNew);
		menuFile.add(menuItemFileOpen);
		menuFile.add(menuItemFileSave);
		menuFile.add(menuItemFileSaveAs);
		menuFile.addSeparator();//在菜单中增加一条分隔线
		
		menuFile.add(menuItemFileQuit);

		menuEdit.add(menuItemEditUndo);
		menuEdit.addSeparator();//在菜单中增加一条分隔线
		menuFile.add(menuItemEditCut);
		menuEdit.add(menuItemEditCopy);
		menuEdit.add(menuItemEditPaste);

		menuHelp.add(menuItemHelp);
						
		//将菜单添加到菜单条中
		mbar.add(menuFile);
		mbar.add(menuEdit);
		mbar.add(menuHelp);
		
		//将菜单条加入到框架
		
		
		setMenuBar(mbar);
		
	}



	public static void main(String args[]) {
		MuneExample menu = new MuneExample("简单文本编辑器");
		menu.pack();
		menu.setSize(300, 200);
		menu.setVisible(true);
	}
}
