package ua.lviv.iot.component.model;


public class BlockSystem extends AbstractComputer {

  public String brand;
  public int power;

  public BlockSystem(int price) {
    super(price);
  }

  public String brand() {
    return brand;
  }

  public void brand(String brand) {
    this.brand = brand;
  }

  public int power() {
    return power;
  }

  public void power(int power) {
    this.power = power;
  }
}