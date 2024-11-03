package InheritanceDemo;

public class Calc {

    int val1;
    int val2;

    public Calc(int val1, int val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public int add() {
        return val1 + val2;
    }

    public int diff() {
        return val1 - val2;
    }
}
