package eo.test;

import eo.org.eolang.core.EOObject;
import eo.org.eolang.core.data.EOData;

public class EOFindIndex extends EOObject {
    private EOObject[] arr;
    private EOObject predicate;

    public EOFindIndex(EOObject[] arr, EOObject predicate){
        this.arr = arr;
        this.predicate = predicate;
    }

    @Override
    public EOData _getData() {
        return super._getData();
        // To DO
    }
}
