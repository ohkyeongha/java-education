package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapEx1 {
	public static void main(String[] args) {
		/*
		 * Map - key와 value를 가지고 있는 컬렉션
		 * 		(key, value) 세트 형식
		 * 	- key는 중복이 허용되지 않는다.
		 * 	- key는 순서가 없다.
		 * 	- key를 set으로 변경해서 iterator를 통해 순서를 만들고 순서 있게 출력이 가능하다.
		 * 
		 * 	- value는 중복이 허용된다.
		 * 	- value는 key를 통해 검색이 가능하다.
		 * 
		 * 사용법
		 *	HashMap map = new HashMap();
		 *
		 *	//key와 value 모두 제네릭스를 통해 타입을 지정(객체도 가능하다)
		 *	HashMap<String, String> map = new HashMap<String, String>();
		 * 
		 * 	map.put(key, value); //값을 입력, 수정
		 * 
		 * 	map.get(key); 	//=> value	//인덱스 대신 key가 들어간다 
		 * 
		 */
		
		HashMap<String, String> map = new HashMap<String, String>();
//				key,	value
		map.put("MyId", "admin");
		map.put("UserId", "user");
		map.put("책이름", "혼공자");
		
//		System.out.println(map.get("MyId"));
//		System.out.println(map.get("UserId"));
//		System.out.println(map.get("책이름"));
		
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("----------------");
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();	
		//Iterator는 참조타입만 받을 수 있다. wrapper 사용 : int -> Integer
		
		map2.put(0, "문자1");
		map2.put(1, "문자2");
		map2.put(2, "문자3");
		map2.put(3, "문자4");
		
		for(int i=0 ; i < map2.size() ; i++) {
			
			System.out.println(map2.get(i));
		}
		
	}
}
