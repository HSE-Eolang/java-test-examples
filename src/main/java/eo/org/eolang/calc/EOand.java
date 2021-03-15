package eo.org.eolang.calc;

import eo.org.eolang.core.EOObject;
import eo.org.eolang.core.data.EODataObject;

public class EOand extends EODataObject {
    //TODO add float support
    public EOand(EOObject val1, EOObject val2){
        super(val1._getData().toBoolean() && val2._getData().toBoolean()); // always false
//        System.out.println(val1._getData().toBoolean() && val2._getData().toBoolean()); // this true/false
    }
}
