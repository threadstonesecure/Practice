package com.practice.sorting;

import java.util.Arrays;

public class InsertionSorting {
	public static void main(String[] args) {
		int a[] = { 5, 1, 6, 2, 4, 3 };
		int i, j, key;
		for (i = 1; i < a.length; i++) {
			System.out.println(Arrays.toString(a));
			j = i - 1;
			key = a[i];
			while (j >= 0 && key < a[j]) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = key;
		}
		System.out.println(Arrays.toString(a));
	}
}
