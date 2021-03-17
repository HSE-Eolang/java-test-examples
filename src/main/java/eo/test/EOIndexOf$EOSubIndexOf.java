package eo.test;

import eo.org.eolang.calc.EOadd;
import eo.org.eolang.calc.EOequal;
import eo.org.eolang.calc.EOif;
import eo.org.eolang.calc.EOsub;
import eo.org.eolang.core.EOObject;
import eo.org.eolang.core.EOObjectArray;
import eo.org.eolang.core.data.EOData;
import eo.org.eolang.core.data.EODataObject;

public class EOIndexOf$EOSubIndexOf extends EOObject {
    private EOObjectArray arr;
    private EOObject element;
    private EOObject i;
    private EOObject negOne;
    private EOObject one;

    public EOIndexOf$EOSubIndexOf(EOObjectArray arr, EOObject element, EOObject i){
        this.arr = arr;
        this.element = element._setParent(this);
        this.i = i._setParent(this);
        this.negOne = new EODataObject(-1);
        this.one = new EODataObject(1);
    }

    @Override
    public EOData _getData() {
        return new EOif(
                new EOequal(arr.length, i),
                negOne,
                new EOif(
                        new EOequal(element, arr.get(i)),
                        i,
                        new EOIndexOf$EOSubIndexOf(arr, element, new EOadd(i, this.one))
                )
        )._setParent(this)._getData();
    }
}
