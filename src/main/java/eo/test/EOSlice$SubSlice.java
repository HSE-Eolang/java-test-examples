package eo.test;

import eo.org.eolang.calc.EOadd;
import eo.org.eolang.calc.EOif;
import eo.org.eolang.calc.EOless;
import eo.org.eolang.core.EOObject;
import eo.org.eolang.core.EOObjectArray;
import eo.org.eolang.core.data.EOData;
import eo.org.eolang.core.data.EODataObject;

public class EOSlice$SubSlice extends EOObject {
    private EOObjectArray arr;
    private EOObject start;
    private EOObjectArray accum;
    private EOObject end;

    public EOSlice$SubSlice(EOObjectArray arr, EOObject start, EOObjectArray accum, EOObject end){
        this.arr = arr;
        this.start = start._setParent(this);
        this.accum = accum;
        this.end = end._setParent(this);
    }


    public EOObjectArray getData() {
//        TO DO

//        return new EOif(
//                new EOless(start, end),
//                new EOSlice$SubSlice(
//                        arr,
//                        accum.append(arr.get(start)),
//                        new EOadd(start, new EODataObject(1)),
//                        end),
//                accum
//        )._setParent(this)._getData();
        return arr;
    }
}
