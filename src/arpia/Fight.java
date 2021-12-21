package arpia;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import arpia.chracter.MushRoom;
import arpia.chracter.Player;
import arpia.config.JFrameConfig;
import arpia.skill.Fire;
import arpia.skill.FireBall;
import arpia.skill.FireBurst;

public class Fight extends JFrame {

	private static final long serialVersionUID = 1L;
	private Fire fire = new Fire();
	private FireBall fireBall = new FireBall();
	private FireBurst fireBurst = new FireBurst();
	ImageIcon firstMonsterIcon = new ImageIcon(
			"src/arpia/img/monster/mushroom1_default.gif");

	JLabel characterLabel = new JLabel(); // Player image
	JLabel characterHPLabel = new JLabel(Player.getCurrentHealthPoint() + " / "
			+ Player.getMaxHealthPoint()); // Player HP
	JLabel monsterLabel = new JLabel(); // Monster image
	JLabel monsterHPLabel = new JLabel(); // Monster HP
	JLabel skilllabel = new JLabel(); // skill image

	// skill fire
	JButton btnFire = fire.setSkillButton();
	ImageIcon fireImg = fire.getEffectImg();
	JLabel fireLabel = fire.setSkillLabel();

	// skill fireball
	JButton btnFireBall = fireBall.setSkillButton();
	ImageIcon fireBallImg = fireBall.getButtonImg();
	JLabel fireBallLabel = fireBall.setSkillLabel();

	// skill fireburst
	JButton btnFireBurst = fireBurst.setSkillButton();
	ImageIcon fireBurstImg = fireBurst.getButtonImg();
	JLabel fireBurstLabel = fireBurst.setSkillLabel();

	// item
	ImageIcon item = new ImageIcon("./src/arpia/img/attack/item.png");
	JButton Btn_item = new JButton(item);

	// run
	ImageIcon run = new ImageIcon("./src/arpia/img/attack/run.png");
	JButton Btn_run = new JButton(run);

	// JFrame
	Fight() {
		this.setTitle(JFrameConfig.getTitle());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(850, 650);
		this.setResizable(false); // display resizing false
		this.setVisible(true);
		this.setLocationRelativeTo(null);

		setContentPane(
				new JLabel(new ImageIcon("src/arpia/img/background/?��?�� 1.png")));

		// add Player to Frame
		characterLabel.setIcon(Player.getLeftimage());
		characterLabel.setLocation(650, 400);
		characterLabel.setSize(54, 84);
		//characterHPLabel
		characterHPLabel.setLocation(610, 360);
		characterHPLabel.setSize(150, 30);
		characterHPLabel.setForeground(Color.white);
		characterHPLabel.setFont(characterHPLabel.getFont().deriveFont(20.0f));
		this.add(characterLabel);
		this.add(characterHPLabel);

		// add Monster(mushroom) to Frame
		monsterLabel.setIcon(firstMonsterIcon);
		monsterLabel.setLocation(150, 400);
		monsterLabel.setSize(54, 84);
		monsterHPLabel.setLocation(150, 360);
		monsterHPLabel.setSize(100, 30);
		monsterHPLabel.setForeground(Color.white);
		monsterHPLabel.setFont(monsterHPLabel.getFont().deriveFont(20.0f));
		this.add(monsterLabel);
		this.add(monsterHPLabel);

		// ---attack buttons, item, run------------------
		this.add(btnFire);
		this.add(btnFireBall);
		this.add(btnFireBurst);

		Btn_item.setLocation(600, 500);
		Btn_item.setSize(50, 50);
		Btn_item.setContentAreaFilled(false);
		Btn_item.setBorderPainted(false);
		this.add(Btn_item);

		Btn_run.setLocation(650, 500);
		Btn_run.setSize(50, 50);
		Btn_run.setContentAreaFilled(false);
		Btn_run.setBorderPainted(false);
		this.add(Btn_run);
		// --------------------------------------

		// Damage
		// System.out.println(Player.getCurrentHealthPoint());
		MushRoom mushRoom = new MushRoom();
		// Player.getDamageByMonster(mushRoom.giveDamageToPlayer());
		// System.out.println(Player.getCurrentHealthPoint());

		// Run Button active
		Btn_run.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new OutSchool(); // scene change to OutSchool
				setVisible(false);
			}
		});

		// ===== Skill Button active ======
		btnFireBall.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Thread(new Runnable() {
					@Override
					public void run() {
						add(fireBallLabel, 0);
						try {
							Thread.sleep(600);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						remove(fireBallLabel);
					}
				}).start();
				if (Boolean.FALSE.equals(mushRoom
						.getDamageByPlayer(Player.getAttackPoint() * 3))) {
					Player.addExperience(mushRoom.getExp());
				}
			}
		});

		btnFire.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Thread(new Runnable() {
					@Override
					public void run() {
						add(fireLabel, 0);
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						remove(fireLabel);
					}
				}).start();
			}
		});

		btnFireBurst.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Thread(new Runnable() {
					@Override
					public void run() {
						add(fireBurstLabel, 1);
						try {
							Thread.sleep(700);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						remove(fireBurstLabel);
					}
				}).start();
			}
		});
	}
}
