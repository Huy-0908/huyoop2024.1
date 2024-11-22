package hust.soict.dsai.garbage;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
	public static void main(String[] args) throws Exception {
		String filename = "test.exe";
		byte[] inputBytes;
		
		long startTime, endTime;

		startTime = System.currentTimeMillis();
		inputBytes = Files.readAllBytes(Paths.get(filename));
		String outputString = "";
		for (byte b : inputBytes) {
			outputString += (char) b;
		}	
		endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}
}