package step7_01.objectArray;

class Card_연습 {
	
	int num;
	String shape;
	
}

public class ObjectArrayEx02_연습 {

	public static void main(String[] args) {
		
		Card_연습[] cardList = new Card_연습[10];
		
		for (int i = 0; i < cardList.length; i++) {
			cardList[i] = new Card_연습();
			cardList[i].num = (i + 1);
			cardList[i].shape = "클로버";
		}
		
		for (int i = 0; i < cardList.length; i++) {
			System.out.println("num : " + cardList[i].num);
			System.out.println("shape : " + cardList[i].shape);
			System.out.println();
		}
		 
	}

}
