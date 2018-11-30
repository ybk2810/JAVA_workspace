package ProjectGG;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Select extends JFrame implements ActionListener {
	String gamelist[] = { "par3", "par4", "par5" };
	Integer userlist[] = { 1, 2, 3, 4 };

	JComboBox<String> combo1;
	JComboBox<Integer> combo2;
	ImageIcon icon;
	JButton jbtn;
	JLabel jlb1, jlb2;

	Select() {
		setTitle("Golf Game");
		icon = new ImageIcon("src/Images/Select.png");
		setBounds(150, 0, 1300, 865);

		JPanel background = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};

		background.setLayout(null);

		jlb1 = new JLabel("Select Hole");
		jlb1.setBounds(250, 520, 250, 60);
		jlb1.setBackground(Color.BLACK);
		jlb1.setForeground(Color.WHITE);
		jlb1.setFont(new Font("Andalus", Font.BOLD, 35));

		jlb2 = new JLabel("Player Number");
		jlb2.setBounds(850, 520, 250, 60);
		jlb2.setBackground(Color.BLACK);
		jlb2.setForeground(Color.WHITE);
		jlb2.setFont(new Font("Andalus", Font.BOLD, 35));

		JButton jbtn = new JButton("START");
		jbtn.setBounds(552 - 25, 650, 250, 60);
		jbtn.setBackground(Color.BLACK);
		jbtn.setForeground(Color.WHITE);
		jbtn.setFont(new Font("Andalus", Font.BOLD, 50));
		jbtn.setBorderPainted(false);
		jbtn.setContentAreaFilled(false);

		combo1 = new JComboBox<String>(gamelist);
		combo1.setBounds(240, 570, 200, 60);
		combo1.setFont(new Font("Andalus", Font.BOLD, 30));

		combo2 = new JComboBox<Integer>(userlist);
		combo2.setBounds(870, 570, 200, 60);
		combo2.setFont(new Font("Andalus", Font.BOLD, 30));

		jbtn.addActionListener(this);
		combo1.addActionListener(this);
		combo2.addActionListener(this);

		background.add(jlb1);
		background.add(jlb2);
		background.add(jbtn);
		add(combo1);
		add(combo2);
		add(background);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Select();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		String game = combo1.getSelectedItem().toString();
		int user = Integer.parseInt(combo2.getSelectedItem().toString());
		Object obj = e.getSource();
		if (s.equals("START")) {
			setVisible(false);
			JFrame f = new JFrame();
			if (game == "par3") {
				Par3Game t = new Par3Game(user);
				f.setSize(1300, 865);
				f.setVisible(true);
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				f.getContentPane().add(t);
				t.requestFocus();
			} else if (game == "par4") {
				Par4Game t = new Par4Game(user);
				f.setSize(1300, 865);
				f.setVisible(true);
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				f.getContentPane().add(t);
				t.requestFocus();
			} else if (game == "par5") {
				Par5Game t = new Par5Game(user);
				f.setSize(1300, 865);
				f.setVisible(true);
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				f.getContentPane().add(t);
				t.requestFocus();
			}
		}
	}
}