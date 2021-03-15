package eo.test;

import eo.org.eolang.core.EOObject;
import eo.org.eolang.core.data.EOData;
import eo.org.eolang.core.data.EODataObject;

public class EOPi extends EOObject {
    private EOObject pi = new EODataObject(3.1415926535);;

    public EOPi(){
        _setParent(pi);
    }

    @Override
    public EOData _getData() {
        return super._getData();
    }

    @Override
    public EOObject _setParent(EOObject _parent) {
        return super._setParent(_parent);
    }

    public EOObject compute(EOObject n){
//        TO DO
        return n;
    }
}
