package ua.lviv.iot.officeTools.Writer;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

import ua.lviv.iot.officeTools.model.AbstractOfficeTool;

public class OfficeToolWriter {
    public Writer csvWriter;
    
    public void setCsvWriter(Writer csvWriter) {
        this.csvWriter = csvWriter;
    }
    
    public void writeIntoFile(List<AbstractOfficeTool> officeTools)  throws IOException {
        String informationToWrite;
        for (AbstractOfficeTool tool : officeTools) {
            informationToWrite = tool.toCSV() + "\r\n";
            csvWriter.write(informationToWrite);
        }
    }
    public String toString() {
       return csvWriter.toString();
    }    
}
