package ua.lviv.iot.component;

import ua.lviv.iot.component.model.*;

import java.util.EnumSet;
import java.util.LinkedList;
import java.util.List;

public abstract class ComputerComponentManagerTest {
  protected List<AbstractComputer> components = new LinkedList<AbstractComputer>();

  public void createComponents() {
    components.add(new BlockSystem("black", 3800,
            EnumSet.of(ComputerTYPE.IN_TABLE), "Samsung",
            3));
    components.add(new BlockSystem("White", 4850,
            EnumSet.of(ComputerTYPE.IN_TABLE), "Apple", 8));
    components.add(new Keyboard("Silver", 850, EnumSet.of(ComputerTYPE.MECKHANICK, ComputerTYPE.MECKHANICK),
            "hp", 48));
    components.add(new Keyboard("White", 750, EnumSet.of(ComputerTYPE.MECKHANICK), "Xioami", 40));
    components.add(new Monitor("Black", 1899, EnumSet.of(ComputerTYPE.IN_STAND, ComputerTYPE.IN_STAND,
            ComputerTYPE.IN_STAND, ComputerTYPE.IN_TABLE), "Acer", 1980));
    components.add(new Monitor("Space-grey", 1670, EnumSet.of(ComputerTYPE.IN_STAND, ComputerTYPE.IN_STAND,
            ComputerTYPE.IN_STAND, ComputerTYPE.IN_TABLE), "Acer", 1680));

  }

}
