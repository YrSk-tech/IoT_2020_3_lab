package ua.lviv.iot.officeTools.manager;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ua.lviv.iot.officeTools.model.SortType;

public class OfficeToolsManagerUtilsTest extends BaseOfficeToolsManagerTest {

	@Test
	public void testSortAscending() {
		OfficeToolsManagerUtils.sortByWeightInGrams(ruler, SortType.ASCENDING);
		assertEquals(55, ruler.get(0).getWeightInGrams());
		assertEquals(120, ruler.get(1).getWeightInGrams());
		assertEquals(200, ruler.get(2).getWeightInGrams());
	}

	@Test
	public void testSortDescending() {
		OfficeToolsManagerUtils.sortByPriceInUAH(ruler, SortType.DESCENDING);
		assertEquals(150, ruler.get(0).getPriceInUAH());
		assertEquals(130, ruler.get(1).getPriceInUAH());
		assertEquals(80, ruler.get(2).getPriceInUAH());
	}

}
