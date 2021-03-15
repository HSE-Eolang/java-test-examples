package eo.test;

import eo.org.eolang.core.EOObject;
import eo.org.eolang.core.data.EOData;

public class EOInsertAll extends EOObject {
    private EOObject[] arr;
    private EOObject[] arr2;
    private EOObject position;

    public EOInsertAll(EOObject[] arr, EOObject[] arr2, EOObject position){
        this.arr = arr;
        this.arr2 = arr2;
        this.position = position;
    }

    @Override
    public EOData _getData() {
        return super._getData();
        // TO DO
    }
}
