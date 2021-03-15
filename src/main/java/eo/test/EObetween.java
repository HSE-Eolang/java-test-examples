package eo.test;

import eo.org.eolang.calc.EOand;
import eo.org.eolang.calc.EOleq;
import eo.org.eolang.core.EOObject;
import eo.org.eolang.core.data.EOData;

public class EObetween extends EOObject {
    private EOObject left;
    private EOObject right;
    private EOObject x;

    public EObetween(EOObject x, EOObject left, EOObject right){
        this.left = left._setParent(this);
        this.right = right._setParent(this);
        this.x = x._setParent(this);
    }

    @Override
    public EOData _getData() {
        // bug
        return new EOand(
                new EOleq(left, x),
                new EOleq(x, right)
        )._setParent(this)._getData();
    }
}
