package eo.test;

import eo.org.eolang.core.EOObject;
import eo.org.eolang.core.data.EOData;

public class EOSlice extends EOObject {
    private EOObject[] arr;
    private EOObject start;
    private EOObject end;

    public EOSlice(EOObject[] arr, EOObject start, EOObject end){
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    public EOData _getData() {
        return super._getData();
        // TO DO
    }
}
