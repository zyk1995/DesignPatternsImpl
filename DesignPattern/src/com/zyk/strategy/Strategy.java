/**
 * 
 */
package com.zyk.strategy;

/**
 * @author zyk
 * 策略模式定义了一系列的算法，并将每一个算法封装起来，而且使它们还可以相互替换。策略模式让算法独立于使用它的客户而独立变化。
 */
public interface Strategy {
	void algorithm();
}
