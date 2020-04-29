package ua.lviv.iot.component;

import org.junit.jupiter.api.BeforeEach;
import ua.lviv.iot.component.model.AbstractComputer;
import ua.lviv.iot.component.model.Monitor;

import java.util.LinkedList;
import java.util.List;

public abstract class ComputerComponentManagerTest {
  protected List<AbstractComputer> monitors;

  @BeforeEach
  public void createMonitors() {
    monitors = new LinkedList<AbstractComputer>();
    monitors.add(new Monitor(30, null));
    monitors.add(new Monitor(45, null));
    monitors.add(new Monitor(65, null));
  }
}