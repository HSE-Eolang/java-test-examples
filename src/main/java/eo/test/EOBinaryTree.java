package eo.test;

import eo.org.eolang.calc.EOadd;
import eo.org.eolang.calc.EOif;
import eo.org.eolang.core.EOObject;
import eo.org.eolang.core.data.EOData;
import eo.org.eolang.core.data.EODataObject;

public class EOBinaryTree extends EOObject {
    public EONode root;

    public EOBinaryTree(EONode root){
        this.root = root;
    }

    @Override
    public EOData _getData() {
        EOObject sum = subSum(root);
        EOObject count = subCount(root);
        return super._getData();
    }

    public EOObject subSum(EONode current){
        return new EOif(
                current.empty,
                new EODataObject(0),
                new EOadd(
                        current.value,
                        new EOadd(
                                subSum(current.left),
                                subSum(current.right)
                        )
                )
        );
    }

    public EOObject subCount(EONode current){
        return new EOif(
                current.empty,
                new EODataObject(0),
                new EOadd(
                        new EODataObject(1),
                        new EOadd(
                                subCount(current.left),
                                subCount(current.right)
                        )
                )
        );
    }
}