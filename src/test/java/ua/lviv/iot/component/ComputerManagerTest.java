package ua.lviv.iot.component;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.component.maneger.ComputerManager;
import ua.lviv.iot.component.model.AbstractComputer;
import ua.lviv.iot.component.model.ComputerTYPE;

import java.util.EnumSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ComputerManagerTest extends ComputerComponentManagerTest {
  @BeforeEach
  void setUp() {
    createComponents();
  }

  @Test
  void testFindDecorationsByType() {
    ComputerManager manager = new ComputerManager(components);

    List<AbstractComputer> componentWihtKeyboard = manager
            .findDecorationsByType(EnumSet.of(ComputerTYPE.MECKHANICK));
    assertEquals(4, componentWihtKeyboard.size());
    for (AbstractComputer currentDecor : componentWihtKeyboard) {
      assertTrue(currentDecor.getType().contains(ComputerTYPE.MECKHANICK));
    }

    List<AbstractComputer> componentWithBlockSystem = manager.findDecorationsByType(EnumSet.of(ComputerTYPE.IN_TABLE));
    assertEquals(6, componentWithBlockSystem.size());
    for (AbstractComputer currentDecor : componentWithBlockSystem) {
      assertTrue(currentDecor.getType().contains(ComputerTYPE.IN_TABLE));
    }

    List<AbstractComputer> componentWithMonitor = manager
            .findDecorationsByType(EnumSet.of(ComputerTYPE.IN_STAND, ComputerTYPE.IN_STAND));
    assertEquals(1, componentWithMonitor.size());
    for (AbstractComputer currentDecor : componentWithMonitor) {
      assertTrue(
              currentDecor.getType().containsAll(EnumSet.of(ComputerTYPE.IN_STAND, ComputerTYPE.IN_STAND)));
    }
  }
}
