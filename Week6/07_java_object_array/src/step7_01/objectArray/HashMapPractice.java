package step7_01.objectArray;

import java.util.HashMap;

public class HashMapPractice {

	public static void main(String[] args) {
		
		HashMap<String, String> testMap = new HashMap<String, String>();
		
		// HashMap은 원래 순서대로 저장되지 않음.
		testMap.put("메뉴1", "치킨");
		testMap.put("메뉴2", "족발");
		testMap.put("메뉴3", "막국수");
		testMap.put("메뉴4", "라면");
		System.out.println(testMap);
		
		System.out.println(testMap.size());
		
		System.out.println(testMap.get("메뉴1"));
		System.out.println(testMap.get("메뉴2"));
		System.out.println(testMap.get("메뉴3"));
		System.out.println(testMap.get("메뉴4"));
		
		System.out.println(testMap.keySet());
		for (String key : testMap.keySet()) {
			System.out.println(testMap.get(key));
		}
		
		testMap.remove("메뉴2");
		System.out.println(testMap);
		
//		testMap.clear();
//		System.out.println(testMap);
		
		testMap = null;
		testMap = new HashMap<String, String>();
		testMap.put("음료1", "콜라");
		testMap.put("음료2", "사이다");
		System.out.println(testMap);
		
		
	}

}
