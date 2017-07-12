package lab11;

//Calculator.java
import java.awt.*;

public class Calculator extends Frame {
	Calculator() {
		super("计算器");
		setLayout(new GridLayout(5, 1));
		setFont(new Font("Fixedsys", Font.PLAIN, 14));
		Label label = new Label("计算结果：");
		TextField tf = new TextField(12);
		Panel p1 = new Panel();
		p1.add(label);
		p1.add(tf);
		add(p1);

		// 创建按钮数组
		String[] str = { " 1 ", " 2 ", " 3 ", " + ", " - ", " 4 ", " 5 ", " 6 ", " X ", " / ", " 7 ", " 8 ", " 9 ",
				" ^ ", "sqrt", " C ", " 0 ", " . ", "      =      " };
		Button[] button = new Button[str.length];
		for (int i = 0; i < str.length; i++) {
			button[i] = new Button(str[i]);

		}
		// 按钮布局
		/*
		 * Panel p2 = new Panel(); for (int i = 0; i < 5; i++) { if(i==2){ Label
		 * l = new Label("   "); p2.add(l); } p2.add(button[i]); add(p2); }
		 * 
		 * Panel p3 = new Panel(); for (int i = 5; i < 10; i++) { if(i==7){
		 * Label l = new Label("   "); p3.add(l); } p3.add(button[i]); add(p3);
		 * } Panel p4 = new Panel(); for (int i = 10; i < 15; i++) { if(i==12){
		 * Label l = new Label("   "); p4.add(l); } p4.add(button[i]); add(p4);
		 * } Panel p5 = new Panel(); for (int i = 15; i < 19; i++) {
		 * p5.add(button[i]); if(i==18){ Label l = new Label("   "); p5.add(l);
		 * }
		 * 
		 * add(p5); }
		 * 
		 */

		Panel[] p = new Panel[4];

		for (int j = 0; j< 4; j++) {
		     p[j] = new Panel();
			for (int i = j*5; i <j*5+5&&i<str.length; i++) {
				
				p[j].add(button[i]);
				if (str[i].equals(3) || str[i].equals(6) || str[i].equals(9)) {
					Label l = new Label("    ");
					p[j].add(l);
				}
              
			}
			add(p[j]);

		}

		pack();
		setSize(10, 10);
		setVisible(true);

	}

	public static void main(String args[]) {
		Calculator mycal = new Calculator();
		mycal.setSize(500, 300);
		mycal.setVisible(true);

	}
}
