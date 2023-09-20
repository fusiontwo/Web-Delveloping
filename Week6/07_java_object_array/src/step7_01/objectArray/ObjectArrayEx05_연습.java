package step7_01.objectArray;

class Client{
	
	String id;
	String passwd;
	String name;
	String birth;
	int age;
	String contact;
	String address;
	
	void setData(String id, String passwd, String name, String birth,
			int age, String contact, String address) {
		this.id      = id;  // parameter로 전달된 데이터를 field에 대입
		this.passwd  = passwd;
		this.name    = name;
		this.birth   = birth;
		this.age     = age;
		this.contact = contact;
		this.address = address;
	}
	
	
	// Source - Generate Constructor using Fields 기능 사용
//	public Client(String id, String passwd, String name, String birth, int age, String contact, String address) {
//		super();
//		this.id = id;
//		this.passwd = passwd;
//		this.name = name;
//		this.birth = birth;
//		this.age = age;
//		this.contact = contact;
//		this.address = address;
//	}


	void printData() {
		System.out.println(this.id  + " / " + this.passwd + " / " + this.name + " / " + this.birth + " / " + this.age + " / " + this.contact + " / " + this.address);
	}
	
}


public class ObjectArrayEx05_연습 {

	public static void main(String[] args) {
		
		Client[] clientList = new Client[3];

		for (int i = 0; i < clientList.length; i++) {
			clientList[i] = new Client();
		}
		
		// before
		clientList[0].id = "user1";
		clientList[0].passwd = "1111";
		clientList[0].name = "사용자1";
		clientList[0].birth = "1990-01-01";
		clientList[0].age = 34;
		clientList[0].contact = "010-1111-1111";
		clientList[0].address = "서울";
  		
		// after
		clientList[1].setData("user2", "2222", "사용자2", "2000-01-01", 24, "010-2222-2222", "경기");
		clientList[2].setData("user3", "3333", "사용자3", "2010-01-01", 14, "010-3333-3333", "인천");
		
		for (int i = 0; i < clientList.length; i++) {
			clientList[i].printData();
		}
	}

}
