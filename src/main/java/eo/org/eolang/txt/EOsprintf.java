package eo.org.eolang.txt;

import eo.org.eolang.core.data.EOData;
import eo.org.eolang.core.EOObject;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

public class EOsprintf extends EOObject {
    private EOObject format;
    private EOObject[] data;

    public EOsprintf(EOObject format, EOObject... data){
        this.format = format._setParent(this);
        this.data = data;
        for(EOObject item: data){
            item._setParent(this);
        }
    }

    @Override
    public EOData _getData() {
        String sFormat = format._getData().toString();
        Object[] objects = Arrays.stream(data).map(obj -> obj._getData().toObject()).toArray();
        _freeAttributes();
        return  new EOData(
                String.format(
                        sFormat,
                        objects
                )
        );
    }
}
