package ua.lviv.iot.component.model;

import java.util.EnumSet;

public class AbstractComputer {

  private static final int DEFAULT_YEAR_OF_PRODUCTION = 1970;
  private static final String DEFAULT_PRODUCER = "Unknown Chinese Producer";

  protected String color;
  protected int priceInHryvnas;
  protected String brand;
  protected int dateOfManufacture;
  protected EnumSet<ComputerTYPE> type;

  public AbstractComputer(String color, int priceInHryvnas, EnumSet<ComputerTYPE> type) {
    this(color, priceInHryvnas, type, DEFAULT_PRODUCER, DEFAULT_YEAR_OF_PRODUCTION);
  }

  public AbstractComputer(String color, int priceInHryvnas, EnumSet<ComputerTYPE> type, String brand,
                       int dateOfManufacture) {
    super();
    this.color = color;
    this.priceInHryvnas = priceInHryvnas;
    this.type = type;
    this.brand = brand;
    this.dateOfManufacture = dateOfManufacture;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public int getDateOfManufacture() {
    return dateOfManufacture;
  }

  public void setDateOfManufacture(int dateOfManufacture) {
    this.dateOfManufacture = dateOfManufacture;
  }

  public boolean checkCriterion(EnumSet<ComputerTYPE> criterion) {
    return this.type.containsAll(criterion);
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public double getPriceInHryvnas() {
    return priceInHryvnas;
  }

  public void setPriceInHryvnas(int priceInHryvnas) {
    this.priceInHryvnas = priceInHryvnas;
  }

  public EnumSet<ComputerTYPE> getType() {
    return type;
  }

  public void setType(EnumSet<ComputerTYPE> type) {
    this.type = type;
  }

  public String getHeaders() {
    return "color, priceInHryvnas, brand, dateOfManufacture, type";
  }

  public String toCSV() {
    return color + ", " + priceInHryvnas + ", " + brand + ", " + type;
  }

  @Override
  public String toString() {
    return "color=" + color + ", priceInHryvnas=" + priceInHryvnas + ", brand=" + brand + ", dateOfManufacture="
            + dateOfManufacture + ", type=" + type + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((color == null) ? 0 : color.hashCode());
    long temp;
    temp = Double.doubleToLongBits(priceInHryvnas);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    result = prime * result + ((type == null) ? 0 : type.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    AbstractComputer other = (AbstractComputer) obj;
    if (color == null) {
      if (other.color != null) {
        return false;
      }
    } else if (!color.equals(other.color)) {
      return false;
    }
    if (Double.doubleToLongBits(priceInHryvnas) != Double.doubleToLongBits(other.priceInHryvnas)) {
      return false;
    }
    if (type == null) {
      if (other.type != null) {
        return false;
      }
    } else if (!type.equals(other.type)) {
      return false;
    }
    return true;
  }
}