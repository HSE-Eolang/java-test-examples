package eo.test;

import eo.org.eolang.calc.EOand;
import eo.org.eolang.calc.EOleq;
import eo.org.eolang.core.EOObject;
import eo.org.eolang.core.EOObjectArray;
import eo.org.eolang.core.data.EOData;
import eo.org.eolang.core.data.EODataObject;
import eo.org.eolang.txt.EOsprintf;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class EOArrToStrArr extends EOObject {

    private EOObjectArray arr;
    private EOObject format;

    public EOArrToStrArr(EOObjectArray arr, EOObject format){
        this.arr = arr;
        this.format = format._setParent(this);
    }

    @Override
    public EOData _getData() {
        // TO DO
        Stream<Object> strarr = Arrays.stream(arr.get_array())
                .map(eoObject -> new EOsprintf(format, eoObject));
        return (EOData) strarr;
    }
}
