package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
	public static void main(String[] args)
	{
		try {
			FileWriter Writer
				= new FileWriter("FileHandling\\wow.txt");
			Writer.write(
				"much wow");
			Writer.close();
			System.out.println("Successfully written.");
		}
		catch (IOException e) {
			System.out.println("An error has occurred.");
			e.printStackTrace();
		}
	}
}

