package ua.lviv.iot.component.maneger;

import ua.lviv.iot.component.model.AbstractComputer;
import ua.lviv.iot.component.model.ComputerException;

import java.util.LinkedList;
import java.util.List;

public class ComputerManager {
  ComputerManagerUtils.MonitorSorterByPrice sorter =
          new ComputerManagerUtils.MonitorSorterByPrice();

  ComputerManagerUtils utils = new ComputerManagerUtils();
  ComputerManagerUtils.MonitorSorterByBrand brandSorter =
          utils.new MonitorSorterByBrand();

  private List<AbstractComputer> computers = new LinkedList<>();

  public void addComputers(List<AbstractComputer> computers) {
    this.computers.addAll(computers);
  }

  public void addComputer(AbstractComputer computer) {
    this.computers.add(computer);
  }

  public List<AbstractComputer> findWithPriceLowerThan(int price) {

    List<AbstractComputer> result = new LinkedList<>();
    for (AbstractComputer computer : computers) {
      if (computer.getPrice() < price) {
        result.add(computer);
      }
    }
    return result;
  }

  public List<AbstractComputer> findBy(String brand) {
    List<AbstractComputer> result = new LinkedList<>();

    for (AbstractComputer computer : computers) {
      String computerBrand = computer.getBrand();

      if (computerBrand == null)
        continue;

      if (computerBrand.equals(brand)) {
        result.add(computer);
      }
    }
    return result;
  }

  public List<AbstractComputer> findByAnotherImplementation(String brand) {

    List<AbstractComputer> result = new LinkedList<>();

    if (brand == null)
      return result;

    for (AbstractComputer computer : computers) {

      if (brand.equals(computer.getBrand())) {
        result.add(computer);
      }
    }
    return result;
  }

  public List<AbstractComputer> findByWithException(String brand)
          throws ComputerException, NullPointerException {

    if (brand == null)
      throw new NullPointerException();

    throw new ComputerException(new RuntimeException());
  }

}
