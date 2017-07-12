package lab11;

import java.awt.*;
class StudentInfo extends Frame { 
	public StudentInfo() {
		//设置窗口的布局管理器:5x1的网格
		setLayout(new GridLayout(5,1));
		//创建面板p1来放置“姓名”、“学号”有关组件
		Panel p1=new Panel();
		Label lblName=new Label("姓名: ");
		TextField textName=new TextField(10);
		Label lblID= new Label("学号：");//创建"学号"标签
		TextField textID=new TextField(12);	//创建宽度为12的输入文本框	
		p1.add(lblName);
	    p1.add(textName);//将文本框textName添加到p1中
		p1.add(lblID);	
		p1.add(textID);
		add(p1);
		//创建面板p2来放置“性别”有关组件
		Panel p2=new Panel();
		Label lblSex=new Label("性别: ");
		//创建名为cbg的CheckboxGroup组件
		CheckboxGroup cbg=new CheckboxGroup();
		Checkbox male=new Checkbox("男", cbg, true);
		Checkbox female=new Checkbox("女", cbg, true);;//创建“女”的单选钮
		p2.add(lblSex);
	     p2.add(male);//添加组件male到p2
		p2.add(female);
	    add(p2);//将面板p2添加到窗口		
		//创建面板p3来放置“爱好”有关组件
		Panel p3=new Panel();
		Label lblHobby=new Label("爱好: ");
		Checkbox sing =new Checkbox("唱歌", null, false);
		Checkbox drawing=new Checkbox("huahua", null, false);//创建复选框
		Checkbox sports =new Checkbox("体育", null, false);
		p3.add(lblHobby);				
		p3.add(sing);
		p3.add(drawing);
		p3.add(sports);
		add(p3);		
		//创建面板p4来放置“系别”有关组件
		Panel p4=new Panel();
		Label lblDept=new Label("系别: ");
		Choice choice =new Choice();//创建组合框组件
		choice.add("软件系");//添加“软件系”选项
		choice.add("网络系");
		choice.add("游戏系");
		choice.add("电子系");
		p4.add(lblDept);				
		p4.add(choice);//将组合框组件添加到p4
		add(p4);		
		//创建面板p4来放置“提交”、“重置”按钮
		Panel p5=new Panel();
	    Button submit=new Button("提交");//创建“提交”按钮
		Button reset=new Button("重置");		
		p5.add(submit);				
		p5.add(reset);//将“重置”按钮放入p5
		add(p5);//将p5添加到窗口中
	}
	public static void main(String argc[]) {
		StudentInfo std = new StudentInfo();
		std.setTitle("学生信息");
		std.pack();
		std.setSize(400, 300);
		std.setVisible(true);
	}
}
