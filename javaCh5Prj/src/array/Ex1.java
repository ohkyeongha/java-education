package array;

public class Ex1 {

	public static void main(String[] args) {
//		- 1~10까지 출력
		for(int i = 1 ; i <= 10 ; i++)
			System.out.print(i + " ");
		
		System.out.println("\n------------------");
//		- 10~1까지 출력
		for(int i = 10 ; i >= 1 ; i--)
			System.out.print(i + " ");
		
		System.out.println("\n------------------");
//		- 1~10 짝수만 출력
		for(int i = 1 ; i <=10 ; i++) {
			if(i%2==0) {
				System.out.print(i + " ");				
			}
		}
		System.out.println("\n------------------");
//		- 1~10까지 합 출력
//		  : "1+2+3+...10=55"  출력
		int sum = 0;
		
		for(int i = 1 ; i <=10 ; i++) 
			sum += i;
		
		System.out.println(sum);				
		
		System.out.println("------------------");
//		- 1~10 짝수는 *, 홀수는 숫자로 출력	
		for(int i = 1 ; i <=10 ; i++) {
			if(i%2==0) {
				System.out.print("* ");				
			} else {
				System.out.print(i + " ");				
			}
		}
		
		System.out.println("\n------------------");
		for(int i = 1 ; i <=5 ; i++) {
			for(int j = 1 ; j <=5 ; j++) {
				System.out.print(i);				
			}
			System.out.println();				
		}
		
		System.out.println("------------------");
		
		for(int i = 5 ; i >= 1 ; i--) {
			for(int j = 5 ; j >= 1 ; j--) {
				System.out.print(i);				
			}
			System.out.println();				
		}
		System.out.println("------------------");
		
		for(int i = 1 ; i <=20 ; i++) {
			System.out.print(i + " ");			
			if(i%5==0)
				System.out.println();			
		}
		System.out.println("------------------");
		
		int[] arr = {4,8,10,33,6,1,12,2,13};
		
		int min = 999;
		int arrSum = 0;
		float arrAvg = 0;
		
		for (int i = 0 ; i < arr.length ; i++) {
			
			if(arr[i]<min) min = arr[i];
			arrSum += arr[i];
		}
		arrAvg = arrSum / arr.length;
		
		System.out.println("최소값 : " + min);
		System.out.println("10보다 작은 수 출력:");
		for (int i = 0 ; i < arr.length ; i++) 
			if(arr[i]<10) System.out.print(arr[i] + " ");
		
		System.out.println("\n평균보다 작은 수 출력:");
		for (int i = 0 ; i < arr.length ; i++) 
			if(arr[i]<arrAvg) System.out.print(arr[i] + " ");
		
		System.out.println("\n\n*기존 배열과 새 배열의 다른 값 찾기*");
//		int[] arr = {4,8,10,33,6,1,12,2,13};
		int[] arr1 = {8,6,12,2,33,1,13,20,4,3,6};
		
		System.out.print("기존 배열 : ");
		for (int i = 0 ; i < arr.length ; i++) 
			System.out.print(arr[i] + " ");
		
		System.out.print("\n새 배열 : ");
		for (int i = 0 ; i < arr1.length ; i++) 
			System.out.print(arr1[i] + " ");
		
			boolean[]check1 = new boolean[arr.length];//false로 초기화
			boolean[]check2 = new boolean[arr1.length];//false로 초기화
		
		for (int i = 0 ; i < arr.length ; i++) {
			for (int j = 0 ; j < arr1.length ; j++) {
				if(arr1[j] == arr[i]) {
					check1[i] = true;
					check2[j] = true;
					break;
				}
			}
		}
		
		System.out.print("\n기존 배열 :");
		for (int i = 0; i < arr.length ; i++) {
			if (!check1[i]) System.out.print(" " + arr[i]);
		}
		System.out.print(", 새 배열 : ");
		for (int i = 0; i < arr1.length ; i++) {
			if (!check2[i]) System.out.print(arr1[i]+ " ");
		}
		
		
		
		
		
	}

}
