package set;

import java.util.HashSet;
import java.util.Iterator;

public class SetEx1 {

	public static void main(String[] args) {
		/*
		 * set - 중복 x, 순서 x
		 * 	- 검색을 위해 iterator 사용
		 * 	- HashSet 많이 사용
		 * 
		 * Set 사용법
		 * 	- 값을 넣을 때 add() 메소드 사용
		 * 
		 * Iterator 사용법(값을 검색)
		 * 	- hasNext() 메소드 사용해서 set에 값이 있는지 확인
		 * 	- 값이 있으면 next() 메소드 사용해서 값을 출력
		 * 
		 */
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("안뇽");	//<-- 선택
		set.add("JAVA");
		set.add("졸령");
		set.add("안뇽1");	//추가
		set.add("안뇽");	//추가
		
		Iterator<String> it = set.iterator();
		//선택된 공간에 값이 있는지 확인 (true, false)
		while(it.hasNext()) {	
			System.out.println(it.next());//선택된 값을 출력
		}
		
		
	}

}
