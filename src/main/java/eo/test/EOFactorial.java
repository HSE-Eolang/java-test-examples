package eo.test;

import eo.org.eolang.calc.*;
import eo.org.eolang.core.EOObject;
import eo.org.eolang.core.data.EOData;
import eo.org.eolang.core.data.EODataObject;

public class EOFactorial extends EOObject {
    private EOObject n;

    public EOFactorial(EOObject object){
        this.n = object._setParent(this);
    }

    @Override
    public EOData _getData() {
        return new EOif(
                new EOless(n, new EODataObject(2)),
                new EODataObject(1L),
                new EOmul(
                        new EOFactorial(
                                new EODataObject(new EOsub(n, new EODataObject(1)))
                        ),
                        n
                )
        )._setParent(this)._getData();
    }
}
