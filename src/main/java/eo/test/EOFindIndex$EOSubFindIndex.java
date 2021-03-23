package eo.test;

import eo.org.eolang.calc.EOadd;
import eo.org.eolang.calc.EOequal;
import eo.org.eolang.calc.EOif;
import eo.org.eolang.core.EOObject;
import eo.org.eolang.core.EOObjectArray;
import eo.org.eolang.core.data.EOData;
import eo.org.eolang.core.data.EODataObject;

public class EOFindIndex$EOSubFindIndex extends EOObject {
    private EOObjectArray arr;
    private EOObject predicate;
    private EOObject i;

    public EOFindIndex$EOSubFindIndex(EOObjectArray arr, EOObject predicate, EOObject i){
        this.arr = arr;
        this.predicate = predicate._setParent(this);
        this.i = i._setParent(this);
    }

    @Override
    public EOData _getData() {
        return new EOif(
                new EOequal(arr.length, i),
                new EODataObject(-1),
                new EODataObject(
                        new EOif(
//                        new EODataObject(predicate._getData().toBoolean()),
                                new EOequal(arr.get(i), _getAttribute("predicate")),
                                _getAttribute("i"),
                                new EOFindIndex$EOSubFindIndex(arr, _getAttribute("predicate"), new EOadd(_getAttribute("i"), new EODataObject(1)))
                        )._getData()
                )
        )._setParent(this)._getData();
    }
}
