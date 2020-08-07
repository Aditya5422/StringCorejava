package co.ds;

import java.util.Scanner;
import java.util.StringTokenizer;

public class WorldReverseSentence {

	public static void main(String[] args) {
		try(Scanner s=new Scanner(System.in);){
			System.out.println("ente the string:");
		String str=s.nextLine();
		StringTokenizer st=new StringTokenizer(str);
		while(st.hasMoreTokens())
		{
			/* System.out.println(st.nextToken()); */
			
			  StringBuffer sb=new StringBuffer(st.nextToken());
			  System.out.println(sb.reverse());
			 
		}

	}
	}
}
