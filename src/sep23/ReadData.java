package sep23;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadData {

	public static void main(String[] args) throws Throwable {
		FileReader  f=new FileReader("F:/selenium.txt");
		BufferedReader br=new BufferedReader(f);
		String str="";
		while ((str=br.readLine())!=null) {
			Thread.sleep(1000);
			System.out.println(str);
		}
	}

}
