package com.exercise;

import java.util.ArrayList;

public class ConvergetnPoint {

	static ArrayList<Integer> al, bl;
	static {
		al = new ArrayList<Integer>();
		bl = new ArrayList<Integer>();

	}

	public static int convergentPoint(int a, int b) {

		while (a != 1) {
			al.add(a);
			if (a % 2 == 0)
				a = a / 2;
			else
				a = a * 3 + 1;
		}
		while (b != 1) {
			bl.add(b);
			if (b % 2 == 0)
				b = b / 2;
			else
				b = b * 3 + 1;
		}
		al.add(a);
		bl.add(b);
		System.out.println("Generated Sequence for "+al.get(0)+" "+al);
		System.out.println("Generated Sequence for "+bl.get(0)+" "+bl);

		for (int i : al) {
			for (int j : bl) {
				if (i == j) {
					return i;
				}

			}
		}
		return 0;

	}

	public static void main(String[] args) {

		System.out.println(convergentPoint(24, 21));

	}

}
