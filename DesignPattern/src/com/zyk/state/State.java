package com.zyk.state;

/*
*允许一个对象在其内部状态改变时改变它的行为，对象看起来似乎修改了它的类。状态模式是一种对象行为型模式
*/
public interface State {

    public void doAction(Context context);
}
