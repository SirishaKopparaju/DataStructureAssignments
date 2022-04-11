package DataStructureAssignment;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Utility<T extends Comparable<? super T>> {
	
	public static Scanner scan = new Scanner(System.in);
	
	public static PrintWriter pw = new PrintWriter(System.out);


	public static int binary(String[] arr, String s) {
		int high = arr.length - 1, low = 0, mid;
		Arrays.sort(arr);

		while (low <= high) {
			mid = (high + low) / 2;
			if (s.equalsIgnoreCase(arr[mid])) {
				return mid;
			} else if (arr[mid].compareToIgnoreCase(s) < 0) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return -1;
	}
	
}



