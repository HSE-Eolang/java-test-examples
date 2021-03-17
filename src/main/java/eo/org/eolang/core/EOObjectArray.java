package eo.org.eolang.core;

import eo.org.eolang.core.data.EOData;
import eo.org.eolang.core.data.EODataObject;
import eo.org.eolang.core.data.EONoData;

import java.util.Arrays;
import java.util.Optional;

public class EOObjectArray extends EOObject{
    public EOObject length;
    protected EOObject[] _array;

    public EOObjectArray(){
        _array = new EOObject[0];
    }

    public EOObjectArray(EOObject... objects){
        _array = objects;
        length =  new EODataObject(_array.length);
    }

    @Override
    public EOData _getData(){
        return Arrays.stream(_array)
                .map(eoObject -> eoObject._getData())
                .skip(_array.length - 1).findFirst()
                .orElse(new EONoData());
    }

    public Optional<EOObject> _getFirst(){
        return Arrays.stream(_array).findFirst();
    }

    public EOObject get(EOObject a){
        return _array[a._getData().toInt()];
    }

}
