package ua.lviv.iot.officeTools.manager;

import java.util.ArrayList;
import java.util.List;

import ua.lviv.iot.officeTools.model.OfficeTool;
import ua.lviv.iot.officeTools.model.Colour;

public class OfficeToolsManager {
    public static List<OfficeTool> findByColour(List<OfficeTool> officeTool, Colour colours) {
        List<OfficeTool> ruler = new ArrayList<>();

        for (OfficeTool tool : officeTool) {
            if (tool.getColour() == colours) {
                ruler.add(tool);
            }
        }
        return ruler;
    }
}
