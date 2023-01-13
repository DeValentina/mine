package ch18;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class OutputSTreamWriterEx {
	public static void main(String[] args) {
		PrintStream ps = System.out;
		OutputStream os = ps;
		OutputStreamWriter osw = new OutputStreamWriter(os);
		//OutputStreamWriter(outputstream)
		try {
			osw.write(44032);
			osw.write("나다라");
			osw.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
