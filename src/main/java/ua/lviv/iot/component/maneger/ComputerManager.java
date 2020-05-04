package ua.lviv.iot.component.maneger;

import ua.lviv.iot.component.model.AbstractComputer;
import ua.lviv.iot.component.model.ComputerTYPE;

import java.util.EnumSet;
import java.util.LinkedList;
import java.util.List;

public class  ComputerManager {
  private List<AbstractComputer> components;

  public List<AbstractComputer> getComponents() {
    return components;
  }

  public void setComponents(List<AbstractComputer> components) {
    this.components = components;
  }

  public ComputerManager(List<AbstractComputer> decorations) {
    super();
    this.components = decorations;
  }

  public List<AbstractComputer> findDecorationsByType(EnumSet<ComputerTYPE> criterion) {
    List<AbstractComputer> foundDecorations = new LinkedList<AbstractComputer>();
    for (AbstractComputer currentDecor : this.components) {
      if (currentDecor.checkCriterion(criterion)) {
        foundDecorations.add(currentDecor);
      }
    }
    return foundDecorations;
  }
}
