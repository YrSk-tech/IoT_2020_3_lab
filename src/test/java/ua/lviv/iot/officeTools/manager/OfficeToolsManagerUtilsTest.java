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
		assertEquals(150, ruler.get(2).getWeightInGrams());
		assertEquals(200, ruler.get(3).getWeightInGrams());
		
	}

	@Test
	public void testSortDescending() {
		OfficeToolsManagerUtils.sortByProducer(ruler, SortType.DESCENDING);
		assertEquals("Ukraine", ruler.get(0).getProducer());
		assertEquals("Poland", ruler.get(1).getProducer());
		assertEquals("Germany", ruler.get(2).getProducer());
		assertEquals("China", ruler.get(3).getProducer());
	}
	
	@Test
	public void testSortUsingLambdaAscending() {
		OfficeToolsManagerUtils.sortByWeightInGramsUsingLambda(ruler, SortType.ASCENDING);
		assertEquals(55, ruler.get(0).getWeightInGrams());
		assertEquals(120, ruler.get(1).getWeightInGrams());
		assertEquals(150, ruler.get(2).getWeightInGrams());
		assertEquals(200, ruler.get(3).getWeightInGrams());
	}
	
	@Test
	public void testSortProducerUsingAnonymClassDescending() {
		OfficeToolsManagerUtils.sortByProducerUsingAnonymClass(ruler, SortType.DESCENDING);
		assertEquals("Ukraine", ruler.get(0).getProducer());
		assertEquals("Poland", ruler.get(1).getProducer());
		assertEquals("Germany", ruler.get(2).getProducer());
		assertEquals("China", ruler.get(3).getProducer());
	}

}
