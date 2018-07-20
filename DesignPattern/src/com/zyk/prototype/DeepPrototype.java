package com.zyk.prototype;

//���Ҫʵ����ȿ���������Ҫ��ʵ����Cloneable�ӿڲ���д��clone���������У����е���������Ҳȫ��ʵ��Cloneable�ӿڲ���дclone������������Ҫ���������͵�����ȫ������һ��
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

//���
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