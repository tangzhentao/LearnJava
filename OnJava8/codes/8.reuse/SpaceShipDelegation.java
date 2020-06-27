

public class SpaceShipDelegation {
  private String name;
  private SpaceshipControls controls = new SpaceshipControls();

  public SpaceShipDelegation(String name) {
    this.name = name;
  }

  // 代理的方法
  public void up(int velocity) {
    controls.up(velocity);
  }
  public void down(int velocity) {
    controls.down(velocity);
  }
  public void left(int velocity) {
    controls.left(velocity);
  }
  public void right(int velocity) {
    controls.right(velocity);
  }
  public void forward(int velocity) {
    controls.forward(velocity);
  }
  public void back(int velocity) {
    controls.back(velocity);
  }
  public void turboBoost(int velocity) {
    controls.turboBoost(velocity);
  }

  public static void main(String[] args) {
    SpaceShipDelegation delegation = new SpaceShipDelegation("X space");
    delegation.up(10);
  }
}
