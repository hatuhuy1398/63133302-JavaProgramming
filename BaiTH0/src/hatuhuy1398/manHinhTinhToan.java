package hatuhuy1398;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class manHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField numA;
	private JTextField numB;
	private JTextField resultR;


	/**
	 * Create the frame.
	 */
	public manHinhTinhToan() {
		setFont(new Font("Dialog", Font.PLAIN, 16));
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 726, 365);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter number a: ");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel.setBounds(136, 47, 217, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpSTh = new JLabel("Enter number b: ");
		lblNhpSTh.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNhpSTh.setBounds(136, 106, 217, 20);
		contentPane.add(lblNhpSTh);
		
		numA = new JTextField();
		numA.setBackground(new Color(255, 255, 255));
		numA.setFont(new Font("Arial", Font.PLAIN, 16));
		numA.setBounds(302, 44, 290, 26);
		contentPane.add(numA);
		numA.setColumns(10);
		
		numB = new JTextField();
		numB.setFont(new Font("Arial", Font.PLAIN, 16));
		numB.setColumns(10);
		numB.setBackground(Color.WHITE);
		numB.setBounds(302, 103, 290, 26);
		contentPane.add(numB);
		
		JButton btnAdd = new JButton("Addition");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				xuLyCong();
			}
		});
		btnAdd.setFont(new Font("Arial", Font.PLAIN, 16));
		btnAdd.setBounds(66, 173, 96, 35);
		contentPane.add(btnAdd);
		
		JButton btnSub = new JButton("Subtraction");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xuLyTru();
			}
		});
		btnSub.setFont(new Font("Arial", Font.PLAIN, 16));
		btnSub.setBounds(210, 173, 96, 35);
		contentPane.add(btnSub);
		
		JButton btnMulti = new JButton("Multi");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xuLyNhan();

			}
		});
		btnMulti.setFont(new Font("Arial", Font.PLAIN, 16));
		btnMulti.setBounds(364, 173, 96, 35);
		contentPane.add(btnMulti);
		
		JButton btnDivision = new JButton("Division");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xuLyChia();

			}
		});
		btnDivision.setFont(new Font("Arial", Font.PLAIN, 16));
		btnDivision.setBounds(525, 173, 96, 35);
		contentPane.add(btnDivision);
		
		JLabel lblKtQuTnh = new JLabel("Result:");
		lblKtQuTnh.setFont(new Font("Arial", Font.PLAIN, 16));
		lblKtQuTnh.setBounds(136, 252, 130, 20);
		contentPane.add(lblKtQuTnh);
		
		resultR = new JTextField();
		resultR.setForeground(Color.RED);
		resultR.setEditable(false);
		resultR.setFont(new Font("Arial", Font.PLAIN, 16));
		resultR.setColumns(10);
		resultR.setBackground(Color.WHITE);
		resultR.setBounds(302, 255, 290, 26);
		contentPane.add(resultR);
	}
	
	void xuLyCong()
	{

		double soA = Double.parseDouble(numA.getText());
		double soB = Double.parseDouble(numB.getText());
		
		double tong = soA + soB;
		resultR.setText(String.valueOf(tong));
	}
	
	void xuLyTru()
	{
		double soA = Double.parseDouble(numA.getText());
		double soB = Double.parseDouble(numB.getText());
		
		double hieu = soA - soB;
		resultR.setText(String.valueOf(hieu));
	}
	void xuLyNhan()
	{
		double soA = Double.parseDouble(numA.getText());
		double soB = Double.parseDouble(numB.getText());
		
		double tich = soA * soB;
		resultR.setText(String.valueOf(tich));
	}
	void xuLyChia()
	{
		double soA = Double.parseDouble(numA.getText());
		double soB = Double.parseDouble(numB.getText());
		double thuong;
		if (soB != 0)
		{
			thuong = soA / soB;
			resultR.setText(String.valueOf(thuong));
		}else
			resultR.setText("Không chia được");

		
	}
}