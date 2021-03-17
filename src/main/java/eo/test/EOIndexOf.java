package eo.test;

import eo.org.eolang.core.EOObject;
import eo.org.eolang.core.EOObjectArray;
import eo.org.eolang.core.data.EOData;
import eo.org.eolang.core.data.EODataObject;

public class EOIndexOf extends EOObject {
    private EOObjectArray arr;
    private EOObject element;

    public EOIndexOf(EOObjectArray arr, EOObject element){
        this.arr = arr;
        this.element = element._setParent(this);
    }

    @Override
    public EOData _getData() {
        return new EOIndexOf$EOSubIndexOf(
                this.arr,
                this.element,
                new EODataObject(0)
        )._setParent(this)._getData();
    }
}
