package com.interview.program;
import java.util.Arrays;
public class Sortandremove {
	public static void main(String[] args) {
		int count = 0;
		int arr[] = { 2, 3, 4, 5, 65, 4, 3, 2, 1 };
		// To find duplicate value in array
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					System.out.println(arr[i]);
			}
		}
		// sort arrays
		Arrays.sort(arr);
		//
		int temp[] = new int[arr.length];
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1])
				temp[count++] = arr[i];
		}
		temp[count] = arr[arr.length - 1];

		for (int i : temp) {
			if (i != 0)
				System.out.println(i);
		}
	}
}