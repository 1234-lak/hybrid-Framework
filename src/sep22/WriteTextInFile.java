package sep22;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class WriteTextInFile {

	public static void main(String[] args) throws Throwable {
		//create new file
		File f=new File("F:/seleniumcourse.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("iam not happy" );
		bw.newLine();
		bw.write("iam not happy without job" );
		bw.newLine();
		bw.write("i have more knowledge");
		bw.flush();
		bw.close();
	


	}

}
