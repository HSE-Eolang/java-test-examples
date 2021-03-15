package eo.test;

import eo.org.eolang.core.EOObject;
import eo.org.eolang.core.data.EOData;
import eo.org.eolang.core.data.EODataObject;

public class EOReverse extends EOObject {

    private EOObject arr;

    public EOReverse(EOObject arr){
        this.arr = arr;
    }

    @Override
    public EOData _getData() {
        return super._getData();
//        TO DO
    }
}
