package eo.org.eolang.core;

import eo.org.eolang.calc.EOequal;
import eo.org.eolang.calc.EOgreater;
import eo.org.eolang.calc.EOif;
import eo.org.eolang.core.data.EOData;
import eo.org.eolang.core.data.EODataObject;
import eo.org.eolang.core.data.EONoData;

import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;
import java.util.stream.Stream;

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

    public EOObject _getLast(){
        return _array[_array.length-1];
    }

    public EOObject get(EOObject a){
        return _array[a._getData().toInt()];
    }

    public EOData append(EOObject element){
        EOObject[] temp = _array;
        _array = new EOObject[_array.length + 1];

        if (_array.length - 1 >= 0) System.arraycopy(temp, 0, _array, 0, _array.length - 1);

        _array[_array.length-1] = element;

        return _getData();
    }

    public EOObject[] get_array(){
        return _array;
    }

}
