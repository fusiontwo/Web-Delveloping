package step7_01.objectArray;

import java.util.ArrayList;

class Restaurant {
	
	String name;
	String food;
	int price;
	boolean isPopular;
	
}

public class ArrayListPractice {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(0, 100);  // 하나씩 뒤로 밀림
		
		list.set(1, 500);
		
		list.remove(0);
		
		list = null;
		list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(50);
		list.add(80);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		ArrayList<String> charList = new ArrayList<String>();
		charList.add("어바웃타임");
		charList.add("노팅힐");
		charList.add("인사이드 아웃");
		
//		for (int i = 0; i < charList.size(); i++) {
//			System.out.println(charList.get(i));
//		}

		for (String movies : charList) {
			System.out.println(movies);
		}
		
		ArrayList<Product> productList = new ArrayList<Product>();
		
		for (int i = 0; i < 5; i++) {
			Product temp = new Product();
			
			temp.name = "상품" + i;
			temp.price = i * 1000;
			productList.add(temp);
		}
		
		for (int i = 0; i < productList.size(); i++) {
			System.out.println(productList.get(i).name);
		}
	}

}
