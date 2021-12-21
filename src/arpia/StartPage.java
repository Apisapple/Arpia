package arpia;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StartPage extends JFrame {

	JButton startBtn;
	JButton finishBtn;

	/*static JPanel p = new JPanel() {

		Image background = new ImageIcon(StartPage.class
				.getResource("/arpia/img/background/시작 화면 2.png")).getImage();

		public void paint(Graphics g) {
			g.drawImage(background, 0, 0, null);
		}
	}; */

	public StartPage() {
		
		setContentPane(new JLabel(
				new ImageIcon("./src/arpia/img/background/시작 화면 2.png")));

		setTitle("Arpia");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(850, 650);
		this.setLocationRelativeTo(null);  // 화면 가운데에 창 띄우기
		//p.setLayout(null);

		startBtn = new JButton("Game Start");
		startBtn.setContentAreaFilled(false);  // 버튼 영역 배경 표시
		startBtn.setFocusPainted(false);  // 포커스 테두리 사용 안함
		startBtn.setBounds(310, 300, 200, 50);
		startBtn.setForeground(Color.DARK_GRAY);
		startBtn.setFont(new Font("SansSerif", Font.BOLD, 25));
		
		finishBtn = new JButton("Exit");
		finishBtn.setBounds(310, 380, 200, 50);
		finishBtn.setContentAreaFilled(false);  // 버튼 영역 배경 표시
		finishBtn.setFocusPainted(false);  // 포커스 테두리 사용 안함
		finishBtn.setForeground(Color.DARK_GRAY);
		finishBtn.setFont(new Font("SansSerif", Font.BOLD, 25));
		//p.add(startBtn);
		//p.add(finishBtn);
		add(startBtn);
		add(finishBtn);
		//add(p);
		setVisible(true);

		startBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new OutSchool();
				setVisible(false);
			}
		});
		
		finishBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

}
