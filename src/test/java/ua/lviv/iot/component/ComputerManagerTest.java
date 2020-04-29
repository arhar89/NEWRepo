package ua.lviv.iot.component;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.component.maneger.ComputerManager;
import ua.lviv.iot.component.model.AbstractComputer;
import ua.lviv.iot.component.model.ComputerException;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ComputerManagerTest extends ComputerComponentManagerTest {

  private ComputerManager computerManager;

  @BeforeEach
  public void setUp() {
    computerManager = new ComputerManager();
    computerManager.addComputers(monitors);

  }

  @Test
  public void testFindWithPriceLowerThan() {
    List<AbstractComputer> computers = computerManager.findWithPriceLowerThan(60);
    assertEquals(2, computers.size());
    assertEquals(30, computers.get(0).getPrice());
    assertEquals(45, computers.get(1).getPrice());

  }

  @Test
  public void testFindBy() {
    computerManager.findBy("monitor");
  }

  @Test
  public void testFindBySecuredImplementation() {
    try {
      computerManager.findByWithException(null);
    } catch (ComputerException | RuntimeException e) {
      e.getCause();
      e.printStackTrace();
      System.out.println("handle my exception");
    } catch (Exception e) {
      System.out.println("handle general exception");
    } finally {

      System.out.println("hi dudes");
    }
  }

}
