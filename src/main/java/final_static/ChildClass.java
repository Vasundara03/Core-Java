package final_static;

import final_static.ParentClass;


import final_static.ParentClass;

public class ChildClass extends ParentClass {

    private int ChildClass;


    public ChildClass(int parentVariable, int childClass) {
        super(parentVariable);
        this.ChildClass = childClass;
    }

    public ChildClass(int childClass){
        super(0);
        this.ChildClass = childClass;
    }

    public int getChildClass() {
        return ChildClass;
    }


}
