package co.ds;

import java.util.Scanner;

public class StringReverse2 {
	public static void main(String[] args) {
		try(Scanner s=new Scanner(System.in);){
			System.out.println("ente the string:");
		String str=s.nextLine();
		StringBuffer sb=new StringBuffer();
		for(int i=str.length()-1; i>=0; i--)
		{
			sb.append(str.charAt(i));
		}
		System.out.println(sb);
		}
	}

}
