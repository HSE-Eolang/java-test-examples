package eo.test;

import eo.org.eolang.core.EOObject;
import eo.org.eolang.core.EOObjectArray;
import eo.org.eolang.core.data.EOData;

public class EOLast extends EOObject {
    private EOObjectArray arr;

    public EOLast(EOObjectArray arr){
        this.arr = arr;
    }

    @Override
    public EOData _getData() {
        EOData res = arr._getData();
        return res;
    }
}
