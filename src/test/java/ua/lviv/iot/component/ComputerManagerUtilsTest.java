package ua.lviv.iot.component;


import org.junit.jupiter.api.Test;
import ua.lviv.iot.component.maneger.ComputerManagerUtils;
import ua.lviv.iot.component.model.SortTYPE;

public class ComputerManagerUtilsTest extends ComputerComponentManagerTest {

  @Test
  public void testSortingDescending() {
    ComputerManagerUtils.sortByPrice(monitors, SortTYPE.DESC, comparator);
    //assertEquals(65, monitors.get(0).getPrice());
    //assertEquals(45, monitors.get(1).getPrice());
    //assertEquals(30, monitors.get(2).getPrice());
  }


}