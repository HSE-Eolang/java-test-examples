package eo.test;

import eo.org.eolang.core.EOObject;
import eo.org.eolang.core.EOObjectArray;
import eo.org.eolang.core.data.EOData;

import java.util.Arrays;

public class EOMerge extends EOObject {
    private EOObjectArray arr1;
    private EOObjectArray arr2;

    public EOMerge(EOObjectArray arr1, EOObjectArray arr2){
        this.arr1 = arr1;
        this.arr2 = arr2;
    }

    @Override
    public EOData _getData() {
//        Arrays.stream(arr1.get_array())
//                .reduce((arr1,arr2) -> arr1 )

        return super._getData();
        // TO DO
    }
}
