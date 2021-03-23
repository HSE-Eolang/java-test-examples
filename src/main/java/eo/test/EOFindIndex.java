package eo.test;

import eo.org.eolang.core.EOObject;
import eo.org.eolang.core.EOObjectArray;
import eo.org.eolang.core.data.EOData;
import eo.org.eolang.core.data.EODataObject;

public class EOFindIndex extends EOObject {
    private EOObjectArray arr;
    private EOObject predicate;
    EODataObject i;

    public EOFindIndex(EOObjectArray arr, EOObject predicate){
        this.arr = arr;
        this.predicate = predicate._setParent(this);
        i = new EODataObject(0);
    }

    @Override
    public EOData _getData() {
        return _getAttribute("SubFindIndex" , arr, _getAttribute("predicate"), _getAttribute("i"))._setParent(this)._getData();
    }
}
