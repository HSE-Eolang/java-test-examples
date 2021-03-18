package eo.org.eolang.core.data;

import eo.org.eolang.core.EOObject;

/**
 * Base class for objects representing arithmetic, logical and other operations on data.
 * Objects of this type have the ability to perform dataization upon creation and cache the result.
 */
public abstract class EOExpressionObject extends EOObject {
    /**
     * Cached data
     */
    protected  EOData _data;
    public boolean _isCalculable(){return _data!=null;}
}