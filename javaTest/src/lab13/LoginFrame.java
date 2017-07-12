package lab13;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import javax.swing.*;

public class LoginFrame extends JFrame {
	// 2个label，2个输入文本，2个按钮
	private JLabel lb1, lb2;
	private JTextField UserIdtxt;
	private JPasswordField Pswtxt;
	private JButton Submitbtn, Resetbtn;
	private LoginFrame loginFrame;

	public LoginFrame() {
		this.setTitle("用户登录窗口");
		this.setLayout(new GridLayout(3, 1));
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		loginFrame=this;

		lb1 = new JLabel("用户名：");
		p1.add(lb1);
		UserIdtxt = new JTextField(20);
		// 为用户文本框注册事件侦听器
		p1.add(UserIdtxt);

		lb2 = new JLabel("密码：");
		p2.add(lb2);
		Pswtxt = new JPasswordField(20);
		Pswtxt.setEchoChar('*');
		// 为密码文本框注册事件侦听器
		Pswtxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char ch = e.getKeyChar();
				if ((ch < '0' || ch > '9') && ch != e.VK_BACK_SPACE) {
					e.consume();
				}
			}
		});
		p2.add(Pswtxt);

		Submitbtn = new JButton("提交");
		Submitbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					java.sql.Connection conn = DBHelper.getConnection();
					CallableStatement cas = conn
							.prepareCall("{call loginprc(?,?,?)}");
					cas.setString(1, UserIdtxt.getText());
					cas.setString(2, new String(Pswtxt.getPassword()));
					cas.registerOutParameter(3, Types.INTEGER);
					cas.execute();
					// System.out.println(cas.getInt(3));
					if (cas.getInt(3) != 0) {
						MainFrame mainFrame = new MainFrame();
						JOptionPane.showMessageDialog(null, "登陆成功！");
						mainFrame.setVisible(true);
						loginFrame.setVisible(false);
					} else {
						JOptionPane.showMessageDialog(null, "用户名密码不正确！");
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		Resetbtn = new JButton("重置");
		Resetbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				UserIdtxt.setText("");
				Pswtxt.setText("");
			}
		});
		p3.add(Submitbtn);
		p3.add(Resetbtn);

		this.getContentPane().add(p1);
		this.getContentPane().add(p2);
		this.getContentPane().add(p3);
		this.pack();
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new LoginFrame();
	}

}
