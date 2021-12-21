package arpia;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import arpia.chracter.Player;

public class OutSchool extends JFrame {

	// 캐릭터 사진 붙일 레이블
	JLabel character_Label = new JLabel();

	ImageIcon SchoolIcon = new ImageIcon("./src/arpia/img/Icon/image_89.png");
	JLabel School = new JLabel();

	ImageIcon ToSchool = new ImageIcon("./src/arpia/img/Icon/들어가기.jpg");
	JButton BtToSchool = new JButton(ToSchool);

	ImageIcon PortalIcon = new ImageIcon("./src/arpia/img/Icon/portal 01.png");
	JButton BtToFight = new JButton(PortalIcon);

	OutSchool() {

		this.setTitle("Arpia");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(850, 650);
		this.setLayout(null);
		this.setResizable(false); // 창 크기 조절 불가

		setContentPane(new JLabel(
				new ImageIcon("./src/arpia/img/background/학교 지도 2.png")));

		character_Label.setIcon(Player.getLeftimage());
		character_Label.setLocation(300, 300);
		character_Label.setSize(54, 84);

		School.setIcon(SchoolIcon);
		School.setLocation(425, 235);
		School.setSize(132, 56);

		BtToSchool.setLocation(440, 285);
		BtToSchool.setSize(100, 28);

		BtToFight.setLocation(190, 520);
		BtToFight.setSize(150, 88);
		BtToFight.setContentAreaFilled(false);
		BtToFight.setBorderPainted(false);

		this.add(character_Label);
		this.add(BtToSchool);
		this.add(School);
		this.add(BtToFight);

		this.setFocusable(true);
		this.requestFocus();
		this.setVisible(true);

		this.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
					case KeyEvent.VK_UP :
						character_Label.setIcon(Player.getUpimage());
						character_Label.setLocation(character_Label.getX(),
								character_Label.getY() - 10);
						break;

					case KeyEvent.VK_DOWN :
						character_Label.setIcon(Player.getDownimage());
						character_Label.setLocation(character_Label.getX(),
								character_Label.getY() + 10);
						break;

					case KeyEvent.VK_LEFT :
						character_Label.setIcon(Player.getLeftimage());
						character_Label.setLocation(character_Label.getX() - 10,
								character_Label.getY());
						break;
					case KeyEvent.VK_RIGHT :
						character_Label.setIcon(Player.getRightimage());
						character_Label.setLocation(character_Label.getX() + 10,
								character_Label.getY());
						break;

				}

			}
		});

		BtToSchool.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new InSchool();
				setVisible(false); // 창 안보이게 하기
			}
		});

		BtToFight.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Fight();
				setVisible(false); // 창 안보이게 하기
			}
		});
	}

}
