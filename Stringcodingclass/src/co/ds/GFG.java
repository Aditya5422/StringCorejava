package co.ds;

import java.util.Arrays;
import java.util.Comparator;

public class StringCompare{
	static void sort(String[] strArr, String str) {
		Comparator<String> myComp = new Comparator<String>(){
			@Override
			public int compare(String a, String b) {
				for (int i = 0; i < Math.min(a.length(), b.length()); i++) {
					if (str.indexOf(a.charAt(i)) == str.indexOf(b.charAt(i))) {
						continue;
					} else if (str.indexOf(a.charAt(i)) > str.indexOf(b.charAt(i))) {
						return 1;
					} else {
						return -1;
					}
				}
				return 0;
			}
		};
		Arrays.sort(strArr, myComp);
	}

	// Driver Code
	public static void main(String[] args) {
		String str = "TESARDLK";
		String[] strArr = { "Ajay", "Raja", "Keshav", "List", "Set", "Elephant", "Drone" };

		sort(strArr, str);

		for (int i = 0; i < strArr.length; i++) {
		System.out.print(strArr[i] + " ");
		}
	}
}
