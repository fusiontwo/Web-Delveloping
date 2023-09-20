package step7_01.objectArray;

class Product {
	
	String name;
	int price;
	
}

public class ObjectArrayEx01 {

	public static void main(String[] args) {

		// 객채 배열 생성 방법
		// 클래스명[] 변수명 = new 클래스명[3];
		// int[] arr = new int[3]; 과 유사함
		
		Product[] productList = new Product[3];
		
		Product temp = new Product();
		temp.name = "기계식키보드";
		temp.price = 45000;
		
		productList[0] = temp;
		
		productList[1] = new Product();
		productList[1].name = "무소음마우스";
		productList[1].price = 27000;

		productList[2] = new Product();  // 이 코드를 안 쓰면 에러 -> java.lang.NullPointerException : null인데 사용하려고 할 경우 발생하는 에러
		productList[2].name = "장패드";
		productList[2].price = 10000;
		
		for (int i = 0; i < productList.length; i++) {
			System.out.println("name : " + productList[i].name);
			System.out.println("price : " + productList[i].price);
			System.out.println();
		}
		
		// [응용] 생각해보기
		Product[] temp1 = productList;  // 참조
		Product temp2   = productList[1];  // 참조
		String temp3    = productList[2].name;  // 데이터
		int temp4       = productList[2].price; // 데이터
		
		Product temp5 = productList[2];
		System.out.println("temp5 : " + temp5);  // 참조
		System.out.println("productList[2] : " + productList[2]);  // 참조
		
		System.out.println("temp5.name : " + temp5.name);  // 데이터
		System.out.println("productList[2].name : " + productList[2].name);  // 데이터
		
		temp5.name = "장패드1";
		System.out.println("temp5.name : " + temp5.name);  // 데이터
		System.out.println("productList[2].name : " + productList[2].name);  // 데이터
		
		productList[2].name = "장패드2";
		System.out.println("temp5.name : " + temp5.name);  // 데이터
		System.out.println("productList[2].name : " + productList[2].name);  // 데이터
	}

}
