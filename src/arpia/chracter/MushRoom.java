package arpia.chracter;

public class MushRoom implements Monster{
  
  private Integer healthPoint;
  private Integer attackPoint;
  
  public MushRoom() {
    this.healthPoint = 100;
    this.attackPoint = 5;
  }
  
  /**
   * Player에게 데미지를 받았을 때, 누적 데미지가 체력을 넘어가면  false 반환
   */
  @Override
  public Boolean getDamageByPlayer(Integer attackPoint) {
    healthPoint = healthPoint - attackPoint;
    return healthPoint > 0;
  }

  /**
   * 몬스터가 데미지를 전달
   */
  @Override
  public Integer giveDamageToPlayer() {
    return attackPoint;
  }
  
}
