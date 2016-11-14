package com.pingan.factorymethod;

/**
 * Author：liupeng264 on 2016/11/14 17:46
 * Address：liupeng264@pingan.com.cn
 *  工厂方法模式仿佛已经很完美的对对象的创建进行了包装，
 *  使得客户程序中仅仅处理抽象产品角色提供的接口，但使得对象的数量成倍增长。
 *  当产品种类非常多时，会出现大量的与之对应的工厂对象，这不是我们所希望的。
 */
public interface FactoryBMW {
    BMW createBMW();
}
