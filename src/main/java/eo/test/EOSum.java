package eo.test;

import eo.org.eolang.calc.EOadd;
import eo.org.eolang.core.EOObject;
import eo.org.eolang.core.EOObjectArray;
import eo.org.eolang.core.data.EOData;
import eo.org.eolang.core.data.EODataObject;
import eo.org.eolang.core.data.EONoData;

import java.util.Arrays;
import java.util.Optional;

public class EOSum extends EOObject {
    private EOObjectArray arr;

    public EOSum(EOObjectArray arr){
        this.arr = arr;
    }

    @Override
    public EOData _getData() {
        Optional<EOObject> sum = Arrays.stream(arr.get_array())
                .reduce((num, num1) -> new EOadd(num, num1));
        return sum.get()._setParent(this)._getData();
    }
}
