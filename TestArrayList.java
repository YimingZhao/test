package test;

import java.util.ArrayList;

public class TestArrayList {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < 1000; i++) {
			list.add("sh" + i);
		}

		for (int i = 0; list.iterator().hasNext(); i++) {
			list.remove(i);
			System.out.println("ÃØÃÜ" + list.get(i));
		}

	}

}
