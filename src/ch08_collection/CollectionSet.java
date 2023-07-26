package ch08_collection;

import java.util.HashSet;
import java.util.Iterator;

public class CollectionSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 집합 중복을 허용하지않음
		HashSet<String> stuSet = new HashSet<String>();
		// .add값
		stuSet.add("팽수");
		stuSet.add("팽순");
		System.out.println(stuSet);
		// 중복된 값이 추가되지 않으며 에러는 안남.
		stuSet.add("팽수");
		System.out.println(stuSet);
		// .size()
		System.out.println(stuSet.size());
		// .contains (값) true, false
		System.out.println(stuSet.contains("팽수"));
		for(String stu : stuSet) {
			System.out.println(stu);
		}
		
		// Iterator
		Iterator<String> iterator = stuSet.iterator();
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
		
	}

}
