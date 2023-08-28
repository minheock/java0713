package ch15_inout;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = System.getProperty("user.dir");
		String fileNm = "delay.txt";
		File textFile = new File(path +System.lineSeparator() + fileNm);
		// System.lineSeparator() <- 어느 개발환경이든 / 경로를 나타낼수있음.
		// 파일 내용쓰기
		try {                                                // true는 파일 있으면 append
														     // false는 다시씀
			FileOutputStream fos = new FileOutputStream(textFile, false);
			fos.write("팽수 늦음\n".getBytes());
			fos.write("동길 늦음\n".getBytes());
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();				
		}
		
		
		
		
		// 파일 읽기
		try {
			FileInputStream fis = new FileInputStream(textFile);
			byte[] data = new byte[fis.available()]; // 파일을 바이트 단위로 가져오기
			while(true) {
				int x = fis.read(data);
				if(x == -1) {
					break; // 파일을 끝까지 읽었다는 뜻
				}
				String result = new String(data); // byte 배열을 String으로 변환
				System.out.println(result);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}
