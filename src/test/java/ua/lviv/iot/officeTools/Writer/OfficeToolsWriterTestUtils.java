package ua.lviv.iot.officeTools.Writer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import org.junit.jupiter.api.Test;

import ua.lviv.iot.officeTools.manager.BaseOfficeToolsManagerTest;
import ua.lviv.iot.officeTools.model.AbstractOfficeTool;

public class OfficeToolsWriterTestUtils extends BaseOfficeToolsManagerTest  {
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
    try (Writer csvWriter = new StringWriter()){
        OfficeToolWriter writer = new OfficeToolWriter();
        String expectedField = ",";
        for (AbstractOfficeTool tool : ruler) {
            expectedField += tool.toCSV();
        }
        assertEquals(expectedField, writer.toString());
        }
    }
}
