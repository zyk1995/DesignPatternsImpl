package com.zyk.Memento;


/*
 * 备忘录模式（Memento Pattern）保存一个对象的某个状态，
 * 以便在适当的时候恢复对象。备忘录模式属于行为型模式。
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
