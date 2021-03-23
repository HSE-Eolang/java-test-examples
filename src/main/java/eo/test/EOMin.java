package eo.test;

import eo.org.eolang.calc.EOgreater;
import eo.org.eolang.calc.EOif;
import eo.org.eolang.calc.EOless;
import eo.org.eolang.core.EOObject;
import eo.org.eolang.core.EOObjectArray;
import eo.org.eolang.core.data.EOData;
import eo.org.eolang.core.data.EODataObject;

import java.util.Arrays;
import java.util.Optional;

public class EOMin extends EOObject {
    private EOObjectArray arr;

    public EOMin(EOObjectArray arr){
        this.arr = arr;
    }

    @Override
    public EOData _getData() {
        Optional<EOObject> reduce = Arrays.stream(arr.get_array())
                .reduce(
                        (accumulator, current) ->
                                new EODataObject(new EOif(new EOless(accumulator, current), accumulator, current)._setParent(this)._getData())
                );
        return reduce.get()._getData();
    }
}
