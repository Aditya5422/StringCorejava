package co.ds;

import java.util.Scanner;

public class PalnidromString {

	public static void main(String[] args) {
		try(Scanner s=new Scanner(System.in);){
		System.out.println("ente the string:");
		String str=s.nextLine();
		StringBuilder s2=new StringBuilder(str);
		String st=new String(s2.reverse());
		if(str.equals(st))
		{
			System.out.println("palnidrom..");
		}
		else
		{
			System.out.println("not palnidrom..");
		}
		}
	}

}
