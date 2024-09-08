package programs.Day18;

import java.io.FileWriter;

public class WritetoFile {

	public static void main(String[] args) throws Exception {

		FileWriter fos = new FileWriter("./xyz.txt", true);

		String msg = "Hello, how are you?";

		fos.write(msg);

		fos.close();

	}

}
