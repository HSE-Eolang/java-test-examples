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
        this.n = n._setParent(this);
    }

    @Override
    public EOData _getData() {
        EOData res = new EOif(
                new EOless(n, new EODataObject(2L)),
                new EODataObject(1L),
                new EOmul( _getAttribute("n"), _getAttribute("Factorial", new EOsub(_getAttribute("n"), new EODataObject(1L))))

        )._setParent(this)._getData();
        return res;
    }
}