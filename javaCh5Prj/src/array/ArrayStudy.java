package array;

public class ArrayStudy {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
//		[10, 20, 30, 40, 50]
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		System.out.println("---------------------");
		
		int arr1[] = new int [5];
		for(int i = 0 ; i < arr.length ; i++) 
			
			arr1[i] = (i+1)*10;
		
		for(int i = 0 ; i < arr.length/*5*/ ; i++) 
			
			System.out.println(arr1[i]);
		

	}

}
