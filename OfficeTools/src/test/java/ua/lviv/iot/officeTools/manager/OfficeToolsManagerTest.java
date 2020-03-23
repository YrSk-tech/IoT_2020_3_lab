package ua.lviv.iot.officeTools.manager;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.officeTools.model.AbstractOfficeTool;
import ua.lviv.iot.officeTools.model.Colour;

class OfficeToolsManagerTest extends BaseOfficeToolsManagerTest {
	private OfficeToolsManager officeToolsManager;

	List<AbstractOfficeTool> findRuler;

	@BeforeEach
	public void setUp() {
		officeToolsManager = new OfficeToolsManager();
		findRuler = new ArrayList<>();
	}

	@Test
	public void testFindByColour() {
		findRuler = OfficeToolsManager.findByColour(ruler, Colour.WHITE);
		assertEquals(1, findRuler.size());
	}
}
