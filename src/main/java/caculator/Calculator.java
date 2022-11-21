package caculator;

public class Calculator {

    private int first, second, result;

    public void setFirst(int first) {
        this.first = first;
    }

    public void setSecond(int arg0) {
        second = arg0;
    }

    public void add() {
        result = first + second;
    }

    public int getResult() {
        return result;
    }

    public void mul() {
        result = first * second;
    }
}
