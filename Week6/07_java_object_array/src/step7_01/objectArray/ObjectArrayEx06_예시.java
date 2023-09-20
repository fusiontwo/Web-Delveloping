//package step7_01.objectArray;
//
//class Member_연습{
//	
//	String name;
//	int num;
//	
//}
//
//
//class MemberManager_연습{
//
//	Member_연습[] memberList = new Member_연습[3];
//
//}
//
//
//public class ObjectArrayEx06_예시 {
//
//	public static void main(String[] args) {
//
//		// 해석해보기
//		MemberManager_연습 mg = new MemberManager_연습();	
//		Member_연습 m1 = new Member_연습();
//		mg.memberList[0] = m1;
//		m1.name = "김철수";
//		m1.num = 1001;
//		
//		m1 = new Member_연습();
//		mg.memberList[1] = m1;
//		m1.name = "이만수";
//		m1.num = 1002;
//		
//		m1 = new Member_연습();
//		mg.memberList[2] = m1;
//		m1.name = "박영희";
//		m1.num = 1003;
//		
//		for (int i = 0; i < mg.memberList.length; i++) {
//			System.out.println("num : " + mg.memberList[i].num);
//			System.out.println("name : " + mg.memberList[i].name);
//			System.out.println();
//		}
//		
//		Member_연습 temp = mg.memberList[1];
//		System.out.println("num : " + temp.num);
//		System.out.println("name : " +temp.name);
//
//	}
//
//}
