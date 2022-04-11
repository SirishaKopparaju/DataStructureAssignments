package DataStructureAssignment;

import DataStructure.UnorderedList;

public class Stack {public class PrimeAnaUsingStack {

	public static void main(String[] args) {
		Stack stack = new Stack();
	UnorderedList<Integer> ar = new UnorderedList<Integer>();
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
					if (Utility.anagram(ar.get(i), ar.get(j))) {
						stack.push(ar.get(i));
						stack.push(ar.get(j));
					}
				}
			}
			
			stack.disp();
		}


}

public void push(Integer integer) {
	// TODO Auto-generated method stub
	
}

public void disp() {
	// TODO Auto-generated method stub
	
}

}
