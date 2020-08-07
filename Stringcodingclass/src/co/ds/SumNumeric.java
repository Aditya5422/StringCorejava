package co.ds;

import java.util.Scanner;

public class SumNumeric {

	public static void main(String[] args) {
		try(Scanner s=new Scanner(System.in);){
			System.out.println("ente the string:");
		String str=s.nextLine();
		int sum=0; int count=0;
		for(int i=0; i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				count++;
			int k=Character.getNumericValue(str.charAt(i));
			sum=sum+k;
			}
		}
		System.out.println("count of number:"  +count);
		System.out.println("sum of numeric:"+sum);
		}
	}
}
