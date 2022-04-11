package DataStructureAssignment;
public class BinarySearch {

	public class BinarySearchtree {

		public static void main(String[] args) {
	
			System.out.println("Enter the total number");
			double number=Utility.inputDouble();
			
			while(number>0)
			{
				double totalNodes=Utility.inputDouble();
				int totalTree=Utility.numberOfBinarySearchTree(totalNodes);//calling the method
				System.out.println(totalTree);
				number--;
			}
			
	}
	}
}
		


