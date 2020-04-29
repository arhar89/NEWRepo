package ua.lviv.iot.component.maneger;

import ua.lviv.iot.component.model.AbstractComputer;
import ua.lviv.iot.component.model.SortTYPE;

import java.util.Comparator;
import java.util.List;

public class ComputerManagerUtils {


  private static final MonitorSorterByPrice MONITOR_SORTER_BY_PRICE = new MonitorSorterByPrice();

  public static void sortByPrice(List<AbstractComputer> computers, SortTYPE sortTYPE,
                                 Comparator<AbstractComputer> comparator) {
    computers.sort(sortTYPE == SortTYPE.ASC ? MONITOR_SORTER_BY_PRICE : MONITOR_SORTER_BY_PRICE.reversed());
  }

  public static void sortByBrand(List<AbstractComputer> computers, SortTYPE sortTYPE, Comparator<AbstractComputer> comparator) {
    Comparator<AbstractComputer> comparator1 = Comparator.comparing(AbstractComputer::getBrand);
    computers.sort(sortTYPE == SortTYPE.ASC ? comparator : comparator.reversed());
  }

  public static void sortByPriceAndBrand(List<AbstractComputer> computers, SortTYPE sortTYPE) {
    Comparator<AbstractComputer> comparator = new Comparator<AbstractComputer>() {
      @Override
      public int compare(AbstractComputer firstComputer, AbstractComputer secondComputer) {
        int priceCapacityResult = firstComputer.getPrice() - secondComputer.getPrice();
        if (priceCapacityResult != 0) {
          return priceCapacityResult;
        }
        return firstComputer.getBrand().compareTo(secondComputer.getBrand());
      }
    };

  }

  public static List<AbstractComputer> sortByDateOfManufacture
          (List<AbstractComputer> computers, SortTYPE sortTYPE) {
    Comparator<AbstractComputer> comparator = (AbstractComputer firstComputer, AbstractComputer secondComputer) -> firstComputer.getDateOfManufacture() - secondComputer.getDateOfManufacture();
    return computers;

  }


  class MonitorSorterByBrand implements Comparator<AbstractComputer> {
    @Override
    public int compare(AbstractComputer firstComputer, AbstractComputer secondComputer) {
      return firstComputer.getBrand().compareTo(secondComputer.getBrand());
    }

  }

  static class MonitorSorterByPrice implements Comparator<AbstractComputer> {
    @Override
    public int compare(AbstractComputer firstComputer, AbstractComputer secondComputer) {
      return firstComputer.getPrice() - secondComputer.getPrice();
    }
  }
}