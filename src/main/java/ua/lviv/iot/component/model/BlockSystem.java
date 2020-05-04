package ua.lviv.iot.component.model;


import java.util.EnumSet;

public class BlockSystem extends AbstractComputer {
  private String brand;
  private int power;

  public BlockSystem(String color, int priceInHryvnas, EnumSet<ComputerTYPE> type, String brand, int power) {
    super(color, priceInHryvnas, type);
    this.brand = brand;
    this.power = power;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public int getPower() {
    return power;
  }

  public void setPower(int power) {
    this.power = power;
  }

  public String getHeaders() {
    return super.getHeaders() + ", brand, power";
  }

  public String toCSV() {
    return super.toCSV() + ", " + brand + ", " + power;
  }

  @Override
  public String toString() {
    return "TreeToy [brand=" + brand + ", power=" + power + super.toString();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((brand == null) ? 0 : brand.hashCode());
    result = prime * result + power;
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
    BlockSystem other = (BlockSystem) obj;
    if (brand == null) {
      if (other.brand != null) {
        return false;
      }
    } else if (!brand.equals(other.brand)) {
      return false;
    }
    if (power != other.power) {
      return false;
    }
    return true;
  }

}