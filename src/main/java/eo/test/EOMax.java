package eo.test;

import eo.org.eolang.calc.EOadd;
import eo.org.eolang.calc.EOequal;
import eo.org.eolang.calc.EOgreater;
import eo.org.eolang.calc.EOif;
import eo.org.eolang.core.EOObject;
import eo.org.eolang.core.EOObjectArray;
import eo.org.eolang.core.data.EOData;
import eo.org.eolang.core.data.EODataObject;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class EOMax extends EOObject {
    private EOObjectArray arr;

    public EOMax(EOObjectArray arr){
        this.arr = arr;
    }

    @Override
    public EOData _getData() {
        EOData max = Arrays.stream(arr.get_array())
                .reduce(
                        (EOObject num, EOObject num1) -> new EOif(new EOgreater(num, num1), num, num1))
                .get()._setParent(arr)._getData();
        return max;
        // TO DO
    }
}
