import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        var sb = new StringBuilder();
        sb.append("good");
        out.println(sb);

        for (int i = 0; i < sb.length(); ++i) {
            out.print("=");
        }
        out.println();

        var o = new Obj(10, true);
        o.showInfo();

        o.setDigit(115).setSwitch(false).showInfo();

        var n = new Obj(33, false);
        n.showInfo();

        n.setDigitAndSwitch(555, true).showInfo();
    }
}
