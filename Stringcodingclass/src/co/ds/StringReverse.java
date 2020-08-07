package co.ds;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		try(Scanner s=new Scanner(System.in);){
			System.out.println("ente the string:");
		String str=s.nextLine();
  StringBuilder s2=new StringBuilder(str);  
  System.out.println(s2.reverse());
}
}
	}