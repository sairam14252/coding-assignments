package com.infy.ordersprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Sorting Based On Map
public class OrderOccurrences {

	static ArrayList<String> list = new ArrayList();

	public static void countFrequencies(Map<String, List> resultMap) {

		ArrayList<String> keyList = new ArrayList<String>(resultMap.keySet());
		ArrayList valueList = new ArrayList<List>(resultMap.values());

		for (Object i : valueList) {

			String listString = (String) ((Collection) i).stream().map(Object::toString)
					.collect(Collectors.joining(","));

			list.add(listString);

		}

		Map<String, Integer> hm = new HashMap<String, Integer>();

		for (String i : list) {
			Integer j = hm.get(i);
			hm.put(i, (j == null) ? 1 : j + 1);
		}

		// Displaying The Occurrence Of Elements In The Arraylist
		for (Map.Entry<String, Integer> val : hm.entrySet()) {
			System.out.println(val.getKey() + " " + "Usage Count" + ": " + val.getValue() + " times");
		}
	}

	public static void main(String[] args) {

		HashMap<String, List<String>> map = new HashMap<String, List<String>>();
		HashMap<String, List<String>> map1 = new HashMap<String, List<String>>();
		HashMap<String, List<String>> map2 = new HashMap<String, List<String>>();
		HashMap<String, List<String>> map3 = new HashMap<String, List<String>>();

		map.put("order1", Arrays.asList("item1", "item2"));

		map1.put("order2", Arrays.asList("item3"));
		map2.put("order3", Arrays.asList("item2"));
		map3.put("order4", Arrays.asList("item1", "item2"));

		Map<String, List> resultMap = Stream
				.concat(Stream.concat(map.entrySet().stream(), map1.entrySet().stream()),
						Stream.concat(map2.entrySet().stream(), map3.entrySet().stream()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (value1, value2) -> value2));

		countFrequencies(resultMap);
	}

}
