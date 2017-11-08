package javaapplication14;

import java.util.Arrays;
import java.util.Random;

public class SolveBoringProblem {

	public static void main(String[] args) {
		int[] boringNumbers = new int[50];
		fillBoringNumbers(boringNumbers);
		System.out.println("Boring numbers:" + Arrays.toString(boringNumbers));
		
		SimpleTable st = new SimpleTable();
		for (int i = 0; i < boringNumbers.length; i++) {
			st.add(boringNumbers[i]);
		}
		System.out.println("Unique numbers: " + st.toString());
	}

	public static void fillBoringNumbers(int[] boringNumbers) {
		Random r = new Random(42);
		for (int i = 0; i < boringNumbers.length; i++) {
			boringNumbers[i] = r.nextInt(100) + 1;
		}
	}

}
