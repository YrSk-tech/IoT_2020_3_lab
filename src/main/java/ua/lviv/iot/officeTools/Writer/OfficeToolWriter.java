package ua.lviv.iot.officeTools.Writer;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

import ua.lviv.iot.officeTools.model.OfficeTool;

public class OfficeToolWriter {
    public Writer csvWriter;
    
    public void setCsvWriter(Writer csvWriter) {
        this.csvWriter = csvWriter;
    }
    
    public void writeIntoFile(List<OfficeTool> officeTools)  throws IOException {
        String informationToWrite;
        csvWriter.write(getHeaders() + "\r\n");
        for (OfficeTool tool : officeTools) {
            informationToWrite = tool.toCSV() + "\r\n";
            csvWriter.write(informationToWrite);
        }
    }
    
    public String toString() {
       return csvWriter.toString();
    }  
    
    public String getHeaders() {
        return  "producer, priceInUAH, brand, colour, weightInGrams, warrantyInDays";
    }
}
