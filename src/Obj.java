import static java.lang.System.out;

public class Obj {
    private int Digit;
    private boolean Switch;

    public Obj(int Digit, boolean Switch) {
        this.Digit = Digit;
        this.Switch = Switch;
    }

    public void showInfo() {
        out.printf("Digit: %s,%nSwitch: %s%n", this.Digit, this.Switch);
    }

    public Obj setDigit(int Digit) {
        this.Digit = Digit;
        return this;
    }

    public Obj setSwitch(boolean Switch) {
        this.Switch = Switch;
        return this;
    }
}
