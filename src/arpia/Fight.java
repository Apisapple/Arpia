package arpia;


import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import arpia.chracter.MushRoom;
import arpia.chracter.Player;
import arpia.config.JFrameConfig;

public class Fight extends JFrame {
	
  ImageIcon firstMonsterIcon = new ImageIcon("src/arpia/img/monster/mushroom1_default.gif"); // mushroom Image
  
  JLabel characterLabel = new JLabel();
  JLabel monsterLabel = new JLabel();
  
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

    characterLabel.setIcon(Player.getLeftimage());
    characterLabel.setLocation(650, 400);
    characterLabel.setSize(54, 84);
    
    this.add(characterLabel);
    
    monsterLabel.setIcon(firstMonsterIcon);
    monsterLabel.setLocation(150, 400);
    monsterLabel.setSize(54, 84);
    
    this.add(monsterLabel);

    // --attack buttons, item, run--
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
    // -----
    
    // Damage 
    System.out.println(Player.getCurrentHealthPoint());
    MushRoom mushRoom = new MushRoom();
    //Player.getDamageByMonster(mushRoom.giveDamageToPlayer());
    System.out.println(Player.getCurrentHealthPoint());
   
    Btn_run.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          new OutSchool();
          setVisible(false);
        }
      });
  }
  
  
}
