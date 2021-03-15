package eo.test;

import eo.org.eolang.core.EOObject;
import eo.org.eolang.core.data.EOData;
import eo.org.eolang.core.data.EODataObject;

public class EOLeaf extends EOObject {
    private EOObject empty = new EODataObject(true);;

    public EOLeaf(){
        _setParent(empty);
    }

    @Override
    public EOData _getData() {
        return super._getData();
        // TO DO
    }

    @Override
    public EOObject _setParent(EOObject _parent) {
        return super._setParent(_parent);
    }
}
