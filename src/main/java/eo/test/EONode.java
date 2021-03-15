package eo.test;

import eo.org.eolang.core.EOObject;
import eo.org.eolang.core.data.EOData;
import eo.org.eolang.core.data.EODataObject;

public class EONode extends EOObject {

    private EOObject value;
    private EOObject left;
    private EOObject right;
    private EOObject empty;

    public EONode(EOObject v, EOObject l, EOObject r){
        this.value = v;
        this.left = l;
        this.right = r;
        this.empty = new EODataObject(false);

    }

    @Override
    public EOData _getData() {
        return super._getData();
        // TO DO
    }
}
