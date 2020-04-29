package ua.lviv.iot.component.model;

public class ComputerException extends Exception {
  public ComputerException(String message) {
    super(message);
  }

  public ComputerException(RuntimeException e) {
    super(e);
  }

  private static final long serialVersionUID = 1L;

}

