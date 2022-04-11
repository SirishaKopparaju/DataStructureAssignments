package DataStructureAssignment;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Utility<T extends Comparable<? super T>> {
	
	public static Scanner scan = new Scanner(System.in);
	
	public static PrintWriter pw = new PrintWriter(System.out);


	public static int dayOfWeek(int d, int m, int y) {
		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + (31 * m0) / 12) % 7;
		return d0;
	}

	
	
	
}



