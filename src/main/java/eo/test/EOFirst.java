package eo.test;

import eo.org.eolang.core.EOObject;
import eo.org.eolang.core.EOObjectArray;
import eo.org.eolang.core.data.EOData;

import java.util.Optional;

public class EOFirst extends EOObject {
    private EOObjectArray arr;

    public EOFirst(EOObjectArray arr){
        this.arr = arr;
    }

    @Override
    public EOData _getData() {
        Optional<EOObject> res = arr._getFirst();
        return res.get()._getData();
    }
}
