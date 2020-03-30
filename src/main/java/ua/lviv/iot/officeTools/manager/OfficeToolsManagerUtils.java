package ua.lviv.iot.officeTools.manager;

import java.util.Comparator;
import java.util.List;

import ua.lviv.iot.officeTools.model.AbstractOfficeTool;
import ua.lviv.iot.officeTools.model.SortType;

public class OfficeToolsManagerUtils {

	private static final RulerSorterByWeightInGrams OFFICE_TOOL_BY_WEIGHT_IN_GRAMS_SORTER = new RulerSorterByWeightInGrams();

	public static void sortByWeightInGrams(final List<AbstractOfficeTool> officeTool, SortType sortType) {
		officeTool.sort(sortType == SortType.ASCENDING ? OFFICE_TOOL_BY_WEIGHT_IN_GRAMS_SORTER
				: OFFICE_TOOL_BY_WEIGHT_IN_GRAMS_SORTER.reversed());
	}

	public static class RulerSorterByWeightInGrams implements Comparator<AbstractOfficeTool> {

		@Override
		public int compare(AbstractOfficeTool firstRuler, AbstractOfficeTool SecondRuler) {
			return firstRuler.getWeightInGrams() - SecondRuler.getWeightInGrams();
		}
	}

	public static void sortByProducer(final List<AbstractOfficeTool> officeTool, final SortType sortType) {
		officeTool.sort(sortType == SortType.ASCENDING ? new OfficeToolsManagerUtils().new RulerSorterByProducerComparator()
				: new OfficeToolsManagerUtils().new RulerSorterByProducerComparator().reversed());

	}

	public class RulerSorterByProducerComparator implements Comparator<AbstractOfficeTool> {
		@Override
		public int compare(AbstractOfficeTool firstRuler, AbstractOfficeTool SecondRuler) {
			return firstRuler.getProducer().compareTo(SecondRuler.getProducer());
		}
	}

	public static void sortByWeightInGramsUsingLambda(final List<AbstractOfficeTool> officeTool,
			final SortType sortType) {
		if (sortType == SortType.ASCENDING) {
			officeTool.sort((firstRuler, secondRuler) -> Double.compare(firstRuler.getWeightInGrams(),
					secondRuler.getWeightInGrams()));
		}

		else {
			officeTool.sort((firstRuler, secondRuler) -> Double.compare(secondRuler.getWeightInGrams(),
					firstRuler.getWeightInGrams()));
		}
	}

	public static void sortByProducerUsingAnonymClass(List<AbstractOfficeTool> officeTool, SortType sortType) {
		Comparator<AbstractOfficeTool> rulerSorterByProducer = new Comparator<AbstractOfficeTool>() {
			@Override
			public int compare(AbstractOfficeTool firstRuler, AbstractOfficeTool secondRuler) {
				return firstRuler.getProducer().compareTo(secondRuler.getProducer());
			}
		};
		officeTool.sort(sortType == SortType.ASCENDING ? rulerSorterByProducer : rulerSorterByProducer.reversed());
	}

}
