package eo.test;

import eo.org.eolang.core.EOObject;
import eo.org.eolang.core.EOObjectArray;
import eo.org.eolang.core.data.EOData;

public class EOSlice extends EOObject {
    private EOObjectArray arr;
    private EOObject start;
    private EOObject end;
    private EOObjectArray accum;

    public EOSlice(EOObjectArray arr, EOObject start, EOObject end){
        this.arr = arr;
        this.start = start._setParent(this);
        this.end = end._setParent(this);
        this.accum = new EOObjectArray();
    }

    public EOObjectArray getData() {
        return new EOSlice$SubSlice(arr, start, accum, end).getData();
    }
}
