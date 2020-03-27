package ua.lviv.iot.officeTools.manager;

import java.util.Comparator;
import java.util.List;

import ua.lviv.iot.officeTools.model.AbstractOfficeTool;
import ua.lviv.iot.officeTools.model.SortType;

public class OfficeToolsManagerUtils {

	private static final RulerSorterByWeightInGrams OFFICE_TOOL_BY_WEIGHT_IN_GRAMS_SORTER = new RulerSorterByWeightInGrams();

	public static void sortByWeightInGrams(List<AbstractOfficeTool> officeTool, SortType sortType) {
		officeTool.sort(sortType == SortType.ASCENDING ? OFFICE_TOOL_BY_WEIGHT_IN_GRAMS_SORTER
				: OFFICE_TOOL_BY_WEIGHT_IN_GRAMS_SORTER.reversed());
	}
	
	static class RulerSorterByWeightInGrams implements Comparator<AbstractOfficeTool> {

		@Override
		public int compare(AbstractOfficeTool firstRuler, AbstractOfficeTool SecondRuler) {
			return firstRuler.getWeightInGrams() - SecondRuler.getWeightInGrams();
		}
	}
	
	public static void sortByPriceInUAH(List<AbstractOfficeTool> officeTool, SortType DESCENDING) {

	}



}
