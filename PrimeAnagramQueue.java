package DataStructureAssignment;

import DataStructure.UnorderedList;

public class PrimeAnagramQueue {

		public static void main(String[] args) {
			Queue<Integer> qu = new Queue<Integer>();
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
								qu.enqueue(ar.get(i));
								qu.enqueue(ar.get(j));
							}
						}
					}
					
					qu.dispPrime();
				}
}


		


