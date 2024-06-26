package chap15.sec04.exam1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExam1 {

	public static void main(String[] args) {
		//Map 컬렉션
		//키와 값으로 구성된 엔트리 객체
		//키는 중복 저장할 수 없지만 값은 중복 저장 가능
		//put(K,V) 키(K)와 값(V)을 추가하고, 저장이 되면 값을 리턴
		//get(K) : ㅈ어진 키의 값을 리턴함
		
		//Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<>();
		//객체 저장
		map.put("홍길동", 95);
		map.put("홍길순", 85);
		map.put("김길동", 90);
		map.put("강길동", 75);
		map.put("홍길동", 80);	//키가 동일함 : 제일 마지막에 저장한 값만 저장
		System.out.println("총 entry 수 : " + map.size());
		//키로 value 얻기
		String key = "홍길동";
		int value = map.get(key);	//키를 매개값으로 주면 값을 리턴함
		System.out.println(value);
		System.out.println(key + " : " + value);
		System.out.println(key + " : " + map.get("홍길동"));
		System.out.println();
		
		//키 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
		Set<String> keyset = map.keySet();
		Iterator<String> keyIterator = keyset.iterator();
		//키를 반복하기 위해 반복자를 얻음
		while(keyIterator.hasNext()) {
			String k = keyIterator.next();
			Integer v = map.get(k);
			System.out.println(k + " : " + v);
		}
		System.out.println();
		
		//엔트리 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
		//엔트리를 반복하기 위해 반복자를 얻음
		while(entryIterator.hasNext()) {
			Entry<String, Integer> entry = entryIterator.next();
			String k = entry.getKey();
			Integer v = entry.getValue();
			System.out.println(k + " : " + v);
		}
		System.out.println();
		
		//키로 엔트리 삭제
		map.remove(key);
		System.out.println("총 Entry 수 : " + map.size());
		System.out.println();
	}

}
