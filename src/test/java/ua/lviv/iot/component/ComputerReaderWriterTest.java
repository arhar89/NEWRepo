package ua.lviv.iot.component;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.component.maneger.ComputerWriter;
import ua.lviv.iot.component.model.AbstractComputer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComputerReaderWriterTest {
  private static final String OUTPUT_FILE_PATH = "objects.csv";
  ComputerWriter computerWriter;

  @BeforeEach
  void setUp() {
    createComponents();
    computerWriter = new ComputerWriter();
  }

  private void createComponents() {
  }

  @Test
  void testDecorFileWriter() {
    try (Writer fileWriter = new FileWriter(OUTPUT_FILE_PATH);) {
      computerWriter.setTextWriter(fileWriter);
      List<AbstractComputer> components = null;
      computerWriter.writeToFile(components);
    } catch (IOException e) {

      e.printStackTrace();
    }
  }

  @Test
  void testDecorStringWriter() {
    List<AbstractComputer> components = null;
    try (Writer stringWriter = new StringWriter();) {
      computerWriter.setTextWriter(stringWriter);
      computerWriter.writeToFile(components);
    } catch (IOException e) {
      e.printStackTrace();
    }

    String expectedString = "";
    for (AbstractComputer currentComputer : components) {
      expectedString += currentComputer.getHeaders() + ", " + currentComputer.toCSV() + "\r\n";
    }

    assertEquals(expectedString, computerWriter.toString());
  }
}
