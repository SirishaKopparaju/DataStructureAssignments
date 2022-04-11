package DataStructureAssignment;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Utility<T extends Comparable<? super T>> {
	
	public static Scanner scan = new Scanner(System.in);
	
	public static PrintWriter pw = new PrintWriter(System.out);


	public static void primeAnagrams() {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		System.out.println();
		boolean b;
		for (int j = 2; j <= 1000; j++) {
			b = true;
			for (int i = 2; i < j / 2; i++) {
				if (j % i == 0) {
					b = false;
					break;
				}
			}
			if (b)
				ar.add(j);
		}
		for (int i = 0; i < ar.size(); i++) {
			for (int j = i + 1; j < ar.size(); j++) {
				if (anagram(ar.get(i), ar.get(j))) {
					System.out.println(ar.get(i) + "  " + ar.get(j));
				}
			}
		}
	}
	public static boolean anagram(int n1, int n2) {
		int[] n1count = count(n1);
		int[] n2count = count(n2);
		for (int i = 0; i < n2count.length; i++) {
			if (n1count[i] != n2count[i]) {
				return false;
			}
		}
		return true;
	}
	
	
}



