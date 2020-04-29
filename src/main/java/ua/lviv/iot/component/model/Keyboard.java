package ua.lviv.iot.component.model;

public class Keyboard extends AbstractComputer {

  public String brand;
  public int numberOfKeys;

  public Keyboard(int price) {
    super(price);
  }

  public int numberOfKeys() {
    return numberOfKeys;
  }

  public void numberOfKeys(int numberOfKeys) {
    this.numberOfKeys = numberOfKeys;
  }

  public String brand() {
    return brand;
  }

  public void brand(String brand) {
    this.brand = brand;
  }
}