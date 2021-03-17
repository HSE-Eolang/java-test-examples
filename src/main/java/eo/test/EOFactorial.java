package eo.test;

import eo.org.eolang.calc.*;
import eo.org.eolang.core.EOObject;
import eo.org.eolang.core.data.EOData;
import eo.org.eolang.core.data.EODataObject;
import eo.org.eolang.io.EOstdout;
import eo.org.eolang.txt.EOsprintf;

public class EOFactorial extends EOObject {
    private EOObject n;

    public EOFactorial(EOObject n){
        this.n = n;
    }

    @Override
    public EOData _getData() {
        EOData res = new EOif(
                new EOless(n, new EODataObject(2)),
                new EODataObject(1),
                new EOmul( n, new EOFactorial(new EOsub(n, new EODataObject(1))))

        )._setParent(this)._getData();
        return res;
    }
}