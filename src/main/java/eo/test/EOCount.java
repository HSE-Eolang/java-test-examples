package eo.test;

import eo.org.eolang.core.EOObject;
import eo.org.eolang.core.EOObjectArray;
import eo.org.eolang.core.data.EOData;

public class EOCount extends EOObject {

    private EOObjectArray arr;
    private EOObject element;

    public EOCount(EOObjectArray arr, EOObject element){

        this.arr = arr;
        this.element = element._setParent(this);
    }

    @Override
    public EOData _getData() {
        return super._getData();
        // TO DO
    }
}
