package step1_06.loop;

// 2023-08-15 00:40 ~ 1:30
/* 느낀 점 : 이중 for문을 사용할 때 바깥쪽 for문은 행의 개수와 관련이 있고, 
 * 안쪽 for문은 각 행에 출력할 문자의 개수와 관련이 있다. 
 * for문을 통해 j의 값이 0, 1, 2로 변화한다면 문자가 3개 출력될 것이다.
 * j의 값이 어떤 값까지 변화해야 해당 모양이 나오는지 확인 후, i와의 부등호 관계를 쓰면 좋은 것 같다.
 * 서로 다른 문자들이나 공백자가 섞여있는 경우, 서로 다른 안쪽 for문을 사용하여 출력해야 한다.
 * 문제 6과 7에서 i와 j의 관계로 나타내기 어려운 숫자 패턴의 경우, k와 같이 다른 정수를 사용하는 방법을 배웠다.
 * 뒤쪽에 있는 공백자는 프린트문을 넣어줄 필요가 없음에 유의해야겠다.
 * 내 풀이와 정답 예시가 살짝 달랐던 문제들은 두 가지를 모두 기록했다.*/
// # 삼각형 그리기

public class LoopEx28_풀이 {
	
	public static void main(String[] args) {
		
		/*
		 * 예)
		 * ###
		 * ###
		 * ###
		 */
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		
		
		/*
		 * 문제 1)
		 * #
		 * ##
		 * ###
		 */
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();

		
		/*
		 * 문제 2)
		 *   #
		 *  ##
		 * ###
		 */
		
		// 내 풀이
		for (int i = 0; i < 3; i++) {
			for (int j = 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		
		// 정답 예시
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3-(i+1); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		
		
		/*
		 * 문제 3)
		 * ###
		 * ##
		 * #
		 */
		
		for (int i = 0; i < 3; i++) {
			for (int j = 3; j > i; j--) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();

		
		/*
		 * 문제 4)
		 * ###
		 *  ##
		 *   #
		 */
		
		// 내 풀이
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 3; j > i; j--) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		
		// 정답 예시
		for (int i = 0; i < 3; i++) {
			for (int j = 3; j > 3-i; j--) {
				System.out.print(" ");
			}
			for (int j = 3; j > i; j--) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();

		
		/*
		 * 문제 5)
		 * @##
		 * @@#
		 * @@@
		 */
		
		// 내 풀이
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("@");
			}
			for (int j = 0; j < 3-(i+1); j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		
		// 정답 예시
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("@");
			}
			for (int j = 2; j > i; j--) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();

		
		/*
		 * 문제 6)
		 *   #
		 *  ###
		 * #####
		 */
		
		// 내 풀이
		for (int i = 0; i < 3; i++) {
			for (int j = 2; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i*2+1; j++) { // 0 1 2 -> 1 3 5
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		
		// 정답 예시
		int k = 0;
		
		for (int i = 0; i < 3; i++) {
			
			for (int j = 2; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= k; j++) {
				System.out.print("#");
			}
			System.out.println();
			k += 2;
		}
		System.out.println();

		
		/*
		 * 문제 7)
		 *  #####
		 *   ###
		 *    #
		 */
		
		k = 5;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < k; j++) {
				System.out.print("#");
			}
			System.out.println();
			k -= 2;
		}
	}
}
