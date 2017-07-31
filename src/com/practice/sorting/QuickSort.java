package com.practice.sorting;

public class QuickSort {
	public static void main(String[] args) {
		int a[] = { 25, 52, 37, 63, 14, 17, 8, 6 };
		quicksort(a, 0, 7);
	}

	private static void quicksort(int a[], int p, int r) {
		if (p < r) {
			int q;
			q = partition(a, p, r);
			quicksort(a, p, q);
			quicksort(a, q + 1, r);
		}
	}

	private static int partition(int a[], int p, int r) {
		int i, j, pivot, temp;
		pivot = a[p];
		i = p;
		j = r;
		while (true) {
			while (a[i] < pivot && a[i] != pivot)
				i++;
			while (a[j] > pivot && a[j] != pivot)
				j--;
			if (i < j) {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			} else {
				return j;
			}
		}
	}
}
