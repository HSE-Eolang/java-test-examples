package eo.test;

import eo.org.eolang.core.EOObject;
import eo.org.eolang.core.EOObjectArray;
import eo.org.eolang.core.data.EOData;

public class EOFindIndex extends EOObject {
    private EOObjectArray arr;
    private EOObject predicate;

    public EOFindIndex(EOObjectArray arr, EOObject predicate){
        this.arr = arr;
        this.predicate = predicate._setParent(this);
    }

    @Override
    public EOData _getData() {
        return super._getData();
        // To DO
    }
}
