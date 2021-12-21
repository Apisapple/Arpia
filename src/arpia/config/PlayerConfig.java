package arpia.config;

public class PlayerConfig {

  private static final int PLAYER_HEALTH = 500;
  private static final int PLAYER_ATTACK_POINT = 10;
  private static final int PLAYER_START_LEVEL = 1;
  
  public static int getPlayerHealth() {
    return PLAYER_HEALTH;
  }

  public static int getPlayerAttackPoint() {
    return PLAYER_ATTACK_POINT;
  }

  public static int getPlayerStartLevel() {
    return PLAYER_START_LEVEL;
  }
  
  private PlayerConfig() throws IllegalAccessException {
    throw new IllegalAccessException("Player config class is utility class");
  }
}
