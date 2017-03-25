package com.kgd.epam;

import java.util.Random;

public class Sorting {

	public static void selectSort(int[] a) {
		int k;
		int x;

		for (int i = 0; i < a.length; i++) {
			k = i;
			x = a[i];

			for (int j = i + 1; j < a.length; j++) {

				if (a[j] < x) {
					k = j;
					x = a[j];
				}
			}

			a[k] = a[i];
			a[i] = x;
		}

	}

	public static void bubbleSort(int[] a) {
		int x;

		for (int i = 0; i < a.length; i++) {
			for (int j = a.length - 1; j > i; j--) {
				if (a[j - 1] > a[j]) {
					x = a[j - 1];
					a[j - 1] = a[j];
					a[j] = x;
				}
			}
		}
	}

	public static void insertSort(int[] a) {
		int x;
		int j;

		for (int i = 0; i < a.length; i++) {

			x = a[i];

			for (j = i - 1; j >= 0 && a[j] > x; j--) {
				a[j + 1] = a[j];
			}
			a[j + 1] = x;
		}
	}

	public static void qSort(int[] a, int l, int r) {
		Random rand = new Random();
		int i = l;
		int j = r;
		int x = a[l + rand.nextInt(r - l + 1)];
		while (i <= j) {
			while (a[i] < x) {
				i++;
			}
			while (a[j] > x) {
				j--;
			}
			if (i <= j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		}
		if (l < j) {
			qSort(a, l, j);
		}
		if (i < r) {
			qSort(a, i, r);
		}
	}

}
