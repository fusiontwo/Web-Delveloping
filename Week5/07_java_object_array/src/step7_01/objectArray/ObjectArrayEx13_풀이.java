package step7_01.objectArray;

import java.util.ArrayList;

class Tv {
	
	String name;
	String brand;
	int price;
	
	void setData(String name, String brand, int price) {
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
}


public class ObjectArrayEx13_풀이 {

	public static void main(String[] args) {
		
		// ArrayList 사용
		ArrayList<Tv> list = new ArrayList<Tv>();
		
		Tv temp = new Tv();
		temp.setData("TV", "삼성", 1000);
		list.add(temp);
		
		temp = new Tv();
		temp.setData("시그니처 TV", "엘지", 2000);
		list.add(temp);
		
		temp = new Tv();
		temp.setData("스마트 TV", "애플", 3000);
		list.add(temp);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println("name : " + list.get(i).name);
			System.out.println("brand : " + list.get(i).brand);
			System.out.println("price : " + list.get(i).price);
			System.out.println();
		}
		
		System.out.println("\n");
		
		for (Tv tv : list) {
			System.out.println("name : " + tv.name);
			System.out.println("brand : " + tv.brand);
			System.out.println("price : " + tv.price);
			System.out.println();
		}
	}

}
