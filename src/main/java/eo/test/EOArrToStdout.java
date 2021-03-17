package eo.test;

import eo.org.eolang.calc.EOand;
import eo.org.eolang.calc.EOleq;
import eo.org.eolang.core.EOObject;
import eo.org.eolang.core.EOObjectArray;
import eo.org.eolang.core.data.EOData;
import eo.org.eolang.core.data.EODataObject;
import eo.org.eolang.io.EOstdout;
import eo.org.eolang.txt.EOsprintf;

public class EOArrToStdout extends EOObject {

    private EOObjectArray arr;
    private EOObject format;

    public EOArrToStdout(EOObjectArray arr, EOObject format){

        this.arr = arr;
        this.format = format._setParent(this);
    }

    @Override
    public EOData _getData() {
        return new EOstdout(
                new EOsprintf(format, new EODataObject(4))
        )._setParent(this)._getData();
    }
}
