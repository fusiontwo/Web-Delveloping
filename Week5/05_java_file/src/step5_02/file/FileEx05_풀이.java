package step5_02.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//# 파일 로드하기 : 연습문제


public class FileEx05_풀이 {

	public static void main(String[] args) {
		
		
		// 4번 연습문제에서 작성된 텍스트파일을 읽어들여와 아래 배열에 저장하시오.
		
		String[] names = new String[3];			// momk , megait , github
		String[] pws   = new String[3];			// 1111 , 2222   , 3333
		int[] moneys   = new int[3];			// 20000, 30000 , 40000
		
		String fileName = "fileTest02.txt";
		
		File file = new File(fileName);
		FileReader fr = null;
		BufferedReader br = null;

		if (file.exists()) {
			try {
				fr = new FileReader(file);
				br = new BufferedReader(fr);

				String data = br.readLine();
				String[] arr = data.split("/");

				for (int i = 0; i < arr.length; i++) {
					names[i] = arr[0];
					pws[i] = arr[1];
					moneys[i] = Integer.parseInt(arr[2]);
					data = br.readLine();
					arr = data.split("/");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {fr.close();} catch(IOException e) {e.printStackTrace();}
				try {fr.close();} catch(IOException e) {e.printStackTrace();}
			}
			
		}
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < pws.length; i++) {
			System.out.print(pws[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < moneys.length; i++) {
			System.out.print(moneys[i] + " ");
		}
		System.out.println();
	}

}
