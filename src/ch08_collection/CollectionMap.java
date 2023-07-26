package ch08_collection;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Set;

public class CollectionMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// key와 value 한 쌍인 데이터를 저장
		// web 에서 데이터를 JSON 방식으로 많이 이용하는데 이것도 key:value 쌍
		// 첫번째 String <---키의 타입, 두번째 String value 타입
		HashMap<String, String> stuMap = new HashMap<String, String>();
		// 첫번째 String <---키의 타입, 두번째 int value 타입

		HashMap<String, Integer> coinMap = new HashMap<String, Integer>();
		
		// .put("key", "value") 데이터 추가ㅣ
		stuMap.put("첫째", "길동");
		stuMap.put("둘째", "동길");
		stuMap.put("셋째", "홍길");
		// 순서는 보장하지않음
		System.out.println(stuMap);
		// 중복된 key 값을 허용하지 않음
		// 중복된 key 값을 추가하면 기존 value 수정이 일어남.
		stuMap.put("첫째", "홍길동");
		System.out.println(stuMap);
		
		coinMap.put("비트코인", 3600000);
		coinMap.put("이더리움",100000);
		//.get (키);
		System.out.println(stuMap.get("첫째"));
		System.out.println(stuMap.get("비트코인"));
		//size()
		System.out.println(stuMap.size());
		// containsKey, .containsValue
		System.out.println(stuMap.containsKey("첫째"));
		System.out.println(stuMap.containsValue("길동"));
		//.remove 키 삭제
		stuMap.remove("둘째");
		System.out.println(stuMap);
		
		//1.keySet 이용
		// <키>
		Set<String> keySet = stuMap.keySet();
		for(String key: keySet) {
			System.out.println(key);
			System.out.println(stuMap.get(key));
		}
		
//		2. EntrySet
		Set<java.util.Map.Entry<String, String>> entrySet = stuMap.entrySet();
		for(java.util.Map.Entry<String, String> entry : entrySet) {
			System.out.println("=====1"+ entry.getKey());
			System.out.println("=====2" + entry.getValue());
		} 
		
		
	}

}
