package arraylist;

import java.util.ArrayList;

public class ArraylistEx1 {

	public static void main(String[] args) {
		
		/*
		 * List - 순서가 o, 값 중복 o 
		 * 	- 배열의 단점을 보완
		 * 	- 크기가 가변적으로 변경될 수 있다.
		 * 	- 중간에 삭제가 이뤄지면 뒤에 배열공간이 앞당겨진다.
		 * 	
		 * 	ArrayList, LinkedList, vector, stack
		 * 
		 */

		ArrayList<String> list = new ArrayList<String>();
		//값 넣기
		list.add("문자값");
		list.add("문자1");
		list.add("문자2");
		list.add("문자3");

		System.out.println(list);
		
		for(int i = 0; i < list.size() ; i++) {
			String str = list.get(i);
			System.out.println(str);
		}
		
		list.set(3, "수정된 문자3");
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		
		list.remove("수정된 문자3");
		System.out.println(list);
		
		list.add(1, "문자0");
		System.out.println(list);
		
		int index = list.indexOf("문자1");
		System.out.println(index);
		System.out.println(list.get(index));
		list.set(index, "문자1-1");
		System.out.println(list);
		
//		list.clear();	//전체 리스트 삭제
		
		ArrayList<String> list2 = new ArrayList<String>();
//		list2 = list;	//주소값을 공유
		list2.addAll(list);
		
		System.out.println(list2);
		
		list2.add("새로운 문자 추가");
		
		System.out.println(list2);
		System.out.println(list);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
