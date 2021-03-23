package eo.test;

import eo.org.eolang.calc.*;
import eo.org.eolang.core.EOObject;
import eo.org.eolang.core.EOObjectArray;
import eo.org.eolang.core.data.EOData;
import eo.org.eolang.core.data.EODataObject;

import java.util.Arrays;
import java.util.Optional;

public class EOMax extends EOObject {
    private EOObjectArray arr;

    public EOMax(EOObjectArray arr){
        this.arr = arr;
    }

    @Override
    public EOData _getData() {
//        EOData acc = new EODataObject(0)._getData();
//        for (EOObject eoObject : arr.get_array()) {
//            acc = new EOif(
//                    new EOgreater(new EODataObject(acc), eoObject),
//                    new EODataObject(acc),
//                    eoObject
//            )._getData();
//        }
        Optional<EOObject> reduce = Arrays.stream(arr.get_array())
                .reduce(
                        (accumulator, current) ->
                                new EODataObject(new EOif(new EOgreater(accumulator, current), accumulator, current)._setParent(this)._getData())
                );
        return reduce.get()._getData();
    }
}
