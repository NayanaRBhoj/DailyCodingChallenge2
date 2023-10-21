package com.dsa.practice.patterns;

import java.util.Scanner;

/***
 * Striver SDE sheet all kind of patterns we are going solve here, total 22 patterns are solved here.
 * link -> "https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/"
 * There are 4 general rules for solving a pattern-based question 
 * 1) We always use nested loops for printing the patterns. For the outer loop, we count the number of lines/rows and loop for them.
 * 2) Next, for the inner loop, we focus on the number of columns and somehow connect them to the rows by forming a logic such that for each row we get the required number of columns to be printed.
 * 3) We print the ‘*’ inside the inner loop.
 * 4) Observe symmetry in the pattern or check if a pattern is a combination of two or more similar patterns or not.
 */

public class Patterns {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

	
		System.out.println("Rectangular star pattern");
		// pattern1(N);

		System.out.println("Right-Angled Triangle star pattern");
		// pattern2(N);

		System.out.println("Right-Angled Number Pyramid");
		// pattern3(N);

		System.out.println("Right-Angled Number Pyramid - II");
		// pattern4(N);

		System.out.println("Inverted Right Pyramid starts");
		// pattern5(N);

		System.out.println("Inverted Numbered Right Pyramid");
		// pattern6(N);

		System.out.println("Star Pyramid");
		// pattern7(N);
		
		System.out.println("Inverted Star Pyramid");
		// pattern8(N);

		System.out.println("Diamond Star Pattern");
		// pattern9(N);
		
		System.out.println("Half Diamond Star Pattern");
		// pattern10(N);
		
		System.out.println("Binary Number Triangle Pattern");
		// pattern11(N);
		
		System.out.println("Number Crown Pattern");
		// pattern12(N);
		
		System.out.println("Increasing Number Triangle Pattern");
		// pattern13(N);
		
		System.out.println("Increasing Letter Triangle Pattern");
		// pattern14(N);
		
		System.out.println("Reverse Letter Triangle Pattern");
		// pattern15(N);
		
		System.out.println("Reverse Letter Triangle Pattern");
		pattern16(N);
		
