package com.practice.sorting;

public class MergeSort {
	public static void main(String[] args) {
		int a[] = { 32, 45, 67, 2, 7 };
		mergesort(a, 0, 4);
	}

	private static void mergesort(int a[], int p, int r) {
		int q;
		if (p < r) {
			q = (int) Math.floor((p + r) / 2);
			mergesort(a, p, q);
			mergesort(a, q + 1, r);
			merge(a, p, q, r);
		}
	}

	private static void merge(int a[], int p, int q, int r) {
		int b[] = new int[5]; // same size of a[]
		int i, j, k;
		k = 0;
		i = p;
		j = q + 1;
		while (i <= q && j <= r) {
			if (a[i] < a[j]) {
				b[k++] = a[i++]; // same as b[k]=a[i]; k++; i++;
			} else {
				b[k++] = a[j++];
			}
		}

		while (i <= q) {
			b[k++] = a[i++];
		}

		while (j <= r) {
			b[k++] = a[j++];
		}

		for (i = r; i >= p; i--) {
			a[i] = b[--k]; // copying back the sorted list to a[]
		}

	}
}
