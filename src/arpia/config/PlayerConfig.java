package arpia.config;

public class PlayerConfig {

  private static final int PLAYER_HEALTH = 500;
  private static final int PLAYER_ATTACK_POINT = 10;

  public static int getPlayerHealth() {
    return PLAYER_HEALTH;
  }

  public static int getPlayerAttackPoint() {
    return PLAYER_ATTACK_POINT;
  }

  private PlayerConfig() throws IllegalAccessException {
    throw new IllegalAccessException("Player config class is utility class");
  }
}
