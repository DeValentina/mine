package ch18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

public class FileCopy2 {
	public static void main(String[] args) {
		OutputStream os = null;
		BufferedReader reader=null;
		BufferedWriter writer=null;		
		String s="";
		
		String file1="C:\\test\\abc.txt";
		String file2="C:\\test\\abcCopy.txt";
		
		try {
		
			os = new FileOutputStream(file1);
			System.out.println("입력하세요 : ");
			
			
			while (true) {
				int ch = System.in.read();
				if(ch == 13) break;
				os.write(ch);
			}System.out.println("파일이 저장되었습니다.");
			
			reader=new BufferedReader(new FileReader(new File(file1)));
			writer=new BufferedWriter(new FileWriter(new File(file2)));
			System.out.println("파일 복사가 완료되었습니다.");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(reader != null) reader.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if(writer != null) writer.close();
			} catch (Exception e2) {
				e2.printStackTrace();
				
			}
		}
	}
}