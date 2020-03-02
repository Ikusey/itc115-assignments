//*******************************************************************

//  assignment8
//
// isSorted checks if the given array is sorted ascending, isUnique checks if all values in the
// given array are unique
//By: Azriel Policarpio
//3/1/2020
public class Assignment8 {

	public static void main(String[] args) {
		double[] list1 = new double[4];
		list1[0] = 16.1;
		list1[1] = 12.3;
		list1[2] = 22.2;
		list1[3] = 14.4;
		System.out.println(isSorted(list1));
		
		double[] list2 = new double[6];
		list2[0] = 1.5;
		list2[1] = 4.3;
		list2[2] = 7.0;
		list2[3] = 19.5;
		list2[4] = 25.1;
		list2[5] = 46.2;
		System.out.println(isSorted(list2));
		
		double[] list3 = new double[1];
		list3[0] = 1.0;
		System.out.println(isSorted(list3));
		
		int[] list4 = new int[6];
		list4[0] = 3;
		list4[1] = 8;
		list4[2] = 12;
		list4[3] = 2;
		System.out.println(isUnique(list4));
		
		int[] list5 = new int[6];
		list4[0] = 3;
		list4[1] = 8;
		list4[2] = 12;
		list4[3] = 3;
		System.out.println(isUnique(list5));
	}
	
	public static boolean isSorted(double[] list) {
		if(list.length == 1) return true;
		for(int i = 0; i < list.length-1; i++) {
			if(list[i] < list[i+1]) {}
			else return false;
		}
		return true;
	}
	
	public static boolean isUnique(int[] list) {
		if(list.length == 1) return true;
		int holder = 0;
		for(int i = 0; i < list.length-1; i++) {
			holder = list[i];
			for(int j = i + 1; j < list.length-1; j++) {
				if(holder == list[j]) return false;
			}
		}
		return true;
	}
}
