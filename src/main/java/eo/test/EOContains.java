package eo.test;

import eo.org.eolang.calc.EOgreater;
import eo.org.eolang.core.EOObject;
import eo.org.eolang.core.EOObjectArray;
import eo.org.eolang.core.data.EOData;
import eo.org.eolang.core.data.EODataObject;

public class EOContains extends EOObject {

    private EOObjectArray arr;
    private EOObject element;

    public EOContains(EOObjectArray arr, EOObject element){
        this.arr = arr;
        this.element = element._setParent(this);
    }

    @Override
    public EOData _getData() {
        return new EOgreater(
                new EOIndexOf(arr, element),
                new EODataObject(-1)
        )._setParent(this)._getData();
    }
}
