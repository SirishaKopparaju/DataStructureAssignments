package DataStructureAssignment;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Utility<T extends Comparable<? super T>> {
	
	public static Scanner scan = new Scanner(System.in);
	
	public static PrintWriter pw = new PrintWriter(System.out);


	public static void PrintArr(double a[][]) {
		for (double b[] : a) {
			for (double c : b) {
				pw.print(c + " ");
				pw.flush();
			}
			System.out.println();
		}
	}
}
