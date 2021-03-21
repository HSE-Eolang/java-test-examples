package eo.test;

import eo.org.eolang.calc.EOadd;
import eo.org.eolang.core.EOObject;
import eo.org.eolang.core.EOObjectArray;
import eo.org.eolang.core.data.EOData;
import eo.org.eolang.core.data.EODataObject;

public class EORemoveAt extends EOObject {
    private EOObjectArray arr;
    private EOObject position;

    public EORemoveAt(EOObjectArray arr, EOObject position){
        this.arr = arr;
        this.position = position;
    }

    @Override
    public EOData _getData() {
        return new EOMerge(
                new EOSlice(arr, new EODataObject(0), position).getData(),
                new EOSlice(arr, new EOadd(position, new EODataObject(1)), arr.length).getData()
        )._setParent(this)._getData();

        // TO DO
    }
}
