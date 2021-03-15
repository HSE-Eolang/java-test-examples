import eo.org.eolang.core.data.EODataObject;
import eo.org.eolang.core.EOObject;
import eo.org.eolang.io.EOstdout;
import eo.org.eolang.txt.EOsprintf;
import eo.test.EOFactorial;
import eo.test.EObetween;

import java.util.Arrays;

public class MainFibonacci {
    public static void main(String[] args) {
        int arg = 5;

        int arg1 = 4;
        int arg2 = 6;
        EOObject stdout = new EOstdout(
                new EOsprintf(
                        new EODataObject("%d is %d\n"),
                        new EODataObject(arg),
//                        new EOFactorial(new EODataObject(arg))
                        new EObetween(new EODataObject(arg), new EODataObject(arg1), new EODataObject(arg2))
                )
        );
        stdout._getData();
    }
}
