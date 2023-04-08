public class ArithmeticOperations {
    private int a;
    private String operator;
    private int b;

    public ArithmeticOperations(int a, String operator, int b) {
        this.a = a;
        this.operator = operator;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public double calculateWithOperator() {
        return switch (operator) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / (double) b;
            default -> 0;
        };
    }
}
