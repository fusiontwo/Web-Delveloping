package step7_01.objectArray;

// 2023-09-07 16:30 ~ 18:00
import java.util.Scanner;

class Subject8{
	
	String name;
	int score;

}


class Student8{
	
	Subject8[] subjects;
	String name;

}

class saveTestInfo {
	
	Scanner scan = new Scanner(System.in);
	Student8[] studentList = new Student8[3]; 
	int studentCnt = 0;
	
	void printMenu() {
		System.out.println("[1] 학생 추가하기");
		System.out.println("[2] 과목 추가하기");
		System.out.println("[3] 성적 추가하기");
		System.out.println("[4] 종료하기");
	}
	
	int menuChoice() {
		System.out.print("메뉴를 선택하시오 : ");
		int sel = scan.nextInt();
		
		return sel;
	}
	
	void addStudent() {
		System.out.print("이름 입력 : ");
		String name = scan.next();
		studentList[studentCnt] = new Student8();
		studentList[studentCnt].name = name;
		studentCnt++;
	}

	void addSubject() {
		
		for (int i = 0; i < studentCnt; i++) {
			System.out.printf("[%d] %s\n", (i+1), studentList[i].name);
		}
		
		int studentIdx = 0;
		String subjectName = "";
		System.out.print("학생 선택 : ");
		studentIdx = scan.nextInt() - 1;		
		System.out.print("과목 입력 : ");
		subjectName = scan.next();
		
		// Subject8 클래스의 객체가 아직 생성되지 않은 상태
		if (studentList[studentIdx].subjects == null) {
			studentList[studentIdx].subjects = new Subject8[1];
			studentList[studentIdx].subjects[0] = new Subject8();
			studentList[studentIdx].subjects[0].name = subjectName;
		}
		// Subject8 클래스의 객체가 이미 생성된 상태
		else {
			int size = studentList[studentIdx].subjects.length;  // subjects 배열의 크기
			
			Subject8[] temp = studentList[studentIdx].subjects;
			studentList[studentIdx].subjects = new Subject8[size + 1];
			
			// temp에서 복사하는 경우에는 new Subject8() 안 해 줘도 되나?
			for (int i = 0; i < size; i++) {
				studentList[studentIdx].subjects[i] = temp[i];
			}
			
			studentList[studentIdx].subjects[size] = new Subject8();
			studentList[studentIdx].subjects[size].name = subjectName;
			
			temp = null;
		}

	}
	
	void addScore() {
		for (int i = 0; i < studentCnt; i++) {
			System.out.printf("[%d] %s\n", (i+1), studentList[i].name);
		}
		int studentIdx = 0;
		System.out.print("학생 선택 : ");
		studentIdx = scan.nextInt() - 1;	

		if (studentList[studentIdx].subjects != null) {
			for (int i = 0; i < studentList[studentIdx].subjects.length; i++) {
				System.out.printf("[%d] %s\n", (i+1), studentList[studentIdx].subjects[i].name);
			}			
		}
		
		int subjectIdx = 0;
		System.out.print("과목 선택 : ");
		subjectIdx = scan.nextInt() - 1;	
		
		System.out.print("성적 입력 : ");
		int scoreInput = scan.nextInt();
		studentList[studentIdx].subjects[subjectIdx].score = scoreInput;
	}
	
	// 출력 형태
	/*
	 * [studentIdx+1] studentList[i].name학생 >>>
	 * [subjectIdx+1] studentList[i].Subject8[j].name과목 = studentList[i].Subject8[j].score점
	 */
	void printInfo() {
		for (int i = 0; i < studentCnt; i++) {  // i < studentCnt 조건
			System.out.printf("[%d] %s 학생 >>>\n", (i+1), studentList[i].name);
			if (studentList[i].subjects != null) {
				for (int j = 0; j < studentList[i].subjects.length; j++) {
					System.out.printf("[%d] %s과목 = %d점\n", (j+1), studentList[i].subjects[j].name, studentList[i].subjects[j].score);
				}
			}
			System.out.println();
		}
		return ;
	}
	
	void run() {
		while (true) {
			printMenu();
			int sel = menuChoice();
			
			if (sel == 1) {
				addStudent();
				printInfo();
			}
			else if (sel == 2) {
				addSubject();
				printInfo();
			}
			else if (sel == 3) {
				addScore();
				printInfo();
			}
			else if (sel == 4) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
}

public class ObjectArrayEx08_연습 {

	public static void main(String[] args) {
		
		saveTestInfo test = new saveTestInfo();
		test.run();
		
	}

}
