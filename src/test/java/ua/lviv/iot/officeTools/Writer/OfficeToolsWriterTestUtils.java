package ua.lviv.iot.officeTools.Writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import org.junit.jupiter.api.Test;

import ua.lviv.iot.officeTools.manager.BaseOfficeToolsManagerTest;
import ua.lviv.iot.officeTools.model.AbstractOfficeTool;

public class OfficeToolsWriterTestUtils extends BaseOfficeToolsManagerTest  {
    @Test
    public static String readFirstLineFromFile() throws IOException {
        try (Writer rulerWriter = new FileWriter("RulerFile.csv")) {
            OfficeToolWriter writer = new OfficeToolWriter();
            writer.setCsvWriter(rulerWriter);
        }
        return null;
    }
    
}