		sc.close();

	}
	
	// Alpha-Ramp Pattern
	//A 
	//B B
	//C C C
	//D D D D
	//E E E E E
	public static void pattern16(int N) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char)('A' + i) + " ");
			}
			System.out.println();
		}
	}
	
	
	// Reverse Letter Triangle Pattern
	//A B C D E 
	//A B C D
	//A B C
	//A B
	//A
	public static void pattern15(int N) {
		for (int i = N; i > 0; i--) {
			for(char ch = 'A'; ch<'A'+i;ch++){
	            System.out.print(ch + " ");
	        }
			System.out.println();
		}
	}
	
	// Increasing Letter Triangle Pattern
	//A
	//A B
	//A B C
	//A B C D
	//A B C D E
	public static void pattern14(int N) {
		for(int i = 0; i < N; i++) {
		for(char ch = 'A'; ch<='A'+i;ch++){
            System.out.print(ch + " ");
        }
		System.out.println();
		}
	}
	
	// Increasing Number Triangle Pattern
	//1
	//2  3
	//4  5  6
	//7  8  9  10
	//11  12  13  14  15
	public static void pattern13(int N) {
		int counter = 1;
		for(int i = 1; i <= N; i++) {
			
			for(int j = 1; j <= i; j++) {
				System.out.print(counter+" ");
				counter = counter + 1;
			}
			System.out.println();
		}
			
	}
	
	
	// Number Crown Pattern
	// 1          1
	// 12        21
	// 12       321
	// 1234    4321
	// 12345  54321
	// 123456654321
	public static void pattern12(int N) {
		int spaces = 2*(N-1);
		for(int i = 1; i <= N; i++) {
			// We will find no of space, no of starts and then no of spaces
			// [Numbers - Spaces - Numbers]
			// 1st inner loop to find spaces
			for(int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for(int k = 1; k <= spaces; k++) {
				System.out.print("*");
			}
			for(int l = i; l >= 1; l--) {
				System.out.print(l);
			}
			System.out.println();
			spaces-=2;
		}
	}
	
	// Binary Number Triangle Pattern
	// Tough it looks like binary representation of numbers but it can achieved by following way as well.
	// 1
	// 0 1
	// 1 0 1
	// 0 1 0 1
	// 1 0 1 0 1
	public static void pattern11(int N) {
		int start = 1;
		for(int i = 0; i <= N; i++) {
			//check if row is even or odd, if row is even then it starts with 1.
			// i = 0,2,4 start = 1
			// i = 1,3,5 start = 0
			// after getting start point just flip 1 <-> 0 and 0 <-> 1
			if(i % 2 == 0) {
				start = 1;
			} else {
				start = 0;
			}
			for(int j = 0; j <= i; j++) {
				System.out.print(start);
				start = 1 - start;
			}
			System.out.println();
		}
	}
	
	// Half Diamond Star Pattern
	// N = 5
	// Outer loop  = 2N-1 = 9
	// Inner loop till N its simple increased by 1
	// *
	// * *
	// * * *
	// * * * *
	// * * * * *
	// * * * *
	// * * *
	// * *
	// *
	public static void pattern10(int N) {
		
		for(int i = 0; i <= 2*N -1; i++) {
			int stars = i;
			if(i>N) {
				stars = 2 * N - i;
			}
			for(int j = 0; j < stars; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// Diamond Star Pattern
	// combine Star pyramid and inverted start pyramid
	public static void pattern9(int N) {
		pattern7(N);
		pattern8(N);
	}
	
	// Inverted Star Pyramid
	// N = 5
	// [space - Stars - Spaces]
	// *********[0-9-0] 2N-1-2*i i=0 10-1-1 = 9
	//  ******* [1-7-1] 2N-1-2*i i=1 10-1-2 = 7
	//   *****  [2-5-2] 2N-1-2*i i=2 10-1-4 = 5 
	//    ***   [3-3-3] 2N-1-2*i i=3 10-1-6 = 3
	//     *    [4-1-4] 2N-1-2*i i=4 10-1-8 = 1
	public static void pattern8(int N) {
		for(int i = 0; i < N; i++) {
			// We will find no of space, no of starts and then no of spaces
			// [space - Stars - Spaces]
			// 1st inner loop to find spaces
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < ((2*N)-1-(2*i)); k++) {
				System.out.print("*");
			}
			for(int l = 0; l < i; l++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	
	}
	
	// Star Pyramid
	// N = 5
	// [space - Stars - Spaces]
	//     *    [4-1-4]
	//    ***   [3-3-3]
	//   *****  [2-5-2]
	//  ******* [1-7-1]
	// *********[0-9-0]
	public static void pattern7(int N) {
		// This is the outer loop which will loop for the rows.
		for(int i = 0; i < N; i++) {
			// We will find no of space, no of starts and then no of spaces
			// [space - Stars - Spaces]
			// 1st inner loop to find spaces
			for(int j = 0; j < (N-1-i); j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < ((2*i)+1); k++) {
				System.out.print("*");
			}
			for(int l = 0; l < (N-1-i); l++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	// Inverted Numbered Right Pyramid
	// 1 2 3 4 5
	// 1 2 3 4
	// 1 2 3
	// 1 2
	// 1
	public static void pattern6(int N) {
		for (int i = N; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(j + 1 + " ");
			}
			System.out.println();
		}
	}

	// Inverted Right Pyramid starts
	// * * * * *
	// * * * *
	// * * *
	// * *
	// *
	public static void pattern5(int N) {
		for (int i = N; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	// Right-Angled Number Pyramid – II
	// 1
	// 2 2
	// 3 3 3
	// 4 4 4 4
	// 5 5 5 5 5
	public static void pattern4(int N) {
		// This is the outer loop which will loop for the rows.
		for (int i = 0; i < N; i++) {
			// This is the inner loop which loops for the columns
			// no. of columns = row number for each line here.
			// Here, we print numbers equal to the row number
			// instead of stars in each row.
			for (int j = 0; j <= i; j++) {
				System.out.print(i + 1 + " ");
			}
			// As soon as numbers for each iteration are printed, we move to the
			// next row and give a line break otherwise all numbers
			// would get printed in 1 line.
			System.out.println();
		}
	}

	// Right-Angled Number Pyramid
	// 1
	// 1 2
	// 1 2 3
	// 1 2 3 4
	// 1 2 3 4 5
	public static void pattern3(int N) {
		// This is the outer loop which will loop for the rows.
		for (int i = 0; i < N; i++) {
			// This is the inner loop which loops for the columns
			// no. of columns = row number for each line here.
			// Here, we print numbers from 1 to the row number
			// instead of stars in each row.
			for (int j = 0; j <= i; j++) {
				System.out.print(j + 1 + " ");
			}
			// As soon as numbers for each iteration are printed, we move to the
			// next row and give a line break otherwise all numbers
			// would get printed in 1 line.
			System.out.println();
		}
	}

	// Right-Angled Triangle star pattern
	// *
	// * *
	// * * *
	// * * * *
	// * * * * *
	public static void pattern2(int N) {
		// This is the outer loop which will loop for the rows.
		for (int i = 0; i < N; i++) {
			// This is the inner loop which loops for the columns
			// no. of columns = row number for each line here.
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			// As soon as N stars are printed, we move to the
			// next row and give a line break otherwise all stars
			// would get printed in 1 line.
			System.out.println();
		}
	}

	// Rectangular star pattern
	// * * * * *
	// * * * * *
	// * * * * *
	// * * * * *
	// * * * * *
	public static void pattern1(int N) {
		// This is the outer loop which will loop for the rows.
		for (int i = 0; i < N; i++) {
			// This is the inner loop which here, loops for the columns
			// as we have to print a rectangular pattern.
			for (int j = 0; j < N; j++) {
				System.out.print("* ");
			}
			// As soon as N stars are printed, we move to the
			// next row and give a line break otherwise all stars
			// would get printed in 1 line.
			System.out.println();
		}
	}

}
