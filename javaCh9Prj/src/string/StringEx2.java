package string;

public class StringEx2 {

	public static void main(String[] args) {
		String str = " 안녕 자바수업이야, java는 처음이지";
		
		//contains
		System.out.println("------------contains------------");
		System.out.println(str.contains("자바"));
		System.out.println(str.contains("오라클"));
		
		
		//endsWith
		System.out.println("------------endsWith------------");
		System.out.println(str.endsWith("지"));
		System.out.println(str.endsWith("이"));
		System.out.println(str.endsWith("처음이지"));
		
		//equalsIgnoreCase
		System.out.println("--------equalsIgnoreCase--------");
		String str1 = "java";
		String str2 = "Java";
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		
		//indexOf
		System.out.println("------------indexOf-------------");
		System.out.println(str.indexOf('a'));	//12
		System.out.println(str.indexOf("수업"));	//5(맨 앞글자만)
		
		//lastIndexOf
		System.out.println("----------lastIndexOf-----------");
		System.out.println(str.lastIndexOf('a'));	//14
		System.out.println(str.lastIndexOf("수업"));	//5
		
		//length
		System.out.println("------------length--------------");
		System.out.println(str.length());
		
		//replace
		System.out.println("------------replace-------------");
		String str3 = str.replace("자바", "java");
		System.out.println(str);	//str은 수정되지 않음
		System.out.println(str3);
		
		String str4 = str.replace(" ", "");
		System.out.println(str4);
		
		//split
		System.out.println("-------------split--------------");
		String[] strArr = str.split(",");
		System.out.println(strArr[0]);
		System.out.println(strArr[1]);
		
		String str5 = "홍길동 임꺽정 아이언맨 헐크 캡틴아메리카";
		String[] strArr1 = str5.split(" ");
		for(int i = 0 ; i < strArr1.length ; i++) {
			System.out.println(strArr1[i]);
		}
		
		//startsWith
		System.out.println("-------startsWith,trim()--------");
		System.out.println(str.startsWith("안녕"));
		System.out.println(str.trim().startsWith("안녕"));
		
		//substring
		System.out.println("-----------substring------------");
		System.out.println(str.substring(4));
		System.out.println(str.substring(4,10));
		
		String[] fileName = {"file1.txt","파일1.hwp","엑셀파일.xlsx","자바파일.java","test파일.csv","text.test파일.csv"};
		
		for(int i = 0 ; i < fileName.length ; i++) {
			System.out.println(fileName[i].substring(0, fileName[i].lastIndexOf('.')));
		}
		
		System.out.println("------------parseInt------------");
		String str6 = "1100050";
		String str7 = "2148123";
		System.out.println(Integer.parseInt(str6)+Integer.parseInt(str7));
	}

}
