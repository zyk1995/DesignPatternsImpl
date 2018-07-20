package com.zyk.prototype;

//如果要实现深度拷贝，则需要将实现了Cloneable接口并重写了clone方法的类中，所有的引用类型也全部实现Cloneable接口并重写clone方法，而且需要将引用类型的属性全部拷贝一遍
class Field1 implements Cloneable{

    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    protected Field1 clone() {
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException exception) {
            throw new RuntimeException(exception);
        }
        return (Field1) object;
    }

}

//深拷贝
public class DeepPrototype implements Cloneable {

    private int x;
    private int y;
    private int z;
    private Field1 field;

    public DeepPrototype() {
        this.x = 2;
        this.y = 3;
        this.z = 4;
        this.field = new Field1();
        this.field.setA(5);
    }

    public Field1 getField1() {
        return field;
    }

    protected DeepPrototype clone() {
        Object object = null;
        try {
            object = super.clone();
            ((DeepPrototype)object).field = this.field.clone();
        } catch (CloneNotSupportedException exception) {
            throw new RuntimeException(exception);
        }
        return (DeepPrototype) object;
    }

    public String toString() {
        return "[" + x + "," + y + "," + z + "," + field.getA() + "]";
    }

    public static void main(String[] args) {
        DeepPrototype prototype1 = new DeepPrototype();
        System.out.println(prototype1);
        System.out.println(prototype1.getField1());
        DeepPrototype prototype2 = prototype1.clone();
        System.out.println(prototype2);
        System.out.println(prototype2.getField1());
    }

}