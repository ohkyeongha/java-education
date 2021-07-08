package oop4;

public class MethodEx1 {
	
	public static void main(String[] args) {
		MethodEx1 me1 = new MethodEx1();
		
		int[] arr = {10,20,30,40,50};
		
		me1.printOddSum(10,20);
		me1.printOddAndEvenSum(10,20);
		System.out.println("10~20까지의 합계");
		System.out.println(me1.inputSum(20,10));
		System.out.println(me1.inputSum(10,20));
		int max = me1.findMax(arr);
		System.out.println("배열의 최대값 : " + max);
		
	}
	
	void printOddSum(int a, int b) {
		int sum = 0;
		
		for(int i = a ; i <= b ; i++) 
			if (i%2!=1) {
				sum += i;
			}
		System.out.println("홀수의 합 : "+sum);
		
	}
	
	void printOddAndEvenSum(int a, int b) {
		int oddSum = 0;
		int evenSum = 0;
		
		for(int i = a ; i <= b ; i++)  {
			if (i%2==0) {
				evenSum += i;
			} else {
				oddSum +=i;
			}
		}
		System.out.println("홀수 합 : " + oddSum);
		System.out.println("짝수 합 : " + evenSum);
		
	}
	
	int inputSum(int a, int b) {
		
		int sum = 0;
		int start = 0, end = 0;
		
		if(b >= a) {
			start = a;
			end = b;
		} else {
			start = b;
			end = a;
		}
		
		for(int i = start ; i <= end ; i++)
			sum += i;
		
		return sum;
	}
	
	int findMax(int[] arr) {
		int max = -999;
		
		for(int i = 0 ; i < arr.length ; i++) {
			if(max<=arr[i]) {
				max = arr[i];
			}
		}
		
		return max;
	}
}
