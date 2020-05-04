package ua.lviv.iot.component.maneger;

import java.io.IOException;
import java.io.Reader;

public class ComputerReader {

  Reader reader;

  public void setReader(Reader reader) {
    this.reader = reader;
  }

  public String readFromFile() throws IOException {
    String returnString = "";
    int oneCharInInt = reader.read();
    while (oneCharInInt != -1) {
      returnString = returnString + (char) oneCharInInt;
      oneCharInInt = reader.read();
    }
    return returnString;
  }

}