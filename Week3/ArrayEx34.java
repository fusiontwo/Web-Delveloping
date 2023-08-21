package step3_01.arrayAdvanced;

import java.util.Arrays;

// 배열의 주소

public class ArrayEx34 {

	public static void main(String[] args) {
		
		int nVar1 = 10;
		int nVar2 = nVar1;  // 데이터 대입
		
		nVar1 = 20;
		
		System.out.println("nVar1 : " + nVar1);
		System.out.println("nVar2 : " + nVar2);
		System.out.println();
		
		int[] arr = {87, 100, 24, 11, 79};
		int[] temp = arr;  // 주소, 참조, 레퍼런스
		
		// arr과 temp의 주소가 동일한 것을 확인 가능
		System.out.println("arr : " + arr);
		System.out.println("temp : " + temp);
		
		// array와 temp가 가리키는 배열의 값이 동시에 바뀜.
		arr[0] = 0;
		temp[1] = 0;
		arr[2] = 0;
		temp[3] = 0;
		arr[4] = 0;
		
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("temp : " + Arrays.toString(temp));

	}

}
