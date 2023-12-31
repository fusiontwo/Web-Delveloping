package step2_01.array;

/*
 * # 4의 배수만 저장
 * 
 * - arr 배열에서 4의 배수의 개수를 계산하여 4의 배수만큼 temp 배열을 생성한뒤에 
 *   arr배열의 4의 배수들을  temp배열로 이관하여보시오.
 * 
 */

public class ArrayEx13_풀이 {

	public static void main(String[] args) {
		
		int[] arr = {44, 11, 29, 24, 76};
		int[] temp = null;
		int tempIndex = 0;
		
		int multiple4Cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) multiple4Cnt++;
		}
		
		temp = new int[multiple4Cnt];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				temp[tempIndex] = arr[i];
				tempIndex++;
			}
		}
		 
		System.out.print("temp array : ");
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + " ");
		}
		
	}
	
}
