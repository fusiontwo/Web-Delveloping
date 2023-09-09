package step6_02.method;

/*
 * 
 * # return
 *   
 * 	1) 값을 반환한다.
 *  2) 메서드를 종료한다.
 *  3) 메서드에서의 return 값은 1개이다. 
 *  
 * */

class ReturnEx {
	
	void setScore1(int score1) {
		score1 = 100;
	}
	
	int setScore2(int score2) {
		score2 = 100;
		return score2;
	}
	
	int testReturn() {
		System.out.println("리턴 전 명령어1");
		System.out.println("리턴 전 명령어2");
		System.out.println("리턴 전 명령어3");
		
		return 0;  // 팁 : 반환형을 써놓고, return문을 안 써 놓으면 메서드명에 에러가 멈춰있기 때문에 미리 return 문을 써놓기도 한다.
//		return 1,2,3,4,5;  // 리턴 값은 오로지 1개만 가능하다.

		// error : 리턴이 실행되는 순간 메서드가 종료된다.
//		System.out.println("리턴 후 명령어1");
//		System.out.println("리턴 후 명령어2");
//		System.out.println("리턴 후 명령어3");
	}
}


public class MethodEx03 {

	public static void main(String[] args) {
		
		ReturnEx object = new ReturnEx();
		
		int score1 = 87;
		System.out.println("메서드 호출 전의 성적 : " + score1);
		
		object.setScore1(score1);  // return 값을 저장하지 않고 함수 호출만 했음.
		System.out.println("메서드 호출 후의 성적 : " + score1);

		System.out.println("\n=============\n");

		int score2 = 87;
		System.out.println("메서드 호출 전의 성적 : " + score2);
		
		object.setScore2(score2);  // return 값을 저장하지 않고 함수 호출만 했음.
		System.out.println("메서드 호출 후의 성적 : " + score2);
		
		score2 = object.setScore2(score2);
		System.out.println("메서드 호출 및 변수에 리턴 값 덮어쓰기 후의 성적 : " + score2);
	}

}
