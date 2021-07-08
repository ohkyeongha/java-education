package array;

public class MultiArray {

	public static void main(String[] args) {
		int[][] score = new int[3][3];
		int[][] score1 = { {3,1,2}, {1,2,3}, {4,5,6} };	
		score = new int[][]{ {3,1,2},{1,2},{4,5,6} };
		
		for(int i = 0 ; i < score.length ; i++) {
			for (int k = 0 ; k < score[i].length ; k++) 
				System.out.print(score[i][k] + " ");
			System.out.println();
		}
		

	}

}
