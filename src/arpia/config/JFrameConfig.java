package arpia.config;

public class JFrameConfig {
  private static final String TITLE = "ARPIA";

  private JFrameConfig() throws IllegalAccessException {
    throw new IllegalAccessException("JFrameConfig is utility classs");
  }

  public static String getTitle() {
    return TITLE;
  }
}
