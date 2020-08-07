package co.ds;

import java.util.Scanner;

public class StringAnagram {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in);) {
			System.out.println("ente the string1:");
			String s1 = s.nextLine();
			System.out.println("ente the string2:");
			String s2 = s.nextLine();
			int count = 0;
			if (s1.length() == s2.length()) {
				for (int i = 0;i<s1.length(); i++) {
					for (int j = 0; j<s2.length(); j++) {
						if (s1.charAt(i) == s2.charAt(j)) {
							count++;
						}
					}
				}
				if (count == s1.length()) {
					System.out.println("Anagram String..:");
				} 
				else 
				{
					System.out.println("Not Anagram String..:");
				}
			} else {
				System.out.println("invalid String length..");
			}
		}//try
	}
}
