package ua.lviv.iot.component.model;

import java.util.EnumSet;

public class Monitor extends AbstractComputer{
  private String brand;
  private int screenExtancion;

  public Monitor(String color, int priceInHryvnas, EnumSet<ComputerTYPE> type, String brand, int screenExtancion) {
    super(color, priceInHryvnas, type);
    this.brand = brand;
    this.screenExtancion = screenExtancion;
  }

  public Monitor(String color, int priceInHryvnas, EnumSet<ComputerTYPE> type) {
    super(color, priceInHryvnas, type);
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public int getScreenExtancion() {
    return screenExtancion;
  }

  public void setScreenExtancion(int screenExtancion) {
    this.screenExtancion = screenExtancion;
  }

  public String getHeaders() {
    return super.getHeaders() + ", form, volumeInCmCube";
  }

  public String toCSV() {
    return super.toCSV() + ", " + brand + ", " + screenExtancion;
  }

  @Override
  public String toString() {
    return "TreeToy [brand=" + brand + ", screenExtancion=" + screenExtancion + super.toString();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((brand == null) ? 0 : brand.hashCode());
    result = prime * result + screenExtancion;
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
    Monitor other = (Monitor) obj;
    if (brand == null) {
      if (other.brand != null) {
        return false;
      }
    } else if (!brand.equals(other.brand)) {
      return false;
    }
    if (screenExtancion != other.screenExtancion) {
      return false;
    }
    return true;
  }

}

