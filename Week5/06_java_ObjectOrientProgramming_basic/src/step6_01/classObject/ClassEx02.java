package step6_01.classObject;

/*
 * 
 * # 클래스의 범위
 * 
 * 		- 같은 패키지 안의 클래스는 다른 클래스에서 사용이 가능하다.
 *       ( 구체적인 접근제어자는 객체지향 기법에서 공부 )
 * 
 * */

class Product {
	
	String productCd;  // 제품 CODE
	String productNm;  // 제품 NAME
	int price;
	int deliveryPrice = 2000;
}

public class ClassEx02 {

	public static void main(String[] args) {
		
		// 같은 패키지 안의 클래스는 다른 클래스에서 사용이 가능하다.(접근제어자는 후에 자세히 공부)
		Product product = new Product();
		product.productCd = "0x001";
		product.productNm = "스마트 TV";
		product.deliveryPrice = 3000000;
		
		System.out.println("product : " + product);
		System.out.println("product.productCd : " + product.productCd);
		System.out.println("product.productNm : " + product.productNm);
		System.out.println("product.price : " + product.price);
		System.out.println("product.deliveryPrice : " + product.deliveryPrice);
		System.out.println();
		
		// 같은 패키지 안의 클래스는 다른 클래스에서 사용이 가능하다.
		Member member = new Member();
	}

}
