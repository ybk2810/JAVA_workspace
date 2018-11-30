package ProjectGG;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Start extends JFrame implements ActionListener {
	// JScrollPane scrollPane;
	ImageIcon icon;
	Select select;

	private Component jbtn3;

	Start() {
		setTitle("Golf Game");
		icon = new ImageIcon("src\\images\\golfmain1.png");
		setBounds(150, 0, 1300, 865);

		JPanel background = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};

		background.setLayout(null);

		JButton jbtn1 = new JButton("Start");
		jbtn1.setBounds(915, 570, 300, 60);
		jbtn1.setBackground(Color.BLACK);
		jbtn1.setForeground(Color.WHITE);
		jbtn1.setFont(new Font("Andalus", Font.BOLD, 80));
		jbtn1.setBorderPainted(false);
		jbtn1.setContentAreaFilled(false);
		background.add(jbtn1);

		JButton jbtn2 = new JButton("Info");
		jbtn2.setBounds(870, 682, 150, 40);
		jbtn2.setBackground(Color.BLACK);
		jbtn2.setForeground(Color.WHITE);
		jbtn2.setFont(new Font("Andalus", Font.BOLD, 50));
		jbtn2.setBorderPainted(false);
		jbtn2.setContentAreaFilled(false);
		background.add(jbtn2);

		JButton jbtn3 = new JButton("- End Game -");
		jbtn3.setBounds(1000, 660, 300, 90);
		jbtn3.setBackground(Color.BLACK);
		jbtn3.setForeground(Color.WHITE);
		jbtn3.setFont(new Font("Andalus", Font.BOLD, 40));
		jbtn3.setBorderPainted(false);
		jbtn3.setContentAreaFilled(false);
		background.add(jbtn3);

		jbtn1.addActionListener(this);
		jbtn2.addActionListener(this);
		jbtn3.addActionListener(this);
		add(background);
	}

	public static void main(String[] args) {

		Start frame = new Start();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// frame.setSize(528, 382);
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		Object obj = e.getSource();
		if (s.equals("Info")) {
			JFrame fs = new JFrame("설명");
			JLabel background = new JLabel(new ImageIcon("src\\images\\interface.png"));
			fs.add(background);
			fs.setVisible(true);
			fs.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					fs.dispose();
				}

			});
			fs.setSize(500, 400);
			fs.setLocation(200, 200);
		}
		if (s.equals("End Game")) {
			System.exit(0);
		} else if (s.equals("Start")) {
			setVisible(false);
			Select select = new Select();
			select.setVisible(true);
			// select.addWindowListener(this); // 창 닫을 때 자원반납을 위해 WindowListener 추가
		}
	}
}
