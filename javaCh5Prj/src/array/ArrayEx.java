package array;

public class ArrayEx {

	public static void main(String[] args) {

//		배열 안에 있는 모든 값의 평균을 구하라
		int[] arr = {15,66,75,24,35};
		int sum = 0;
		float avg = 0;
		
		for(int i = 0 ; i < arr.length ; i++) {
			sum += arr[i];
		}
		
		avg = sum/arr.length;
		
		System.out.println("배열의 크기 : " + arr.length);
		System.out.println("배열의 평균 : " + avg);
		
		System.out.println("------------------");
		
		int[] arr1 = new int[] {99, 57, 23, 46, 16};
//		홀수, 짝수의 합계, 평균
		int oddSum = 0, evenSum = 0, oddCnt = 0, evenCnt = 0;
		float oddAvg = 0, evenAvg = 0;
		
		for(int i = 0 ; i < arr1.length ; i++) {
			if (arr1[i]%2 != 0) {	//홀수
				oddSum += arr1[i];
				oddCnt++;
			} else {		//짝수
				evenSum += arr1[i];
				evenCnt++;
			}
		}
		oddAvg = oddSum/oddCnt;
		evenAvg = evenSum/evenCnt;
		
		System.out.println("홀수의 개수 : " + oddCnt);
		System.out.println("홀수의 합계 : " + oddSum);
		System.out.println("홀수의 평균 : " + oddAvg);
		
		System.out.println("짝수의 개수 : " + evenCnt);
		System.out.println("짝수의 합계 : " + evenSum);
		System.out.println("짝수의 평균 : " + evenAvg);
		
		System.out.println("------------------");
		
		int arr2[] = {12, 56, 2, -65, 75, 8, 52, 96, 31};
		
		int max = -999, min = 999;
		
		for(int i = 0 ; i < arr2.length ; i++) {
			
			if(arr2[i] > max) {
				max = arr2[i];
			}
			if(arr2[i] < min) {
				min = arr2[i];
			}
		}
		System.out.println("최대값 : " + max +"\t최소값 : " + min);
	}

}
