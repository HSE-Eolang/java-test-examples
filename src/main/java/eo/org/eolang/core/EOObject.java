package eo.org.eolang.core;

import eo.org.eolang.core.data.EOData;
import eo.org.eolang.core.data.EODataObject;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Arrays;


/**
 * Basic EO object. Based on this class, classes are created for creating user objects.
 */
public  abstract  class  EOObject  implements  Cloneable {
    /**
     * Link to the parent of the object
     */
    protected EOObject _parent;

    /**
     * Checking if an object can be datarized when creating a datarized object for caching.
     * A variant of solving the problem of exponential growth of datarization time during recursion.
     * @return the boolean
     */
    public boolean _isCalculable(){return false;}

    /**
     * Setting the parent object.
     *
     * @param _parent The parent object
     * @return this
     */
    public EOObject _setParent(EOObject _parent){
        if(this._parent == null)
            this._parent = _parent;
        return this;
    }

    /**
     * Function that performs dateization of the object
     *
     * @return Data
     */
    public EOData _getData(){
        _freeAttributes();
        return new EOData("");
    }

    /**
     * Creation of a copy of an object.
     *
     * @return a copy of the object
     */
    public EOObject _clone() {
        try{
            EOObject res  = (EOObject)this.clone();
            for (Field field : this.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                EOObject value = (EOObject)field.get(this);
                //field.set(this, value._clone());
                field.set(this, value);
            }
            return res;
        }catch (CloneNotSupportedException cnsException){
            cnsException.printStackTrace();
        }catch (IllegalAccessException iaException){
            iaException.printStackTrace();
        }
        return new EODataObject();

    }

    /**
     * Assigning the object's attributes to null for later removal of the attributes by the garbage collector.
     */
    public void _freeAttributes(){
        for (Field field : this.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            try {
                field.set(this, null);
            } catch (IllegalAccessException e) {
                e . printStackTrace ();
            }

        }
    }

    /**
     * Copying an attribute of an object by name.
     *
     * @param name Object name
     * @return Object Attribute
     */
    public EOObject _getAttribute(String name) {
        EOObject res = new EODataObject();
        try{
            for (Field field : this.getClass().getDeclaredFields()) {
                if (field.getName().equals(name)) {
                    field.setAccessible(true);
                    EOObject value = (EOObject) field.get(this);
                    return value._clone();
                }

            }
        }catch (IllegalAccessException iaException){}
        try{
            Class<?> attClasss = Class.forName(this.getClass().getName()+"$EO"+name);
            Constructor<?> attConstructor = attClasss.getConstructor();
            return (EOObject)attConstructor.newInstance();
        } catch (Exception e) {}
        if(_parent != null){
            res = _parent._getAttribute(name);
        }
        try{
            if(((EODataObject) res).isNoData()){
                Class<?> attClasss = Class.forName(this.getClass().getPackage().getName() +".EO"+name);
                Constructor<?> attConstructor = attClasss.getConstructor();
                return (EOObject)attConstructor.newInstance();
            }

        } catch (Exception e) {}
        return res;
    }

    /**
     * Copying an attribute of an object by name with the installation of free attributes
     *
     * @param name Object name
     * @Param freeAtt Available attributes
     * @return Object Attribute
     */
    public EOObject _getAttribute(String name, EOObject... freeAtt) {
        EOObject res = new EODataObject();
        try {
            String className = this.getClass().getName()+"$EO"+name;
            Class<?> attClasss = Class.forName(className);;
            Constructor<?> attConstructor = Arrays.stream(attClasss.getConstructors())
                    .filter(constructor -> constructor.getParameterTypes().length == freeAtt.length)
                    .findFirst().get();
            return (EOObject)attConstructor.newInstance((Object[])freeAtt);
        } catch (Exception e) {}
        if(_parent != null){
            res = _parent._getAttribute(name, (EOObject[])freeAtt);
        }
        try{
            if(((EODataObject) res).isNoData()){
                String className = this.getClass().getPackage().getName() +".EO"+name;
                Class<?> attClasss = Class.forName(className);
                Constructor<?> attConstructor = Arrays.stream(attClasss.getConstructors())
                        .filter(constructor -> constructor.getParameterTypes().length == freeAtt.length)
                        .findFirst().get();
                return (EOObject)attConstructor.newInstance((Object[])freeAtt);
            }

        } catch (Exception e) {}
        return res;
    }
}