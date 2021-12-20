package arpia.chracter;

import javax.swing.ImageIcon;
import arpia.config.PlayerConfig;

public class Player {


  private static Integer healthPoint = PlayerConfig.getPlayerHealth();
  private static Integer attackPoint = PlayerConfig.getPlayerAttackPoint();

  private static final ImageIcon leftImage = new ImageIcon("./src/arpia/img/character/left.png");
  private static final ImageIcon rightImage = new ImageIcon("./src/arpia/img/character/right.png");
  private static final ImageIcon upImage = new ImageIcon("./src/arpia/img/character/up.png");
  private static final ImageIcon downImage = new ImageIcon("./src/arpia/img/character/down.png");

  public static Integer getHealthPoint() {
    return healthPoint;
  }

  public static Integer getAttackPoint() {
    return attackPoint;
  }

  public static ImageIcon getLeftimage() {
    return leftImage;
  }

  public static ImageIcon getRightimage() {
    return rightImage;
  }

  public static ImageIcon getUpimage() {
    return upImage;
  }

  public static ImageIcon getDownimage() {
    return downImage;
  }

  public static boolean getDamageByMonster(Integer attackPoint) {
    Player.healthPoint = Player.healthPoint - attackPoint;
    return Player.healthPoint > 0;
  }
}
