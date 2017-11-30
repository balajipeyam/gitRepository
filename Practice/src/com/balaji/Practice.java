package com.balaji;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

interface NewInterface {
	public void method();

}

public class Practice {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			int random = (int) (Math.random());
			// System.out.println(Math.random() * 4);
		}
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Balaji");
		map1.put(3, "Peyam");
		map1.put(2, "Algates");

		for (int s : map1.keySet())
			System.out.println(s + map1.get(s));

		List<Integer> intList = new ArrayList<Integer>();
		intList.add(2);
		intList.add(100);
		intList.add(1);
		/*
		 * Comparator<Integer> comp = (Integer a, Integer b) -> { return
		 * a.compareTo(b); }; Collections.sort(intList, comp);
		 */
		Collections.sort(intList, (a, b) -> a.compareTo(b));
		// Collections.sort(intList);
		System.out.println(intList.get(0));
		System.out.println(intList.get(1));
		System.out.println(intList.get(2));

		new Practice.NewInt().getInterface().method();

	}

	static class NewInt {
		public NewInterface getInterface() {
			return new NewInterface() {

				@Override
				public void method() {
					System.out.println("ANonymous");

				}
			};
		}

		public NewInt build() {
			return new NewInt();
		}
	}

}
