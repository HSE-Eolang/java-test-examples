import eo.org.eolang.core.data.EODataObject;
import eo.org.eolang.core.EOObject;
import eo.org.eolang.io.EOstdout;
import eo.org.eolang.txt.EOsprintf;
import eo.test.EOfactorial;
import eo.test.EOfibonacci;

public class MainFibonacci {
    public static void main(String[] args) {
        int arg = 4;
        EOObject stdout = new EOstdout(
                new EOsprintf(
                        new EODataObject("%dth Fibonacci number is %d\n"),
                        new EODataObject(arg),
                        new EOfactorial(new EODataObject(arg))
                )
        );
        stdout._getData();
    }
}
