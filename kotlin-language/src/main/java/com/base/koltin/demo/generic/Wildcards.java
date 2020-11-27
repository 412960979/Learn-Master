package com.base.koltin.demo.generic;

/**
 * 通配符
 * 常用的 T，E，K，V，？
 * 本质上这些个都是通配符，没啥区别，只不过是编码时的一种约定俗成的东西。比如上述代码中的 T ，
 * 我们可以换成 A-Z 之间的任何一个 字母都可以，并不会影响程序的正常运行，但是如果换成其他的字母代替 T ，
 * 在可读性上可能会弱一些。通常情况下，T，E，K，V，？是这样约定的：
 *
 * ？表示不确定的 java 类型
 *
 * T (type) 表示具体的一个java类型
 *
 * K V (key value) 分别代表java键值中的Key Value
 *
 * E (element) 代表Element
 *
 *
 * =====================================================================================
 * ？和 T 都表示不确定的类型，区别在于我们可以对 T 进行操作，但是对 ？不行，比如如下这种 ：
 *
 * // 可以
 * T t = operate();
 *
 * // 不可以
 * ？car = operate();
 *
 * 简单总结下：
 *
 * T 是一个 确定的 类型，通常用于泛型类和泛型方法的定义，？是一个 不确定 的类型，通常用于泛型方法的调用代码和形参，不能用于定义类和泛型方法。
 * =====================================================================================
 */
public class Wildcards {
}