package ua.lviv.iot.component;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.component.maneger.ComputerReader;
import ua.lviv.iot.component.maneger.ComputerWriter;

import java.io.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComputerReaderWriterTest extends ComputerComponentManagerTest {
  String expectedString;

  ComputerWriter computerWriter;
  ComputerReader computerReader;

  @BeforeEach
  public void setUp() {
    createComponents();
    expectedString = "color, priceInHryvnas, brand, power\r\n" +
            "null, aaa, null, 10.0\r\n" +
            "null, bab, null, 11.0\r\n" +
            "null, baa, null, 15.0\r\n" +
            "null, aba, null, 32.0\r\n" +
            "null, abb, null, 45.0, [monitor, block system, keyboard]\r\n";
    computerWriter = new ComputerWriter();
    computerReader = new ComputerReader();
  }

  @Test
  void testWriteAndReadToFile() {
    try (Writer writer = new FileWriter("Output.csv");) {
      computerWriter.setWriter(writer);
      computerWriter.writeToFile(components);
    } catch (IOException e) {
      e.printStackTrace();
    }
    try (Reader reader = new FileReader("Output.csv");) {
      computerReader.setReader(reader);
      String finalReturn = computerReader.readFromFile();
      System.out.println(finalReturn);
      assertEquals(expectedString, finalReturn);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Test
  void testWriteToFile() {
    try (Writer writer = new FileWriter("Output.csv");) {
      computerWriter.setWriter(writer);
      computerWriter.writeToFile(components);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Test
  void testStringWriter() {
    try (Writer writer = new StringWriter();) {
      computerWriter.setWriter(writer);
      computerWriter.writeToFile(components);
      assertEquals(expectedString, computerWriter.toString());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}