package eo.test;

import eo.org.eolang.calc.EOadd;
import eo.org.eolang.calc.EOif;
import eo.org.eolang.core.EOObject;
import eo.org.eolang.core.data.EOData;
import eo.org.eolang.core.data.EODataObject;

public class EONode extends EOObject {

    public EOObject value;
    public EONode left;
    public EONode right;
    public EOObject empty;

    public EONode(EOObject v, EONode l, EONode r){
        this.value = v._setParent(this);
        this.left = l;
        this.right = r;
        this.empty = new EODataObject(false);

    }

    @Override
    public EOData _getData() {
        return super._getData();
    }
}
