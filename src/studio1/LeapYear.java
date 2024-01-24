package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("What is the year?");
		int year = in.nextInt();
		boolean prompt1 = year%4 == 0;
		boolean prompt2 = year%100 != 0;
		boolean prompt3 = year%400 == 0;
		
		boolean leapyear = prompt1 && prompt2 || prompt3;
		System.out.print(year + " is a leap year: " + leapyear);
	}

}
