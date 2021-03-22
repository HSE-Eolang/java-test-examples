package eo.test;

import eo.org.eolang.core.EOObject;
import eo.org.eolang.core.EOObjectArray;
import eo.org.eolang.core.data.EOData;

public class EOUnique extends EOObject {
    private EOObjectArray arr;

    public EOUnique(EOObjectArray arr){
        this.arr = arr;
    }

    @Override
    public EOData _getData() {
        return super._getData();
        // TO DO
    }
}
