package com.code.test;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to reverse");
		String original = sc.nextLine();
		String reverse = "";
		sc.close();
		int length = original.length();// 4
		for (int i = length - 1; i >= 0; i--)

			reverse = reverse + original.charAt(i);
		System.out.println("reverse string is :" + reverse);

	}

}
