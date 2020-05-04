package ua.lviv.iot.component;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.component.maneger.ComputerManagerUtils;
import ua.lviv.iot.component.model.AbstractComputer;
import ua.lviv.iot.component.model.SortTYPE;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComputerManagerUtilsTest extends ComputerComponentManagerTest {

  @BeforeEach
  void setUp() throws Exception {
    createComponents();
  }

  @Test
  void testSortDecorationsByPriceAscending() {
    List<AbstractComputer> sortedComponents = ComputerManagerUtils.sortComponentsByPrice(components, SortTYPE.ASC);
    assertEquals(1200, sortedComponents.get(0).getPriceInHryvnas());
    assertEquals(1250, sortedComponents.get(1).getPriceInHryvnas());
    assertEquals(1350, sortedComponents.get(2).getPriceInHryvnas());
    assertEquals(1400, sortedComponents.get(3).getPriceInHryvnas());
    assertEquals(1500, sortedComponents.get(4).getPriceInHryvnas());
    assertEquals(1600, sortedComponents.get(5).getPriceInHryvnas());
    assertEquals(2000, sortedComponents.get(6).getPriceInHryvnas());
  }

  @Test
  void testSortDecorationsByPriceDescending() {
    List<AbstractComputer> sortedComponents = ComputerManagerUtils.sortComponentsByPrice(components,
            SortTYPE.DESC);
    assertEquals(2000, sortedComponents.get(0).getPriceInHryvnas());
    assertEquals(1600, sortedComponents.get(1).getPriceInHryvnas());
    assertEquals(1500, sortedComponents.get(2).getPriceInHryvnas());
    assertEquals(1400, sortedComponents.get(3).getPriceInHryvnas());
    assertEquals(1350, sortedComponents.get(4).getPriceInHryvnas());
    assertEquals(1250, sortedComponents.get(5).getPriceInHryvnas());
    assertEquals(1200, sortedComponents.get(6).getPriceInHryvnas());
  }

  @Test
  void testSortDecorationsByColorAscending() {
    List<AbstractComputer> sortedComponents = ComputerManagerUtils.sortComponentsByColor(components, SortTYPE.ASC);
    assertEquals("White", sortedComponents.get(0).getColor());
    assertEquals("Black", sortedComponents.get(1).getColor());
    assertEquals("White", sortedComponents.get(2).getColor());
    assertEquals("Silver", sortedComponents.get(3).getColor());
    assertEquals("Space-Grey", sortedComponents.get(4).getColor());
    assertEquals("Black", sortedComponents.get(5).getColor());
    assertEquals("Silver", sortedComponents.get(6).getColor());
  }

  @Test
  void testSortDecorationsByColorDescending() {
    List<AbstractComputer> sortedComponents = ComputerManagerUtils.sortComponentsByColor(components, SortTYPE.DESC);
    assertEquals("Silver", sortedComponents.get(0).getColor());
    assertEquals("Black", sortedComponents.get(1).getColor());
    assertEquals("Space-Grey", sortedComponents.get(2).getColor());
    assertEquals("Silver", sortedComponents.get(3).getColor());
    assertEquals("White", sortedComponents.get(4).getColor());
    assertEquals("Black", sortedComponents.get(5).getColor());
    assertEquals("White", sortedComponents.get(6).getColor());
  }

}