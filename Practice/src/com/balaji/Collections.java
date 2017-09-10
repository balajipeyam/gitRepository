package com.balaji;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Collections {
	public static void main(String[] args) {
		String a = "balaji";
		String b = "Peyam";
		System.out.println(b.compareTo(a));
		System.out.println(a.compareTo(b));
		Set<String> set = new TreeSet<String>();
		List<String> list = new LinkedList<String>();
		Map<String, String> map = new HashMap<String, String>();
		list.add(a);
		list.add(b);
		list.add(null);

		set.add(a);
		set.add(b);
		set.add(a);
		// set.add(null);

		map.put(a, b);
		map.put(b, a);
		// map.put(a, a);

		Iterator<String> iterator = list.iterator();
		Iterator<String> itr2 = set.iterator();
		Iterator itr3 = map.entrySet().iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("\n");
		/*
		 * while (itr2.hasNext()) { System.out.println(itr2.next()); }
		 */
		for (String s : set) {
			System.out.println(s);
		}
		System.out.println("\n");
		while (itr3.hasNext()) {
			System.out.println(itr3.next());
		}

	}
}
