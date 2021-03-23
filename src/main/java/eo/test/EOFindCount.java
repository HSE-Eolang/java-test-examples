package eo.test;

import eo.org.eolang.calc.EOadd;
import eo.org.eolang.calc.EOequal;
import eo.org.eolang.calc.EOif;
import eo.org.eolang.core.EOObject;
import eo.org.eolang.core.EOObjectArray;
import eo.org.eolang.core.data.EOData;
import eo.org.eolang.core.data.EODataObject;

import java.util.stream.Stream;

public class EOFindCount extends EOObject {

    private EOObjectArray arr;
    private EOObject element;

    public EOFindCount(EOObjectArray arr, EOObject element){
        this.arr = arr;
        this.element = element._setParent(this);
    }

    @Override
    public EOData _getData() {
        EOObject count = Stream.of(arr.get_array())
                .reduce(new EODataObject(0), (result, current) ->
                        new EODataObject(
                                new EOif(
                                        new EOequal(current, element),
                                        new EOadd(result, new EODataObject(1)),
                                        new EOadd(result, new EODataObject(0))
                                )._getData()
                        )
                );
        return count._setParent(this)._getData();
    }
}
