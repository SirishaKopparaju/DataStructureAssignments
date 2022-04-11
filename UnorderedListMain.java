package DataStructure;

import java.io.FileWriter;
import java.util.Scanner;

import java.io.FileReader;

public class UnorderedListMain {
	
	public static void main(String[] args) {
		UnorderedList<String> un = new UnorderedList<String>();
		@SuppressWarnings("resource")
		Scanner scan =  new Scanner(System.in);
		try {
			@SuppressWarnings("resource")
			FileReader file = new FileReader("D:\\DemoProjects\\DemoTestCase\\lib\\src\\main\\java\\DataStructure");
			
			int i = 0;
			String sb = "";
			while((i=file.read())!=-1) {
		
				sb = sb+(char) i ;
			}
			String arr[] = sb.split(" ");
			for(int j = 0 ; j<=arr.length -1; j++) {
			
				un.add(arr[j]);
			}
			
		System.out.println("Enter a word to search");
		String word = scan.nextLine();
		if(un.search(word)) {
			un.remove(word);
			System.out.println("word removed form list");
		}else {
			un.add(word);
			System.out.println("word added to the list");
		}
		un.disp();
		int size = un.size();
		FileWriter filee = new FileWriter("D:\\DemoProjects\\DemoTestCase\\lib\\src\\main\\java\\DataStructure");
	for(int h= 0 ; h<=size -1; h++) {
		filee.write(un.pop(0)+" ");
	}
	filee.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}


