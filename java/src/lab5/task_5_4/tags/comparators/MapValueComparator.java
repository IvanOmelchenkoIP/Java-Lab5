package lab5.task_5_4.tags.comparators;

import java.util.Comparator;
import java.util.Map;

public class MapValueComparator implements Comparator<Map.Entry<String, Integer>> {

	@Override
	public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
		return Integer.compare(o1.getValue().intValue(), o2.getValue().intValue());
	}

}
