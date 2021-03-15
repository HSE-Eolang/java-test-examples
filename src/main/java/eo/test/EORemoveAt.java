package eo.test;

import eo.org.eolang.core.EOObject;
import eo.org.eolang.core.data.EOData;

public class EORemoveAt extends EOObject {
    private EOObject[] arr;
    private EOObject position;

    public EORemoveAt(EOObject[] arr, EOObject position){
        this.arr = arr;
        this.position = position;
    }

    @Override
    public EOData _getData() {
        return super._getData();
        // TO DO
    }
}
