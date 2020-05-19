package ua.lviv.iot.component.maneger;

import ua.lviv.iot.component.model.AbstractComputer;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

public class ComputerWriter {
  Writer textWriter;

  public Writer getWriter() {
    return textWriter;
  }

  public void setWriter(Writer textWriter) {
    this.textWriter = textWriter;
  }

  public void writeToFile(List<AbstractComputer> abstractComputers) throws IOException {
    writeLine(textWriter, abstractComputers.get(0).getHeaders());
    for (AbstractComputer abstractComputer : abstractComputers) {
      writeLine(textWriter, abstractComputer.toCSV());
    }
    textWriter.flush();
  }

  public void writeLine(Writer writer, String string) throws IOException {
    writer.write(string + "\r\n");
  }

  @Override
  public String toString() {
    return textWriter.toString();
  }
}