package string;

public class StringEx1 {

	public static void main(String[] args) {
		String str = "안녕 자바수업이야, java는 처음이지";
		String[] strArr = {"970526-2******","970521-1******","180507-4******","970421-1******"};
		
		char result = str.charAt(5);	//한글 영어 상관 없이 자리수로 반환
		System.out.println(result);
		
		for(int i = 0 ; i<strArr.length; i++) {
			if(strArr[i].charAt(7) == '1' || strArr[i].charAt(7) == '3') {
				System.out.println(strArr[i] + " : 남성");
			} else if(strArr[i].charAt(7) == '2' || strArr[i].charAt(7) == '4') {
				System.out.println(strArr[i] + " : 여성");
			}
		}

	}

}
