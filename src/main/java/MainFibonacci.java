import eo.org.eolang.core.EOObjectArray;
import eo.org.eolang.core.data.EODataObject;
import eo.org.eolang.core.EOObject;
import eo.org.eolang.io.EOstdout;
import eo.org.eolang.txt.EOsprintf;
import eo.test.*;

public class MainFibonacci {
    public static void main(String[] args) {
        long arg = 31;
        EOObjectArray arr = new EOObjectArray(
                new EODataObject(72),
                new EODataObject(1),
                new EODataObject(12),
                new EODataObject(-19),
                new EODataObject(80),
                new EODataObject(11)

        );


        EOObject stdout = new EOstdout(
                new EOsprintf(
                        new EODataObject("Min of array is %s\n"),
                        new EOMin(arr)
                )
        );
        stdout._getData();
    }
}
