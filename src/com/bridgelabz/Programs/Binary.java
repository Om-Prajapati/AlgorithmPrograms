package com.bridgelabz.Programs;

import com.bridgelabz.Utility.Utility;
/**
 * @author OmPrajapati
 *
 */
public class Binary {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter a number :");
		int inputNumber = utility.inputInteger();
		String binary = utility.toBinary(inputNumber);
		char ch[] = binary.toCharArray();
		System.out.println("Binary represention : ");
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
	}
}
