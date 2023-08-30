package step4_01.string;


public class StringEx05_풀이 {

	public static void main(String[] args) {

		String jumin = "890101-2012932";
		// 문제 1) 나이 출력
		// 정답 1) 35세
		// 방법 1
		String[] juminNum = jumin.split("-"); 
		int frontNum = Integer.parseInt(juminNum[0]);
		frontNum = frontNum / 10000;
		int age = 2023 - (1900 + frontNum) + 1;
		System.out.println(age + "세");
		// 방법 2
		String strAge = jumin.substring(0, 2);
		int intAge = Integer.parseInt(strAge);
		int age2 = 2023 - (1900 + intAge) + 1;
		System.out.println(age + "세");
		
		// 문제 2) 성별 출력
		// 정답 2) 여성
		// 방법 1
		String strSex = jumin.substring(7, 8);
		int intSex = Integer.parseInt(strSex);
		if (intSex == 1) System.out.println("남성");
		else System.out.println("여성");
		// 방법 2
		char sex = jumin.charAt(7);
		if (sex == '1' || sex == '3') System.out.println("남성");
		else if (sex == '2' || sex == '4') System.out.println("여성");
	}

}
