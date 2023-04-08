import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void write(String fileName, String[] array) {
        try (
                var fileWriter = new FileWriter(fileName);
                var writer = new BufferedWriter(fileWriter)
        ) {
            for (String element : array) {
                writer.write(element);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Nie udało się zapisać pliku " + fileName);
        }
    }
}
