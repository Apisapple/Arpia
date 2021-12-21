package arpia;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

import arpia.chracter.MushRoom;
import arpia.chracter.Player;
import arpia.config.JFrameConfig;

public class Fight extends JFrame {

	ImageIcon skillFire = new ImageIcon("./src/arpia/img/attack/skill_fire.png");
	ImageIcon skillFireBall = new ImageIcon("./src/arpia/img/attack/skill_fireball.png");
	ImageIcon skillFireBurst = new ImageIcon("./src/arpia/img/attack/skill_fireburst.png");
	ImageIcon firstMonsterIcon = new ImageIcon("src/arpia/img/monster/mushroom1_default.gif");

	JLabel characterLabel = new JLabel();  // Player image
	JLabel characterHPLabel = new JLabel(Player.getCurrentHealthPoint()+" / "+Player.getMaxHealthPoint());  // Player HP
	JLabel monsterLabel = new JLabel();  // Monster image
	JLabel monsterHPLabel = new JLabel();  // Monster HP
	JLabel skilllabel = new JLabel();  // skill image

	// skill fire
	ImageIcon fire = new ImageIcon("./src/arpia/img/attack/attack_fire.png");
	JButton Btn_fire = new JButton(fire);

	// skill fireball
	ImageIcon fireball = new ImageIcon("./src/arpia/img/attack/attack_fireball.png");
	JButton Btn_fireball = new JButton(fireball);

	// skill fireburst
	ImageIcon fireburst = new ImageIcon("./src/arpia/img/attack/attack_fireburst.png");
	JButton Btn_fireburst = new JButton(fireburst);

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
		setVisible(true);

		setContentPane(new JLabel(new ImageIcon("src/arpia/img/background/던전 1.png")));

		// add Player to Frame
		characterLabel.setIcon(Player.getLeftimage());
		characterLabel.setLocation(650, 400);
		characterLabel.setSize(54, 84);
		//characterHPLabel
		characterHPLabel.setLocation(635, 360);
		characterHPLabel.setSize(100, 30);
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
		Btn_fire.setLocation(450, 500);
		Btn_fire.setSize(50, 50);
		Btn_fire.setContentAreaFilled(false);
		Btn_fire.setBorderPainted(false);
		this.add(Btn_fire);

		Btn_fireball.setLocation(500, 500);
		Btn_fireball.setSize(50, 50);
		Btn_fireball.setContentAreaFilled(false);
		Btn_fireball.setBorderPainted(false);
		this.add(Btn_fireball);

		Btn_fireburst.setLocation(550, 500);
		Btn_fireburst.setSize(50, 50);
		Btn_fireburst.setContentAreaFilled(false);
		Btn_fireburst.setBorderPainted(false);
		this.add(Btn_fireburst);

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
		System.out.println(Player.getCurrentHealthPoint());
		MushRoom mushRoom = new MushRoom();
		// Player.getDamageByMonster(mushRoom.giveDamageToPlayer());
		System.out.println(Player.getCurrentHealthPoint());

		// Run Button active
		Btn_run.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new OutSchool();  // scene change to OutSchool
				setVisible(false);
			}
		});

		// ===== Skill Button active ======
		Btn_fireball.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				skilllabel.setIcon(skillFireBall);
				skilllabel.setSize(200, 70);
				skilllabel.setLocation(115, 420);
				new Thread(new Runnable() {
					@Override
					public void run() {
						add(skilllabel, 0);
						try {
							Thread.sleep(600);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						remove(skilllabel);
					}
				}).start();
			}
		});
		
		Btn_fire.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				skilllabel.setIcon(skillFire);
				skilllabel.setSize(70, 60);
				skilllabel.setLocation(135, 420);
				new Thread(new Runnable() {
					@Override
					public void run() {
						add(skilllabel, 0);
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						remove(skilllabel);
					}
				}).start();
			}
		});
		
		Btn_fireburst.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				skilllabel.setIcon(skillFireBurst);
				skilllabel.setSize(200, 70);
				skilllabel.setLocation(125, 410);
				new Thread(new Runnable() {
					@Override
					public void run() {
						add(skilllabel, 1);
						try {
							Thread.sleep(700);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						remove(skilllabel);
					}
				}).start();
			}
		});
	}

}
