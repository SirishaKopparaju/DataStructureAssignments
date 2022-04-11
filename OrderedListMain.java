package DataStructure;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class OrderedListMain {
 
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		OrderedList<Integer> nw = new OrderedList<Integer>();
		try {
		FileReader file = new FileReader("D:\\DemoProjects\\DemoTestCase\\lib\\src\\main\\java\\DataStructure");
		int i =0;
		String sb = "";
		while((i=file.read())!=-1) {
			sb = sb+(char) i ;
		}
		System.out.println(sb);
		String arrr[] = sb.split(" ");
		int arr[] = new int[arrr.length];
		 for(int j = 0 ; j<arrr.length;j++) {
			 arr[j] = Integer.parseInt(arrr[j]);
		 }
		 for(int k : arr) {
			nw.add(k);
		 }
		 System.out.println("Enter the word to search");
		int num = Utility.scanInt();
		if(nw.search(num)) {
			System.out.println("removed: "+ num);
		nw.remove(num);
		}else {
			System.out.println("added: "+ num);
			nw.add(num);
		}
		FileWriter filee  = new FileWriter("D:\\DemoProjects\\DemoTestCase\\lib\\src\\main\\java\\DataStructure");
		int size = nw.size();
		nw.disp();
		for(int o = 0 ; o<=size ; o++) {
			filee.write(nw.pop(0)+" ");
		}
		filee.close();
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
