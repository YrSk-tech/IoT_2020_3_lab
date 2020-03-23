package ua.lviv.iot.officeTools.manager;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;

import ua.lviv.iot.officeTools.model.AbstractOfficeTool;
import ua.lviv.iot.officeTools.model.Brand;
import ua.lviv.iot.officeTools.model.Colour;
import ua.lviv.iot.officeTools.model.Ruler;

public abstract class BaseOfficeToolsManagerTest {

	protected List<AbstractOfficeTool> ruler;

	@BeforeEach
	public void createRulers() {
		ruler = new ArrayList<>();
		ruler.add(new Ruler("Ukraine", 150, Brand.LEVENHUK, Colour.BLACK, 55, 61, 50));
		ruler.add(new Ruler("Poland", 130, Brand.BUROMAX, Colour.WHITE, 120, 31, 30));
		ruler.add(new Ruler("China", 80, Brand.REXEL_JOY, Colour.GREEN, 200, 0, 100));
	}
}
