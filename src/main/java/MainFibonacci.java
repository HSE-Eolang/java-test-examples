import eo.org.eolang.core.EOObjectArray;
import eo.org.eolang.core.data.EODataObject;
import eo.org.eolang.core.EOObject;
import eo.org.eolang.io.EOstdout;
import eo.org.eolang.txt.EOsprintf;
import eo.test.*;

public class MainFibonacci {
    public static void main(String[] args) {
        int arg = 3;
        EOObjectArray arr = new EOObjectArray(new EODataObject(3), new EODataObject(38), new EODataObject(8));

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
