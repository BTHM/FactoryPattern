package com.pingan.factorymethod;

/**
 * Author：liupeng264 on 2016/11/14 17:45
 * Address：liupeng264@pingan.com.cn
 */
public class FactoryBMW523 implements FactoryBMW {
    @Override
    public BMW523 createBMW() {

        return new BMW523();
    }
}
