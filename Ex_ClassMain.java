package data;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ex_ClassMain {

	public static void main(String[] args) {

		//파일을 읽어올 경로
		//String path = 
		String path = "c:\\user\\KakaoTalk_File_20200422_1231_19437.txt";
		File f = new File(path);
		byte[] b_read = new byte[(int)f.length()];

		FileInputStream fis = null;
		ObjectInputStream ois = null;

		if( f.exists() ) {

			try {
				fis = new FileInputStream(f);
				ois = new ObjectInputStream(fis);

				System.out.println( ((Ex_Class)ois.readObject()).getName() );

			} catch (Exception e) {
				e.printStackTrace();
			} finally {

				try {
					ois.close();
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

			}

		}	

	}//main

}//class
