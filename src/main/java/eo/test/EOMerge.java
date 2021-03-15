package eo.test;

import eo.org.eolang.core.EOObject;
import eo.org.eolang.core.data.EOData;

public class EOMerge extends EOObject {
    private EOObject[] arr;
    private EOObject[] arr2;

    public EOMerge(EOObject[] arr, EOObject[] arr2){
        this.arr = arr;
        this.arr2 = arr2;
    }

    @Override
    public EOData _getData() {
        return super._getData();
        // TO DO
    }
}
