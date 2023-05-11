package ch18.sec03.exam03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExample {

	public static void main(String[] args) throws Exception{
		
		String originalFilename = "C:/temp/IVE 아이브 'Kitsch' MV.mp4";
		String targetFileName = "C:/temp/IVE 아이브 'Kitsch' MV2.mp4";
		
		InputStream is = new FileInputStream(originalFilename);
		OutputStream os = new FileOutputStream(targetFileName);
		
		byte[] data = new byte[1024];
		while(true) {
			int num = is.read(data);
			if(num == -1) break;
			os.write(data,0, num);
			
		}
		
		os.flush();
		os.close();
		is.close();
		System.out.println("복사가 잘되었습니다.");
	}

}
