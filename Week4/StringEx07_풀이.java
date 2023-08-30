package step4_01.string;


public class StringEx07_풀이 {

	public static void main(String[] args) {
		
		// 문제) 이름은 name배열에 성적은 score배열에 각각 저장 및 출력
		
		String str = "김철수/87,이만수/42,이영희/95";
		
		String[] name = new String[3];
		int[] score = new int[3];
		
		String[] personInfo = str.split(",");
		for (int i = 0; i < personInfo.length; i++) {
			// 방법 1) temp 사용 (temp에 계속 새로운 person의 정보가 들어감.)
			String[] temp = personInfo[i].split("/");
			name[i] = temp[0];
			score[i] = Integer.parseInt(temp[1]);
			
			// 방법 2) parsing 해서 바로 사용
//			name[i] = personInfo[i].split("/")[0];
//			score[i] = Integer.parseInt(personInfo[i].split("/")[1]);
		}
		
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");
		}
		System.out.println();
	}

}
