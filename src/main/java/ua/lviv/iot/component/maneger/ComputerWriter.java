package ua.lviv.iot.component.maneger;

import ua.lviv.iot.component.model.AbstractComputer;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

public class ComputerWriter {
  Writer textWriter;

  public void setTextWriter(Writer textWriter) {
    this.textWriter = textWriter;
  }

  public void writeToFile(List<AbstractComputer> components) throws IOException {
    for (AbstractComputer currentComputer : components) {
      String lineToWrite = currentComputer.getHeaders() + ", " + currentComputer.toCSV();
      writeLine(textWriter, lineToWrite);
    }
    textWriter.flush();
  }

  private void writeLine(Writer writer, String text) throws IOException {
    writer.write(text + "\r\n");
  }

  @Override
  public String toString() {
    return textWriter.toString();
  }

}
