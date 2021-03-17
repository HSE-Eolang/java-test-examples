package eo.test;

import eo.org.eolang.calc.*;
import eo.org.eolang.core.EOObject;
import eo.org.eolang.core.data.EOData;
import eo.org.eolang.core.data.EODataObject;

public class EOFactorial extends EOObject {
    private EOObject n;

    public EOFactorial(EOObject n){
        this.n = n;
    }

    @Override
    public EOData _getData() {
        EOData res = new EOif(
                new EOless(_getAttribute("n"), new EODataObject(2)),
                new EODataObject(1L),
                new EOmul( // stackoverflowerror
                        _getAttribute("n"),
                        _getAttribute("Factorial",
                                new EOsub(_getAttribute("n"),
                                        new EODataObject(1))))

        )._setParent(this)._getData();
        _freeAttributes();
        return res;
    }
}