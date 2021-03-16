package eo.test;

import eo.org.eolang.core.EOObject;
import eo.org.eolang.core.data.EOData;

public class EOCount extends EOObject {

    private EOObject[] arr;
    private EOObject element;

    public EOCount(EOObject[] arr, EOObject element){

        this.arr = arr;
        this.element = element;
    }

    @Override
    public EOData _getData() {
        return super._getData();
        // TO DO
    }
}
