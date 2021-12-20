package arpia;


import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import arpia.chracter.MushRoom;
import arpia.chracter.Player;
import arpia.config.JFrameConfig;

public class Fight extends JFrame {

  ImageIcon firstMonsterIcon = new ImageIcon("src/monster/mushroom1_default.gif"); // mushroom Image

  JLabel characterLabel = new JLabel();
  JLabel monsterLabel = new JLabel();


  // JFrame
  Fight() {
    this.setTitle(JFrameConfig.getTitle());
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(850, 650);
    this.setResizable(false); // 화면 변경 기능 잠금
    setVisible(true);

    setContentPane(new JLabel(new ImageIcon("src/background/던전 1.png")));

    monsterLabel.setIcon(Player.getLeftimage());
    monsterLabel.setLocation(650, 400);
    monsterLabel.setSize(54, 84);

    this.add(characterLabel);

    // Damege 계산 예시
    System.out.println(Player.getHealthPoint());
    MushRoom mushRoom = new MushRoom();
    Player.getDamageByMonster(mushRoom.giveDamageToPlayer());
    System.out.println(Player.getHealthPoint());
    
    monsterLabel.setIcon(firstMonsterIcon);
    monsterLabel.setLocation(150, 400);
    monsterLabel.setSize(54, 84);

    this.add(monsterLabel);
  }
}
