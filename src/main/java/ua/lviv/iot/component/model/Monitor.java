package ua.lviv.iot.component.model;

public class Monitor extends AbstractComputer implements Comparable<Monitor> {
  public int screeExtensions;


  public Monitor(int price, String brand) {

    super(price, brand);
  }


  public int screeExtensions() {
    return screeExtensions;
  }

  public void screeExtensions(int screeExtensions) {
    this.screeExtensions = screeExtensions;


  }

  @Override
  public int compareTo(Monitor another) {
    return this.getPrice() - another.getPrice();
  }
}