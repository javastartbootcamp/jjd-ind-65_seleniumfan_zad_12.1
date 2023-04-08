import java.io.IOException;
import java.util.List;

class Test {
    private String[] calculatedFileLines;

    public static void main(String[] args) {
        Test test = new Test();
        test.run();
    }

    public void run() {
        try {
            String fileName = "operations.txt";
            List<String> fileLines = FileRead.readFileLines(fileName);
            calculatedFileLines = new String[fileLines.size()];

            parseAndCalculateFileLines(fileLines);
            printResults();
            FileWrite.write("operationsResult.txt", calculatedFileLines);
        } catch (IOException e) {
            System.err.println("Nie można odczytać pliku");
            e.printStackTrace();
        }
    }

    private void parseAndCalculateFileLines(List<String> fileLines) {
        for (int i = 0; i < fileLines.size(); i++) {
            String[] splitLineElements = fileLines.get(i).split("\\s");
            int a = Integer.parseInt(splitLineElements[0]);
            String operator = splitLineElements[1];
            int b = Integer.parseInt(splitLineElements[2]);
            ArithmeticOperations arithmeticOperations = new ArithmeticOperations(a, operator, b);
            double result = arithmeticOperations.calculateWithOperator();
            calculatedFileLines[i] = fileLines.get(i) + " = " + result;
        }
    }

    private void printResults() {
        for (String s : calculatedFileLines) {
            System.out.println(s);
        }
    }
}