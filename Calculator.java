public class Calculator {

    private double firstNum;
    private double secondNum;

    public double getFirstNum() {
        return this.firstNum;
    }

    public double getSecondNum() {
        return this.secondNum;
    }

    public void setFirstNum(double val1) {
        this.firstNum = val1;
    }

    public void setSecondNum(double val2) {
        this.secondNum = val2;
    }

    public double getAdditionResult() {
        return firstNum + secondNum;
    }

    public double getSubstractionResult() {
        return firstNum - secondNum;
    }

    public double getMultiplicationResult() {
        return firstNum * secondNum;
    }

    public double getDivisionResult() {
        return firstNum / secondNum;
    }

}
