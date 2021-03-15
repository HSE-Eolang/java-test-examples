package eo.test;

import eo.org.eolang.core.EOObject;
import eo.org.eolang.core.data.EOData;

public class EOInsert extends EOObject {
    private EOObject[] arr;
    private EOObject element;
    private EOObject position;

    public EOInsert(EOObject[] arr, EOObject element, EOObject position){
        this.arr = arr;
        this.element = element;
        this.position = position;
    }

    @Override
    public EOData _getData() {
        return super._getData();
        // TO DO
    }
}
