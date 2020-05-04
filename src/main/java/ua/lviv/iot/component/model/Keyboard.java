package ua.lviv.iot.component.model;

import java.util.EnumSet;

public class Keyboard extends AbstractComputer {
  private String brand;
  private int numberOfKeys;

  public Keyboard(String color, int priceInHryvnas, EnumSet<ComputerTYPE> type, String brand,
                  int numberOfKeys) {
    super(color, priceInHryvnas, type);
    this.brand = brand;
    this.numberOfKeys = numberOfKeys;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public int getNumberOfKeys() {
    return numberOfKeys;
  }

  public void setNumberOfKeys(int numberOfKeys) {
    this.numberOfKeys = numberOfKeys;
  }

  public String getHeaders() {
    return super.getHeaders() + ", brand, numberOfKeys";
  }

  public String toCSV() {
    return super.toCSV() + ", " + brand + ", " + numberOfKeys;
  }

  @Override
  public String toString() {
    return "Keyboard [brand=" + brand + ", numberOfKeys=" + numberOfKeys + super.toString();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    long temp;
    temp = Double.doubleToLongBits(Double.parseDouble(brand));
    result = prime * result + (int) (temp ^ (temp >>> 32));
    result = prime * result + numberOfKeys;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!super.equals(obj)) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Keyboard other = (Keyboard) obj;
    if (Double.doubleToLongBits(Double.parseDouble(brand)) != Double.doubleToLongBits(Double.parseDouble(other.brand))) {
      return false;
    }
    if (numberOfKeys != other.numberOfKeys) {
      return false;
    }
    return true;
  }
}