package string;

public class StringEx3 {

	public static void main(String[] args) {
		String[] strArr = {"자바의 정석", "이것이 자바다", "혼자공부하는 자바", "이것이 오라클이다", "MY-SQL 정석"};
	
		System.out.println("자바 관련 책 찾기");
		int count=1;
		for(int i = 0 ; i < strArr.length ; i++) 
			if(strArr[i].contains("자바")) 
				System.out.println(count++ +". "+strArr[i]);
			
		
		String str = "요즘 대기 불안정으로 소나기 소식이 무척 잦습니다.\r\n"
				+ "오늘에 이어 주말까지 내륙 곳곳에 소나기 예보가 나와 있는데요,\r\n"
				+ "오늘도 오후 한때 곳곳에 갑작스러운 소나기가 쏟아지겠고, 벼락과 돌풍, 우박을 동반하며 요란하게 내리겠습니다.\r\n"
				+ "나오실 때 가방 속에 우산 꼭 챙기시고요,\r\n" 
				+ "농작물과 시설물 관리에도 주의하시기 바랍니다.\r\n"
				+ "전국 대부분 지역에 예상되는 소나기의 양은 5~40mm가 되겠고요,\r\n"
				+ "오늘도 지역 간의 강수 차가 크겠습니다.\r\n"
				+ "소나기는 밤늦게 대부분 그치겠습니다.\r\n"
				+ "낮 동안 어제보다 기온이 올라 후텁지근하겠습니다.\r\n"
				+ "서울 28도, 대전과 광주, 대구 27도까지 오르겠습니다.\r\n"
				+ "주말까지 후텁지근한 날씨 속에 내륙 곳곳에 소나기가 지나겠고요,\r\n"
				+ "다음 주에는 맑은 가운데 30도 안팎의 불볕더위가 찾아오겠습니다.\r\n"
				+ "오늘 소나기 소식이 없는 남해안과 제주도는 자외선이 무척 강하겠습니다.\r\n"
				+ "여름철 외출하실 때 항상 자외선 차단에 각별히 신경 써주시기 바랍니다.\r\n"
				+ "지금까지 상암동 야외스튜디오에서 YTN 박현실입니다.";
		
		System.out.println("\n뉴스기사 100자 까지만 출력 후 뒤에는 ... 찍기");
		if(str.length()>=100) {
			System.out.println(str.substring(0, 100) + " ...");
			
		} else {
			System.out.println(str);
		}
		
		int countDot = 0;
		for(int i = 0 ; i < str.length() ; i++) 
			if (str.charAt(i) == '.') 
				countDot++;
		System.out.println("\n뉴스기사 마침표 개수 : " + countDot);
		
		System.out.println("\n뉴스기사 공백으로 잘라서 같은 단어 개수 찾기");
		
		String[] strSplit = str.replace("\r\n", " ").split(" ");
		
		int[] check = new int[strSplit.length];
		
		for(int i = 0 ; i < strSplit.length ; i++) {
			for(int j = 0 ; j < i ; j++) {
				if(strSplit[i].equals(strSplit[j])) {
					check[j]++;
					break;
				}
			}
		}
		
		for(int i = 1 ; i < strSplit.length ; i++) {
			if(check[i] >= 1) {
				System.out.println(strSplit[i] + " : " + (check[i]+1) +"개");
			}
		}
		
		System.out.println("그 외 단어 1개씩");
		
	
	}

}
