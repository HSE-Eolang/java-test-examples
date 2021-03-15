package eo.test;

import eo.org.eolang.core.EOObject;
import eo.org.eolang.core.data.EOData;

public class EOContains extends EOObject {

    private EOObject[] arr;
    private EOObject element;

    public EOContains(EOObject[] arr, EOObject element){
        this.arr = arr;
        this.element = element;
    }

    @Override
    public EOData _getData() {
        return super._getData();
//        To Do
    }
}
