package step7_01.objectArray;

import java.util.ArrayList;

/*
 * 
 *  # foreach문 (향상된 for문)
 *  
 *  [ 구조 ]
 *  
 *  for (element type 변수명 : 반복가능한 자료형) {
 *  	명령어;
 *  }
 * 
 *  - for문의 반복횟수 제어가 없다.
 *  - 반복 자료형의 크기만큼 처음부터 끝까지 반복하면서 반복 자료형의 element가 직접 변수에 저장되고 
 *    for문의 몸체{}를 반복하여 실행한다.
 * 
 * */

public class ObjectArrayEx11 {

	public static void main(String[] args) {
		
		// 사용 예시 1)
		int[] arr1 = {10 , 20 , 30 , 40 , 50 , 60 , 70 , 80 , 90 , 100};
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		for (int i : arr1) {  // 배열의 크기를 지정하지 않아도 자동으로 돈다.
			System.out.print(i + " ");
		}
		System.out.println();

		for (int num : arr1) {  // 배열의 크기를 지정하지 않아도 자동으로 돈다.
			System.out.print(num + " ");
		}
		System.out.println();
		
		System.out.println("\n====================\n");
		
		// 사용 예시 2)
		String[] arr2 = {"한놈" , "두시기" , "석삼" , "너구리" , "오징어"};
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		
		for (String idx : arr2) {
			System.out.print(idx + " ");
		}
		System.out.println();
		System.out.println("\n====================\n");
		
		// 사용 예시 3)
		ArrayList<Product> productList = new ArrayList<Product>();  // ObjectArrayEx01에 Product 클래스 있음
		
		// 입력
		for (int i = 0; i < 10; i++) {
			
			Product temp = new Product();			
			temp.name = "상품" + i;
			temp.price = 10000 * i;
			
			productList.add(temp);
		}
		
		// 출력 방법1
		for (int i = 0; i < productList.size(); i++) {
			System.out.println(productList.get(i).name);
			System.out.println(productList.get(i).price);
			System.out.println();
		}
		
		// 출력 방법2
		for (Product product : productList) {
			System.out.println(product.name);
			System.out.println(product.price);
			System.out.println();
		}
		
		
	}

}
