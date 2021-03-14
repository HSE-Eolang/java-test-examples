package eo.test;

import eo.org.eolang.calc.*;
import eo.org.eolang.core.EOObject;
import eo.org.eolang.core.data.EOData;
import eo.org.eolang.core.data.EODataObject;

public class EOfactorial extends EOObject {
    private EOObject n;

    public EOfactorial(EOObject object){
        this.n = object._setParent(this);
    }

    @Override
    public EOData _getData() {
        return new EOif(
                new EOless(n, new EODataObject(2)),
                new EODataObject(1L),
                new EOmul(
                        n,
                        new EOfactorial(
                                new EOsub(n, new EODataObject(1))
                        )
                )
        )._setParent(this)._getData();
    }
}
