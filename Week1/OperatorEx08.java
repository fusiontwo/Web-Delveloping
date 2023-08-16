package step1_03.operator;

/*
 * 
 *  # 증감 연산자 
 *  
 *  1) 좌변에 우변의 값을 더한 후 저장			+=
 *  2) 좌변에 우변의 값을 뺀 후 저장 	   		-=
 *  3) 좌변에 우변의 값을 곱한 후 저장 	   		*=
 *  4) 좌변에 우변의 값을 나눈 후 저장 	   		/=
 *  5) 좌변에 우변의 값을 나눈 나머지를 저장   	%=
 *  6) 변수의 값에 1을 더한 후 저장	       	 	++
 *  7) 변수의 값에 1을 뺀 후 저장	        	--
 *  
 * */

public class OperatorEx08 {

	public static void main(String[] args) {
		
		int balance = 50000;
		balance -= 10000;  // balance = balance - 10000;
		
		System.out.println(balance);
		
		int orderCnt = 1;
		orderCnt += 2;  // orderCnt = orderCnt + 2;
		System.out.println(orderCnt);
		
		int price = 10000;
		price *= 3;  // price = price * 3;
		System.out.println(price);
		System.out.println();
		
		
		
		/*
		 *  [참고]
		 *   변수++ , ++ 변수
		 *   변수-- , -- 변수
		 *   
		 *   명령어 실행 순서의 차이가 있다.
		 *   
		 *   */
		int x = 0;
		// x = x + 1;
		// x += 1;  
		x++;  // ++ 연산자 순서가 차이가 없음.
		System.out.println(x);
		++x;  // ++ 연산자 순서가 차이가 없음.
		System.out.println(x);
		System.out.println();
		
		int y = 0;
		System.out.println(y++);  // sout 명령어를 실행 후 y를 증가
		System.out.println(y);
		System.out.println();
		
		int z = 0;
		System.out.println(++z);  // z를 증가 후 sout 명령어를 실행
		System.out.println(z);
	}

}




