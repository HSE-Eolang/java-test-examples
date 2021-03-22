package eo.test;

import eo.org.eolang.calc.EOadd;
import eo.org.eolang.calc.EOif;
import eo.org.eolang.core.EOObject;
import eo.org.eolang.core.data.EOData;
import eo.org.eolang.core.data.EODataObject;

public class EOBinaryTree$SubSum extends EOObject {
    public EONode node;

    public EOBinaryTree$SubSum(EONode node){
        this.node = node;
    }

    @Override
    public EOData _getData() {
        return new EOif(
                node.empty,
                new EODataObject(0),
                new EOadd(
                        node.value,
                        new EOadd(
                                _getAttribute("SubSum", node.left),
                                _getAttribute("SubSum", node.right)
                        )
                )
        )._setParent(this)._getData();
    }
}