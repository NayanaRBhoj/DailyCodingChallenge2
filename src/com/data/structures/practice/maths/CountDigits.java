package com.data.structures.practice.maths;

import java.util.Scanner;

public class CountDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println(number + " has " + countDigits(number) + " digits.");
		sc.close();
	}
	public static int countDigits(int n){
        // Write your code here.
        int digitCount = 1;
        while(n / 10 >= 1) {
            digitCount++;
            n = (int) (n / 10);
        }
        return digitCount;
    }
}
