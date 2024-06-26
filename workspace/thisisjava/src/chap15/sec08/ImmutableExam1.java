package chap15.sec08;

import java.util.*;

public class ImmutableExam1 {

	public static void main(String[] args) {
		//불변 컬렉션 생성 : List, Set, Map의 정적메소드인 of()로 생성함
		// List 불변 컬렉션 생성(저장된 요소를 변경하고 싶지 ㅎ않을때 사용)
		List<String> immutableList1 = List.of("A","B","C");
		//immutableList1.add("D");	(X)
		//immutableList1.remove("C");	(X)
		System.out.println(immutableList1);
		
		//Set 불변 컬렉션 생성
		Set<String> immutableList2 = Set.of("A","B","C","D");
		//immutableList2.add("E");	(X)
		//immutableList2.remove("A");	(X)
		System.out.println(immutableList2);
		
		//Map 불변 컬렉션 생성
		Map<Integer,String> immutableList3 = Map.of(1, "A", 2,"B", 3,"C");
		//immutableList3.put(4, "D");	(X)
		System.out.println(immutableList3);
		
		//List 컬렉션을 불변 컬렉션으로 복사
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		List<String> immutableList4 = List.copyOf(list);
		list.add("E");
		System.out.println("list : " + list);
		//immutableList4.add("E");	(X)
		System.out.println("immutableList4 : " + immutableList4);
		
		//Set 컬렉션을 불변 컬렉션으로 복사
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		Set<String> immutableList5 = Set.copyOf(set);
		set.add("D");
		System.out.println("set : " + set);
		//immutableList5.add("D");	(X)
		System.out.println("immutableList5 : " + immutableList5);
		
		//Map 컬렉션을 불변 컬렉션으로 복사
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		Map<Integer, String> immutableList6 = Map.copyOf(map);
		map.put(4, "D");
		System.out.println("Map : " + map);
		//immutableList6.put(4, "D");	(X)
		System.out.println("immutableList6 : " + immutableList6);
		
		//배열로부터 List 불변 컬렉션 생성
		String[] arr = {"A","B","C"};
		List<String> immutableList7 = Arrays.asList(arr);
		System.out.println("arr : [" + arr[0] + ", " + arr[1] + ", " + arr[2] +"]");
		System.out.println("immutableList7 : " + immutableList7);
		

	}

}
