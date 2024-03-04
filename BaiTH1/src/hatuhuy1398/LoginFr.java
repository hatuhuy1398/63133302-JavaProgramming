package hatuhuy1398;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFr extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUser;
	private JTextField txtPass;


	
	public LoginFr() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 522, 308);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(4,4,4,4));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TÊN ĐĂNG NHẬP");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setBounds(65, 59, 148, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblPass = new JLabel("MẬT KHẨU");
		lblPass.setFont(new Font("Arial", Font.PLAIN, 14));
		lblPass.setBounds(65, 135, 148, 36);
		contentPane.add(lblPass);
		
		txtUser = new JTextField();
		txtUser.setFont(new Font("Arial", Font.PLAIN, 14));
		txtUser.setBounds(223, 59, 232, 36);
		contentPane.add(txtUser);
		txtUser.setColumns(10);
		
		txtPass = new JTextField();
		txtPass.setFont(new Font("Arial", Font.PLAIN, 14));
		txtPass.setColumns(10);
		txtPass.setBounds(223, 135, 232, 36);
		contentPane.add(txtPass);
		
		JButton btnLogin = new JButton("ĐĂNG NHẬP");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xuLyDangNhap();
			}
		});
		btnLogin.setFont(new Font("Arial", Font.PLAIN, 14));
		btnLogin.setBounds(186, 205, 153, 42);
		contentPane.add(btnLogin);
	}
	
	public void xuLyDangNhap() 
	{
		// Lay ten dang nhap va mat khau
		String strUser = txtUser.getText();
		String strPass = txtPass.getText();
		
		if (strUser.equals("63CNTT") && strPass.equals("123"))
		{
			
			new HomeFr().setVisible(true);
			this.setVisible(false);
			JOptionPane hopThoai = new JOptionPane();
			hopThoai.showMessageDialog(this, "Dăng nhập thành công!!! ");
		
		} else {
			txtUser.setText("");
			txtPass.setText("");
			JOptionPane hopThoai = new JOptionPane();
			hopThoai.showMessageDialog(this, "Tên đăng nhập hoặc mật khẩu không đúng");
		}
	}
}
