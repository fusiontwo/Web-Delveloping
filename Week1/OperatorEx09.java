package step1_03.operator;

/*
 * 
 * # 삼항 연산자 
 * 
 * [ 형식 ]
 * 
 *  조건식 ? 참일때의 결과값 : 거짓일때의 결과값
 * 
 * */

public class OperatorEx09 {

	public static void main(String[] args) {
			
		// 예시 1)
		int finalScore = 60;
		System.out.println(finalScore >= 60 ? "pass" : "fail");
		System.out.println(finalScore < 60 ? "fail" : "pass");
		System.out.println();
		
		// 예시 2)
		char result = finalScore >= 60 ? 'p' : 'f';
		System.out.println(result);
				
	}

}



