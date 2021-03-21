package eo.test;

import eo.org.eolang.calc.EOadd;
import eo.org.eolang.calc.EOequal;
import eo.org.eolang.calc.EOif;
import eo.org.eolang.core.EOObject;
import eo.org.eolang.core.EOObjectArray;
import eo.org.eolang.core.data.EOData;
import eo.org.eolang.core.data.EODataObject;

import java.util.Arrays;
import java.util.Optional;

public class EOCount extends EOObject {

    private EOObjectArray arr;
    private EOObject element;
    private EODataObject identity;

    public EOCount(EOObjectArray arr, EOObject element){

        this.arr = arr;
        this.element = element._setParent(this);
        identity = new EODataObject(0);
    }

    @Override
    public EOData _getData() {
        Optional<EOObject> count = Optional.ofNullable(Arrays.stream(arr.get_array())
                .reduce(new EODataObject(0), (result, current) ->
                        new EOif(
                                new EOequal(current, element),
                                identity,
                                new EOadd(identity, new EODataObject(1))
                        )
                ));
        return count.get()._setParent(this)._getData();
    }
}
