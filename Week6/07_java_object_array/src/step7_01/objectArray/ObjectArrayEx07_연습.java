package step7_01.objectArray;

//# 클래스 배열 응용

class Subject_연습{
	
	String name;  // 과목명
	int score;  // 점수
	
}


class Student_연습{
	
	Subject_연습[] subjects;  // 과목명과 점수 정보가 담긴 Subject_연습 객체
	String name;  // 학생 이름
	
}


public class ObjectArrayEx07_연습 {

	public static void main(String[] args) {
		
		Student_연습[] studentList = new Student_연습[3];
		
		for (int i = 0; i < studentList.length; i++) {
			studentList[i] = new Student_연습();
		}
		
		studentList[0].name = "학생1";
		studentList[0].subjects = new Subject_연습[3];
		
		for (int i = 0; i < studentList[0].subjects.length; i++) {
			studentList[0].subjects[i] = new Subject_연습();
			studentList[0].subjects[i].name = "학생 0 과목 " + i; 
			studentList[0].subjects[i].score = 100;
		}
		
		studentList[1].name = "학생2";
		studentList[1].subjects = new Subject_연습[2];
		for (int i = 0; i < studentList[1].subjects.length; i++) {
			studentList[1].subjects[i] = new Subject_연습();
			studentList[1].subjects[i].name = "학생 1 과목 " + i;
		}
		studentList[1].subjects[0].score = 80;
		studentList[1].subjects[1].score = 75;
		
		studentList[2].name = "학생3";
		studentList[2].subjects = new Subject_연습[4];
		for (int i = 0; i < studentList[2].subjects.length; i++) {
			studentList[2].subjects[i] = new Subject_연습();
			studentList[2].subjects[i].name = "학생 2 과목 " + i;
		}
		studentList[2].subjects[0].score = 10;
		studentList[2].subjects[1].score = 30;
		studentList[2].subjects[2].score = 50;
		studentList[2].subjects[3].score = 70;
		
		for (int i = 0; i < studentList.length; i++) {
			System.out.println("-".repeat(3) + "학생" + i + "-".repeat(3));
			for (int j = 0; j < studentList[i].subjects.length; j++) {
				System.out.println(studentList[i].subjects[j].name + " / " + studentList[i].subjects[j].score);
			}
			System.out.println();
		}

	}

}
