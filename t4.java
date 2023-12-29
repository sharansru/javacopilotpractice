import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class t4 {
    public static void main(String[] args) {
        String filePath = "data.txt";
        int lineNumber = 1;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Line " + lineNumber + ": " + line);
                lineNumber++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
}

}
