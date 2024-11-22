package hust.soict.dsai.garbage;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
    public static void main(String[] args) throws Exception {
        String filename = "test.exe";
        byte[] inputBytes;
        long startTime, endTime;

        startTime = System.currentTimeMillis();
        inputBytes = Files.readAllBytes(Paths.get(filename));
        StringBuilder outputStringBuilder = new StringBuilder();
        for (byte b : inputBytes) {
            outputStringBuilder.append((char) b);
        }
        String outputString = outputStringBuilder.toString();
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}