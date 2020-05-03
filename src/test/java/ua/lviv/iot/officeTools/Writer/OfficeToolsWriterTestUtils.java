package ua.lviv.iot.officeTools.Writer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import org.junit.jupiter.api.Test;

import ua.lviv.iot.officeTools.manager.BaseOfficeToolsManagerTest;
import ua.lviv.iot.officeTools.model.OfficeTool;

public class OfficeToolsWriterTestUtils extends BaseOfficeToolsManagerTest {
    @Test
    public void testWriteIntoFile() throws IOException {
        try (Writer rulerFileWriter = new FileWriter("RulerFile.csv")) {
            OfficeToolWriter writer = new OfficeToolWriter();
            writer.setCsvWriter(rulerFileWriter);
            writer.writeIntoFile(ruler);
        }
    }

    @Test
    public void testWriteIntoFileUsingString() throws IOException {
        try (Writer csvWriter = new StringWriter()) {
            OfficeToolWriter writer = new OfficeToolWriter();
            writer.setCsvWriter(csvWriter);
            writer.writeIntoFile(ruler);
            String expectedField = "";
            for (OfficeTool tool : ruler) {
                expectedField += tool.toCSV() + "\r\n";
            }
            assertEquals(expectedField, writer.toString());
        }
    }
}
