package com.zyk.prototype;



/*
 * 定义：用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
 * 
 * 使用场景：
 * 1、对象的创建非常复杂，可以使用原型模式快捷的创建对象。
 * 2、在运行过程中不知道对象的具体类型，可使用原型模式创建一个相同类型的对象，或者在运行过程中动态的获取到一个对象的状态。
 * 
 * 优点：
 * 1、由于clone方法是由虚拟机直接复制内存块执行，所以在速度上比使用new的方式创建对象要快。 
 * 2、可以基于原型，快速的创建一个对象，而无需知道创建的细节。
 * 3、可以在运行时动态的获取对象的类型以及状态，从而创建一个对象。
 */
public class Prototype implements Cloneable {

	private int x;
	private int y;
	private int z;
	
	public Prototype() {
		this.x = 2;
		this.y = 3;
		this.z = 4;
	}
	
	public void change() {
		this.x = 9;
		this.y = 8;
		this.z = 7;
	}
	
	public Prototype clone() {
		Object object = null;
		
		try{
			object = super.clone();
		} catch (CloneNotSupportedException exception) {
			// TODO: handle exception
			throw new RuntimeException(exception);
		}
		
		return (Prototype) object;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[" + x + "," + y + "," + z + "]";
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prototype p1 = new Prototype();
		p1.change();
		System.out.println(p1);
		Prototype p2 = p1.clone();
		System.out.println(p2);
	}

}
