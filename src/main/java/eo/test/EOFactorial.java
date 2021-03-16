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
        System.out.println("n is: " + n._getData().toInt());
        return new EOif(
                new EOless(n, new EODataObject(2)),
                new EODataObject(1L),
                new EOmul(n, new EOFactorial(new EOsub(n, new EODataObject(1))))

        )._setParent(this)._getData();
    }
}