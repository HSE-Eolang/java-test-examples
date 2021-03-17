package eo.test;

import eo.org.eolang.calc.EOequal;
import eo.org.eolang.calc.EOif;
import eo.org.eolang.core.EOObject;
import eo.org.eolang.core.EOObjectArray;
import eo.org.eolang.core.data.EOData;

public class EOIMax extends EOObject {
    private EOObjectArray arr;
    private EOObject element;

    public EOIMax(EOObjectArray arr, EOObject element){
        this.arr = arr;
        this.element = element;
    }

    @Override
    public EOData _getData() {
        return super._getData();
        // TO DO
    }

}
