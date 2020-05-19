package ua.lviv.iot.component.maneger;

import ua.lviv.iot.component.model.AbstractComputer;
import ua.lviv.iot.component.model.SortTYPE;

import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComputerManagerUtils {
  public static List<AbstractComputer> sortComponentsByPrice(List<AbstractComputer> components, SortTYPE sortTYPE) {
    Comparator<AbstractComputer> comparator = new PriceComparator();
    return sortComponentsBy(components, sortTYPE, comparator);
  }

  public static List<AbstractComputer> sortComponentsByColor(List<AbstractComputer> components, SortTYPE sortTYPE) {
    ComputerManagerUtils utils = new ComputerManagerUtils();
    Comparator<AbstractComputer> comparator = utils.new ColorComparator();
    return sortComponentsBy(components, sortTYPE, comparator);
  }

  public static List<AbstractComputer> sortComputersByProducer(List<AbstractComputer> components, SortTYPE sortTYPE) {
    ComputerManagerUtils utils = new ComputerManagerUtils();
    Comparator<AbstractComputer> comparator = utils.producerComparator;
    return sortComponentsBy(components, sortTYPE, comparator);
  }


  private static List<AbstractComputer> sortComponentsBy(List<AbstractComputer> components, SortTYPE sortType,
                                                       Comparator<AbstractComputer> comparator) {
    components.sort(sortType == SortTYPE.ASC ? comparator : Collections.reverseOrder(comparator));
    return components;
  }

  private Comparator<AbstractComputer> producerComparator = new Comparator<AbstractComputer>() {
    @Override
    public int compare(AbstractComputer firstDecor, AbstractComputer secondDecor) {
      return firstDecor.getBrand().compareTo(secondDecor.getBrand());
    }

  };

  private static class PriceComparator implements Comparator<AbstractComputer>, Serializable {
    private static final long serialVersionUID = 8317167932461794587L;

    @Override
    public int compare(AbstractComputer firstComputer, AbstractComputer secondComputer) {
      return (int) (firstComputer.getPriceInHryvnas() - secondComputer.getPriceInHryvnas());
    }
  } private class ColorComparator implements Comparator<AbstractComputer> {
    @Override
    public int compare(AbstractComputer firstComputer, AbstractComputer secondComputer) {
      return firstComputer.getColor().compareTo(secondComputer.getColor());
    }
  }
}



