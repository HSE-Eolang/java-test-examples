package eo.org.eolang.calc;

import eo.org.eolang.core.EOObject;
import eo.org.eolang.core.data.EODataObject;

public class EOgreater extends EODataObject {
    //TODO add float support
    public EOgreater(EOObject val1, EOObject val2){
        super(val1._getData().toInt() > val2._getData().toInt());
    }
}
