import eo.org.eolang.core.data.EODataObject;
import eo.org.eolang.core.EOObject;
import eo.org.eolang.io.EOstdout;
import eo.org.eolang.txt.EOsprintf;
import eo.test.*;

public class MainFibonacci {
    public static void main(String[] args) {
        int arg = 3;

        EOObject stdout = new EOstdout(
                new EOsprintf(
                        new EODataObject("Factorial of %d is %s\n"),
                        new EODataObject(arg),
                        new EOFactorial(new EODataObject(arg))
                )
        );
        stdout._getData();
    }
}
