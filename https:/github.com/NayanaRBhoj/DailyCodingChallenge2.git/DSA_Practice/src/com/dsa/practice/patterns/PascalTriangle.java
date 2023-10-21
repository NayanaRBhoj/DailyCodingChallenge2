package com.dsa.practice.patterns;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // Take input from the user
		System.out.print("Enter the number of rows : ");

		int r = sc.nextInt(); // Initialize the number of rows
		method3(r);
	}

	public static void method3(int r) {
		List<List<Integer>> result = new ArrayList<>();
		for (int i = 1; i <= r; i++) {
			for (int k = r; k > i; k--) {
				System.out.print(" ");
			}
			List<Integer> row = new ArrayList();
			for (int j = 0; j < i; j++) {
				if (j == 0 || j == i-1) {
					row.add(1);
					System.out.print(1 + " ");
				} else {
					System.out.print(result.get(i-2).get(j)+result.get(i-2).get(j-1) + " ");
					row.add(result.get(i-2).get(j)+result.get(i-2).get(j-1));
				}
			}
			result.add(row);
			System.out.println();
		}
	}

	public static void method1(int r) {
		int i, j, k, l; // Declaring Variables
		int a[] = new int[30]; // Declare a 1d array
		// For Pascal Triangle
		for (i = 0; i < r; i++) // Iterate through all the rows
		{
			for (k = r; k > i; k--) // Print the number of spaces
			{
				System.out.print(" ");
			}
			a[i] = 1; // Initialize the first element of each row as 1
			for (j = 0; j <= i; j++) // To find the Pascal triangle element
			{
				System.out.print(a[i] + " "); // Print the array elements
				a[i] = a[i] * (i - j) / (j + 1); // Store the pascal triangle elements in an array
			}
			System.out.println(); // To move to the next line
		}
	}

	public static void method2(int num) {

		int i, j, k, l; // Declaring Variables
		int array[] = new int[30]; // using 1d array
		int temp[] = new int[30]; // using 1d array

		temp[0] = 1; // Initializing first variable of the array as 1
		array[0] = 1; // Initializing first variable of the array as 1

		System.out.println("1"); // For first element
		for (i = 1; i < num; i++) // To iterate through all the rows
		{
			for (j = 0; j < i; j++) // To print the space
				System.out.print("");
			for (k = 1; k < num; k++) {
				array[k] = temp[k - 1] + temp[k]; // Initialize the array to store the pascal triangle elements
			}
			array[i] = 1;
			for (l = 0; l <= i; l++) {
				System.out.print(array[l] + " "); // Print the array elements
				temp[l] = array[l]; // Copy the array elements to another array
			}
			System.out.println(); // For next line
		}
	}
}
