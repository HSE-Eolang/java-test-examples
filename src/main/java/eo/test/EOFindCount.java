package eo.test;

import eo.org.eolang.core.EOObject;
import eo.org.eolang.core.EOObjectArray;
import eo.org.eolang.core.data.EOData;

public class EOFindCount extends EOObject {

    private EOObjectArray arr;
    private EOObject predicate;

    public EOFindCount(EOObjectArray arr, EOObject predicate){
        this.arr = arr;
        this.predicate = predicate._setParent(this);
    }

    @Override
    public EOData _getData() {
        return super._getData();
        // TO DO
    }
}
