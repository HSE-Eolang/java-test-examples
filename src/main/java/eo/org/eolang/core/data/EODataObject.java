package eo.org.eolang.core.data;

import eo.org.eolang.core.EOObject;
import eo.org.eolang.core.data.EOData;

import java.lang.reflect.Field;

/**
 * Object storing data, used to work with Data Objects from EO.
 */
public class EODataObject extends EOObject {

    /**
     * Stored data.
     */
    protected  EOData _data;

    public boolean _isCalculable(){return true;}

    public EODataObject(Object _data) {
        this._data = new EOData(_data);
    }

    public EODataObject() {
        this._data = new EONoData();
    }

    public  EODataObject ( EOData  _data ) {
        this._data = _data;
    }

    /**
     * Dateization of the object.
     */
    public EOData _getData() {
        return _data;
    }

    public  boolean  isNoData () {
        return _data.getClass().equals(EONoData.class);
    }

    public EOObject _clone() {
        try{
            EOObject res  = (EOObject)this.clone();
            return res;
        }catch (CloneNotSupportedException cnsException){
            cnsException.printStackTrace();
        }
        return new EODataObject();
    }
}