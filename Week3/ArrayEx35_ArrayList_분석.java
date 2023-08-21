package step3_01.arrayAdvanced;

import java.util.Scanner;

/*
 * 
 * # 배열 컨트롤러[2단계] : 어레이리스트(ArrayList)
 * 
 * 1. 추가
 * . 데이터를 입력받아 순차적으로 추가
 * 2. 삭제(인덱스)
 * . 인덱스를 입력받아 해당 위치의 데이터 삭제
 * 3. 삭제(데이터)
 * . 데이터를 입력받아 삭제
 * . 없는 데이터 입력 시 예외처리
 * 4. 삽입
 * . 인덱스와 데이터을 입력받아 삽입
 * 
 */

/*
 * 1. 디버그
 * 2. 돌려보기
 * 3. 주석 다 써보기
 * */



public class ArrayEx35_ArrayList_분석 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = null;
		int elementCnt = 0;
		
		while (true) {
			
			for (int i = 0; i < elementCnt; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			
			System.out.println("[어레이리스트 컨트롤러]");
			System.out.println("[1]추가");
			System.out.println("[2]삭제(인덱스)");
			System.out.println("[3]삭제(데이터)");
			System.out.println("[4]삽입");
			System.out.println("[0]종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			// 추가
			if (sel == 1) {
				if (elementCnt == 0) {  // 배열의 개수가 0이면
					arr = new int[elementCnt + 1];  // 0+1개의 배열을 만든다.
				}
				else if (elementCnt > 0){  // 배열의 개수가 1 이상이면
					int[] temp = arr;  // temp 배열에 arr의 주소를 넣는다. arr 데이터를 temp에 복사해놓음.
					arr = new int[elementCnt + 1];  // elementCnt+1개의 배열을 만든다.
					
					for (int i = 0; i < elementCnt; i++) {
						arr[i] = temp[i];  // temp의 데이터(기존에 arr에 있던 데이터)를 새로 만든 arr에 넣는다.
					}
					
					temp = null;  // temp를 초기화한다.
				}
				System.out.print("[추가]데이터 입력 : ");
				int data = scan.nextInt();
				
				arr[elementCnt] = data;  // 새로 만든 마지막 방에 데이터를 추가한다.
				elementCnt++;  // 다음에 방의 개수를 하나 늘릴 수 있도록 인덱스 값을 증가시켜 놓는다.
			}
			// 인덱스로 삭제하기
			else if (sel == 2) {
				System.out.print("[삭제]인덱스 입력 : ");
				int delIdx = scan.nextInt();
				
				if (elementCnt - 1 < delIdx || delIdx < 0) {  // 맨 끝의 인덱스보다 지우려는 인덱스가 크거나, 맨 앞의 인덱스보다 지우려는 인덱스가 작을 때
					System.out.println("[메세지]해당 위치는 삭제할 수 없습니다.");
					continue;
				}
				
				if (elementCnt == 1) {  // 배열 안의 값이 1개만 있으면
					arr = null;  // arr을 null로 초기화 (지울 수 있는 값이 하나뿐!)
				}
				else if (elementCnt > 1) {  // 배열 안의 값이 1개 이상이면
					int[] temp = arr;  // temp 배열에 arr의 주소를 넣는다. arr의 데이터를 temp에 복사한다.
					arr = new int[elementCnt - 1];  // arr에 elementCnt를 1 감소시킨 배열을 만든다.
					
					// 예시) temp : 0 1 2 3 4 5 delIdx 7 8 9 10
					for (int i = 0; i < delIdx; i++) {  // 인덱스가 delIdx보다 작을 때 (0~5)
						arr[i] = temp[i];  // arr에 temp에 복사해놓은 데이터를 입력
					}
					for (int i = delIdx; i < elementCnt - 1; i++) {  // 인덱스가 delIdx보다 클 때 (7~10)
						arr[i] = temp[i + 1];  // arr에 temp에 복사해놓은 데이터를 입력 (delIdx를 건너뛰기 위해 +1)
					}
					temp = null;  // temp를 초기화한다.
				}
				
				elementCnt--;  // 다음에 방의 개수를 하나 감소시킬 수 있도록 인덱스 값을 감소시킨다.
			}
			// 데이터로 삭제하기
			else if (sel == 3) {
				System.out.print("[삭제]데이터 입력 : ");
				int delData = scan.nextInt();
				
				int delIdx = -1;  // delIdx를 -1로 초기화
				for (int i = 0; i < elementCnt; i++) {
					if (arr[i] == delData) {  // arr에 인덱스 i에 있는 데이터가 delData와 같으면
						delIdx = i;  // delIdx에 i 값을 저장해놓는다.
					}
				}
				
				if (delIdx == -1) {  // arr에 존재하지 않는 값을 delData에 넣어서 delIdx가 그대로 -1인 경우
					System.out.println("[메세지]입력하신 데이터는 존재하지 않습니다.");
					continue;  // 아래 코드를 실행하지 않고, 데이터를 입력받는 코드로 돌아간다.
				}
				
				if (elementCnt == 1) {  // arr 안에 값이 1개 뿐이면
					arr = null;  // arr를 null로 초기화한다.
				}
				else if (elementCnt > 1) {  // arr 안에 값이 2개 이상이면
					int[] temp = arr;  // temp 배열에 arr의 주소를 넣는다. arr의 데이터를 temp 배열에 복사한다.
					arr = new int[elementCnt - 1];  // arr에 elementCnt-1개의 배열을 생성한다.
					
					int j = 0;
					for (int i = 0; i<elementCnt; i++) {
						if (i != delIdx) {  // arr에 있는 데이터 중 인덱스 값이 delIdx가 아니면
							arr[j++] = temp[i];  // arr에 temp에 복사해놓았던 데이터를 넣는다. arr의 인덱스를 j로 분리해서 사용했음.
						}
					}
					
					temp = null;  // temp를 null로 초기화한다.
				}
				
				elementCnt--;  // 다음에 방의 개수를 감소시킬 수 있도록 인덱스를 하나 감소시킨다.				
			}
			// 인덱스와 데이터를 입력하여 삽입
			else if (sel == 4) {
				System.out.print("[삽입]인덱스 입력 : ");
				int insertIdx = scan.nextInt();
				
				if (elementCnt < insertIdx || insertIdx < 0) {  // insertIdx가 arr의 맨 처음 인덱스보다 작거나 맨 끝 인덱스보다 크다면
					System.out.println("[메세지]해당 위치는 삽입할 수 없습니다.");
					continue;  // 아래 코드는 실행하지 않고 다시 인덱스를 입력받는다.
				}
				
				System.out.print("[삽입]데이터 입력 : ");
				int insertData = scan.nextInt();
				
				if (elementCnt == 0) {  // arr에 데이터가 0개 있으면
					arr = new int[elementCnt + 1];  // arr에 elementCnt+1개의 배열을 만든다.
				}
				else if (elementCnt > 0) {  // arr에 데이터가 1개 이상 있으면
					int[] temp = arr;  // temp에 arr의 주소를 넣는다. temp에 arr의 데이터를 복사한다.
					arr = new int[elementCnt + 1];  // arr에 elementCnt+1개의 배열을 만든다.
					
					// 예시)        0 1 2 3 4 5 6 7 8 (인덱스 6에 어떤 데이터를 insert 한다면)
					// 데이터 유무  o o o o o o o o o 
 					int j = 0;
					
					for (int i = 0; i < elementCnt + 1; i++) {
						if (i != insertIdx) {  // arr의 데이터 중 인덱스가 insertIdx와 다르면
							arr[i] = temp[j++];  // arr에 temp에 복사해놓았던 데이터를 넣는다.
							// 예시)        0 1 2 3 4 5 6 7 8 9
							// 데이터 유무  o o o o o o x o o o
						}
					}
					temp = null;  // temp를 null로 초기화한다.
				}
				
				arr[insertIdx] = insertData;  // arr에 현재 비어있는 insertIdx 자리에 insertData 값을 넣어준다.
				elementCnt++;  // 다음에 방의 개수를 증가시킬 수 있도록 elementCnt를 1 증가시킨다.
			}
			// 종료
			else if (sel == 0) {
				break;
			}
		}

		scan.close();

	}

}