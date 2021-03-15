package eo.test;

import eo.org.eolang.core.EOObject;
import eo.org.eolang.core.data.EOData;

public class EOFirst extends EOObject {
    private EOObject arr;

    public EOFirst(EOObject arr){
        this.arr = arr;
    }

    @Override
    public EOData _getData() {
        return super._getData();
        // TO DO
    }
}
