package arpia.chracter;

import javax.swing.ImageIcon;
import arpia.config.PlayerConfig;

public class Player {

	private Player() throws IllegalAccessException {
		throw new IllegalAccessException("this game is single player");
	}

	private static Integer maxHealthPoint = PlayerConfig.getPlayerHealth();
	private static Integer currnetHealthPoint = PlayerConfig.getPlayerHealth();
	private static Integer attackPoint = PlayerConfig.getPlayerAttackPoint();
	private static Integer level = PlayerConfig.getPlayerStartLevel();
	private static Integer experience = 0;
	private static Integer expForLevelUp = 100;

	private static final ImageIcon leftImage = new ImageIcon(
			"./src/arpia/img/character/left.png");
	private static final ImageIcon rightImage = new ImageIcon(
			"./src/arpia/img/character/right.png");
	private static final ImageIcon upImage = new ImageIcon(
			"./src/arpia/img/character/up.png");
	private static final ImageIcon downImage = new ImageIcon(
			"./src/arpia/img/character/down.png");

	public static void levelUp() {
		level++;
		maxHealthPoint += 50;
		currnetHealthPoint = maxHealthPoint;
		attackPoint += 10;
	}

	public static void addExperience(int expPoint) {
		experience += expPoint;
		if (expForLevelUp < experience) {
			levelUp();
			experience = experience - expForLevelUp;
			expForLevelUp += 100;
		}
	}

	public static Integer getCurrentHealthPoint() {
		return currnetHealthPoint;
	}

	public static Integer getMaxHealthPoint() {
		return maxHealthPoint;
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
		Player.currnetHealthPoint = Player.currnetHealthPoint - attackPoint;
		return Player.currnetHealthPoint > 0;
	}
}
