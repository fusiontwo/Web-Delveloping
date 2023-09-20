package step7_01.objectArray;

// 2023-09-08 19:49 ~ 
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class StudentEx{
	
	
	
}



class Controller {
	
	StudentEx[] list = null;
	int stdCnt = 0;
	
	void addStudentEx(StudentEx st) {
		
		
	}
	
	
	StudentEx removeStudentEx (int index) {
		
		StudentEx deleteObj = list[index];

		
		return deleteObj;  // 굳이 return을 안해주고 데이터만 삭제해주어도 되는데
						// 타 언어의 pop()메서드와 같이 삭제하는 데이터를 return하는 방식처럼 구현해본 예시
		
	}
	
	
	int checkId(StudentEx st) {
		
		int check = -1;

		
		return check;
		
	}
	
	
	void printStudentEx() {
		

		
	}	
	
	
	String outData() {
		
		String data = "";

		return data;
		
	}
	
	
	void sortData() {

		
	}
	
	
	void loadStudentEx (StudentEx[] temp , int count) {
		
		
	}
	
	void run() {
		
		while (true) {
			
		}
	}
	
}


public class ObjectArrayEx09_연습 {

	public static void main(String[] args) {
		
		Controller controller = new Controller();
		controller.run();
	}

}
