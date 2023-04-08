public class ArithmeticOperations {
    private double a;
    private String operator;
    private double b;

    public ArithmeticOperations(double a, String operator, double b) {
        this.a = a;
        this.operator = operator;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
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
