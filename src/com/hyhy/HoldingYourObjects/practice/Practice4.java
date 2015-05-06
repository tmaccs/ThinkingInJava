package com.hyhy.HoldingYourObjects.practice;

import java.util.ArrayList;
import java.util.*;
import java.util.Collection;
import java.util.LinkedList;
import static net.mindview.util.Print.*;


public class Practice4 {
	private static final MovieNameGenerator mng = new MovieNameGenerator();

	static String[] fill(String[] array) {
		for (int i = 0; i < array.length; i++)
			array[i] = mng.next();
		return array;
	}

	static Collection<String> fill(Collection<String> collection) {
		for (int i = 0; i < 5; i++)
			collection.add(mng.next());
		return collection;
	}

	public static void main(String[] args) {
		print(Arrays.toString(fill(new String[5])));
		print(fill(new ArrayList<String>()));
		print(fill(new LinkedList<String>()));
		print(fill(new HashSet<String>()));
		print(fill(new LinkedHashSet<String>()));
		print(fill(new TreeSet<String>()));
	}
}

class MovieNameGenerator {
	String[] characters = { "Grumpy", "Happy", "Sleepy", "Dopey", "Doc",
			"Sneezy", "Bashful", "Snow White", "Witch Queen", "Prince" };
	int next;

	public String next() {
		String r = characters[next];
		next = (next + 1) % characters.length;
		return r;
	}
}