package ua.lviv.iot.officeTools.manager;

import java.util.Comparator;
import java.util.List;

import ua.lviv.iot.officeTools.model.OfficeTool;
import ua.lviv.iot.officeTools.model.SortType;

public class OfficeToolsManagerUtils {

    private static final RulerSorterByProducerComparator RULER_SORTER_BY_PRODUCER_COMPARATOR = new OfficeToolsManagerUtils().new RulerSorterByProducerComparator();
    private static final RulerSorterByWeightInGrams OFFICE_TOOL_BY_WEIGHT_IN_GRAMS_SORTER = new RulerSorterByWeightInGrams();

    public static void sortByWeightInGrams(final List<OfficeTool> officeTool, final SortType sortType) {
        officeTool.sort(sortType == SortType.ASCENDING ? OFFICE_TOOL_BY_WEIGHT_IN_GRAMS_SORTER
                : OFFICE_TOOL_BY_WEIGHT_IN_GRAMS_SORTER.reversed());
    }

    public static class RulerSorterByWeightInGrams implements Comparator<OfficeTool> {

        @Override
        public int compare(OfficeTool firstRuler, OfficeTool SecondRuler) {
            return firstRuler.getWeightInGrams() - SecondRuler.getWeightInGrams();
        }
    }

    public static void sortByProducer(final List<OfficeTool> officeTool, final SortType sortType) {
        officeTool.sort(sortType == SortType.ASCENDING ? RULER_SORTER_BY_PRODUCER_COMPARATOR
                : RULER_SORTER_BY_PRODUCER_COMPARATOR.reversed());

    }

    public class RulerSorterByProducerComparator implements Comparator<OfficeTool> {
        @Override
        public int compare(OfficeTool firstRuler, OfficeTool SecondRuler) {
            return firstRuler.getProducer().compareTo(SecondRuler.getProducer());
        }
    }

    public static void sortByWeightInGramsUsingLambda(final List<OfficeTool> officeTool,
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

    public static void sortByProducerUsingAnonymClass(List<OfficeTool> officeTool, SortType sortType) {
        Comparator<OfficeTool> rulerSorterByProducer = new Comparator<OfficeTool>() {
            @Override
            public int compare(OfficeTool firstRuler, OfficeTool secondRuler) {
                return firstRuler.getProducer().compareTo(secondRuler.getProducer());
            }
        };
        officeTool.sort(sortType == SortType.ASCENDING ? rulerSorterByProducer : rulerSorterByProducer.reversed());
    }

}
