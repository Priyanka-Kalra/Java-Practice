package InheritanceDemo;

public class AdvCal extends Calc {

    public AdvCal(int val1, int val2) {
        super(val1, val2);
    }

    public int prod() {
        return val1 * val2;
    }

    public int div() {
        return val1 / val2;
    }
}
