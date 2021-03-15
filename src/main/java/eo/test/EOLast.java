package eo.test;

import eo.org.eolang.core.EOObject;
import eo.org.eolang.core.data.EOData;

public class EOLast extends EOObject {
    private EOObject[] arr;

    public EOLast(EOObject[] arr){
        this.arr = arr;
    }

    @Override
    public EOData _getData() {
        return super._getData();
        // TO DO
    }
}
