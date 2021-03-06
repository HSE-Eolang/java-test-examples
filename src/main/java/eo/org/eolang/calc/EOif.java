package eo.org.eolang.calc;

import eo.org.eolang.core.data.EOData;
import eo.org.eolang.core.EOObject;

/**
 * An object that is an analogue of the if control in other languages.
 * The free attribute cond (condition) determines which of the objects will be datarized by obj1 or obj2 for
 * calculating the result of dateization of this object.
 */
public class EOif extends EOObject {
    private EOObject cond;
    private EOObject obj1;
    private EOObject obj2;

    public EOif( EOObject cond, EOObject obj1, EOObject obj2){
        this.cond = cond._setParent(this);
        this.obj1 = obj1._setParent(this);
        this.obj2 = obj2._setParent(this);
    }

    @Override
    public EOData _getData() {
        Boolean boolCond = cond._getData().toBoolean();
        EOData res;
        if(boolCond){
            res = obj1._getData();
        }else {
            res = obj2._getData();
        }
        _freeAttributes();
        return res;
    }
}
