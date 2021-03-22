package eo.test;

import eo.org.eolang.calc.EOadd;
import eo.org.eolang.calc.EOif;
import eo.org.eolang.core.EOObject;
import eo.org.eolang.core.data.EOData;
import eo.org.eolang.core.data.EODataObject;

public class EOBinaryTree$SubCount extends EOObject {
    public EONode node;

    public EOBinaryTree$SubCount(EONode node){
        this.node = node;
    }

    @Override
    public EOData _getData() {
        return new EOif(
                node.empty,
                new EODataObject(0),
                new EOadd(
                        new EODataObject(1),
                        new EOadd(
                                _getAttribute("SubCount", node.left),
                                _getAttribute("SubCount", node.right)
                        )
                )
        )._setParent(this)._getData();
    }
}