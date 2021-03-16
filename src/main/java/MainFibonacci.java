import eo.org.eolang.core.data.EODataObject;
import eo.org.eolang.core.EOObject;
import eo.org.eolang.io.EOstdout;
import eo.org.eolang.txt.EOsprintf;
import eo.test.EOFactorial;
import eo.test.EObetween;

import java.util.Arrays;

public class MainFibonacci {
    public static void main(String[] args) {
        int arg = 4;

        EOObject stdout = new EOstdout(
                new EOsprintf(
                        new EODataObject("Factorial of %d is %d\n"),
                        new EODataObject(arg),
                        new EOFactorial(new EODataObject(arg))
                )
        );
        stdout._getData();
    }
}
