import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textName;
	private JTextField textAge;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame frame = new MyFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	JLabel lblinfo;
	
	public MyFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter  Name : ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(49, 30, 107, 41);
		contentPane.add(lblNewLabel);
		
		JLabel lblEnterAge = new JLabel("Enter  Age : ");
		lblEnterAge.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEnterAge.setBounds(49, 92, 107, 41);
		contentPane.add(lblEnterAge);
		
		textName = new JTextField();
		textName.setBounds(217, 36, 135, 32);
		contentPane.add(textName);
		textName.setColumns(10);
		
		textAge = new JTextField();
		textAge.setColumns(10);
		textAge.setBounds(217, 92, 135, 32);
		contentPane.add(textAge);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{	
				String name = textName.getText();
				int age = Integer.parseInt(textAge.getText());
				if(age >= 18)
				{
					lblinfo.setText(name + " You are Eligible to Vote !");
				}
				else if(age < 18)
				{
					lblinfo.setText(name + " You are not Eligible to Vote !");
				}
			}
		});
		btnNewButton.setBounds(95, 163, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{	
				textName.setText("");
				textAge.setText("");
				lblinfo.setText("");
				
			}
		});
		btnReset.setBounds(249, 163, 89, 23);
		contentPane.add(btnReset);
		
		lblinfo = new JLabel("");
		lblinfo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblinfo.setBounds(64, 224, 292, 26);
		contentPane.add(lblinfo);
	}
}
