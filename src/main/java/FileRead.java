import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileRead {
    public static List<String> readFileLines(String fileName) throws IOException {
        Scanner scanner = new Scanner(new File(fileName));
        List<String> fileLines = new ArrayList<>();
        while (scanner.hasNextLine()) {
            fileLines.add(scanner.nextLine());
        }
        scanner.close();
        return fileLines;
    }
}
