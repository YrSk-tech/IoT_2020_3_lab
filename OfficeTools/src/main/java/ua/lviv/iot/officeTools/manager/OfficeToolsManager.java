package ua.lviv.iot.officeTools.manager;

import java.util.ArrayList;
import java.util.List;

import ua.lviv.iot.officeTools.model.AbstractOfficeTool;
import ua.lviv.iot.officeTools.model.Colour;

public class OfficeToolsManager {
	public static List<AbstractOfficeTool> findByColour(List<AbstractOfficeTool> officeTool, Colour colours) {
		List<AbstractOfficeTool> ruler = new ArrayList<>();

		for (AbstractOfficeTool tool : officeTool) {
			if (tool.getColour() == colours) {
				ruler.add(tool);
			}
		}
		return ruler;
	}
}
