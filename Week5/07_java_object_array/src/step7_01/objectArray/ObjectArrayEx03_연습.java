package step7_01.objectArray;

class Account_연습 {
	 
	String id; 
	int money;
	
}

public class ObjectArrayEx03_연습 {

	public static void main(String[] args) {
		
		Account_연습[] accountList = new Account_연습[2];
		
		for (int i = 0; i < accountList.length; i++) {
			accountList[i] = new Account_연습();
		}
		
		accountList[0].id = "qwer1234";
		accountList[0].money = 1000;
		
		accountList[1].id = "asdf1234";
		accountList[1].money = 2000;
		
		for (int i = 0; i < accountList.length; i++) {
			System.out.println(accountList[i].id + " " + accountList[i].money);
		}
		
		Account_연습 temp = accountList[0];  // temp에 참조(주소)를 전달한 것이 중요함.
		temp.id = "zxcv1234";  // 그래서 주소를 따라간 곳에 있는 데이터를 바꿀 수 있는 것임.
		System.out.println("==============================");
		
		for (int i = 0; i < accountList.length; i++) {
			System.out.println(accountList[i].id + " " + accountList[i].money);
		}
	
	}

}
