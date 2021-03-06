package eo.org.eolang.core.data;

/**
 * The object representing the data is the result of dateization in EO.
 */
public  class  EOData {
    /**
     * Data
     */
    private Object _data;

    public EOData(Object _data){
        this._data = _data;
    }

    /**
     * Casting data type to string
     */
    @Override
    public String toString() {
        if(_data.getClass().equals(String.class) ){
            return (String)_data;
        }
        if(_data.getClass().equals(Long.class) ){
            return _data.toString();
        }
        if(_data.getClass().equals(Integer.class) ){
            return _data.toString();
        }
        return "";
    }

    public Object toObject() {
        return _data;
    }

    /**
     * Casting data type to integer
     */
    public Long toLong() {
        if(_data.getClass().equals(Long.class)){
            return (Long)_data;
        }
        if(_data.getClass().equals(Integer.class) ){
            return Long.valueOf((Integer)_data);
        }
        return 0L;
    }

    /**
     * Casting data type to integer
     */
    public int toInt() {
        if(_data.getClass().equals(Long.class)){
            return (Integer)_data;
        }
        if(_data.getClass().equals(Integer.class) ){
            return Integer.valueOf((Integer)_data);
        }
        return 0;
    }

    /**
     * Casting data type to boolean
     */
    public  Boolean  toBoolean () {
        if(_data.getClass().equals(Boolean.class) ){
            return (Boolean)_data;
        }
        if(_data.getClass().equals(Long.class)){
            return (Long)_data != 0L;
        }
        if(_data.getClass().equals(Integer.class) ){
            return (Integer)_data != 0;
        }

        return false;
    }
}